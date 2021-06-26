package com.knowledge.tree

fun main() {
    val root = Node(1)
    root.left = Node(2)
    root.right = Node(2)
    val right = root.right
    right?.right = Node(2)

    println(isBST(root))
    printInOrder(root)
}

fun isBST(root: Node): Boolean {
    return isBSTUtil(root, Int.MIN_VALUE, Int.MAX_VALUE)
}

fun isBSTUtil(root: Node?, min: Int, max: Int): Boolean {
    if (root == null) return true
    return if (root.data in min..max) {
        isBSTUtil(root.left, min, root.data) && isBSTUtil(root.right, root.data, max)
    } else {
        false
    }
}
