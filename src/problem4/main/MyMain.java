/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree m = new MyBinarySearchTree();
        Methods mthds = new Methods();
        MyQueue q = new MyQueue();
        mthds.setPre(q);

        //setting up the root
        m.setRoot();

        //inserting into the tree
        for (int i = 0; i < 5; i++) {
            m.insert(m.getRoot());
        }

        //method to print preorder Successor of given Node
        /*
        preorder method in
         */
        mthds.preOrder(m.getRoot());
        q.queuePrint(q);
        System.out.print("Enter value of which you want to find preorder Successor : ");
        System.out.println(q.getSuccessor(sc.nextInt()));

    }
}
