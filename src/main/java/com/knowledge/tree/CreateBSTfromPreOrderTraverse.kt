package com.knowledge.tree

import java.util.*

fun main() {
    val root = createBST(arrayOf(10, 5, 1, 7, 40, 50))
    printPreOrder(root)
}

fun createBST(arr: Array<Int>): Node {
    val root = Node(arr[0])
    val stack = LinkedList<Node>()
    stack.push(root)

    var i = 1
    while (i < arr.size) {
        var temp: Node? = null
        while (!stack.isEmpty() && arr[i] > stack.peek().data) {
            temp = stack.pop()
        }

        if (temp != null) {
            temp.right = Node(arr[i])
            stack.push(temp.right)
        } else {
            temp = stack.peek()
            temp.left = Node(arr[i])
            stack.push(temp.left)
        }
        i++
    }
    return root
}
