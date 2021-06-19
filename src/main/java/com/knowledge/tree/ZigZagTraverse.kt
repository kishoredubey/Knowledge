package com.knowledge.tree

import java.util.*

fun printZigZagBST(root: Node?) {
    val stack1 = LinkedList<Node>()
    val stack2 = LinkedList<Node>()
    stack1.push(root)
    while (!stack1.isNullOrEmpty() || !stack2.isNullOrEmpty()) {
        while (!stack1.isNullOrEmpty()) {
            val temp = stack1.remove()
            print("${temp.data} ")
            if (temp?.left != null) stack2.push(temp.left)
            if (temp?.right != null) stack2.push(temp.right)
        }
        while (!stack2.isNullOrEmpty()) {
            val temp = stack2.remove()
            print("${temp.data} ")
            if (temp?.left != null) stack1.push(temp.left)
            if (temp?.right != null) stack1.push(temp.right)
        }
    }
}