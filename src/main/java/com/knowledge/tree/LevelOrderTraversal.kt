package com.knowledge.tree

import java.util.*

fun main() {
    val root = createBST(arrayOf(10, 5, 1, 7, 40, 50))
    levelOrderTraverse(root)
}

fun levelOrderTraverse(root: Node) {
    if (root == null) return

    val queue = LinkedList<Node>()
    queue.add(root)
    while (!queue.isNullOrEmpty()) {
        val temp = queue.remove()
        print("${temp.data} ")
        if (temp.left != null) queue.add(temp.left!!)
        if (temp.right != null) queue.add(temp.right!!)
    }
}