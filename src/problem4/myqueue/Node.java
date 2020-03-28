/*
 *   Created by IntelliJ IDEA.
 *   User: prathmesh
 *   Date: 28/03/20
 *   Time: 5:27 PM
 */
package problem4.myqueue;

import problem1.node.TreeNode;

public class Node {
    private TreeNode node;
    private Node next;

    public Node() {
        node = new TreeNode();
        next = null;
    }

    public Node(TreeNode treenode) {
        node = treenode;
        next = null;
    }
}
