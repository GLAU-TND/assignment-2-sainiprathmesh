/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode() {
        System.out.print("Enter integer value : ");
        try {
            data = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            e.getMessage();
            System.exit(-1);
        }
        left = right = null;

    }
}
