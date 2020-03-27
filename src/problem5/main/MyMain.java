/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCircularQueue myCircularQueue;
        myCircularQueue = new MyCircularQueue();
        System.out.println("Enter the size of Student list");
        int size = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            sc.nextLine();
            System.out.println("ENTER THE STUDENT NAME");
            String s = sc.nextLine();
            System.out.println("ENTER THE NUMBER OF BACKLOGS");
            int b = sc.nextInt();
            Student student = new Student(s, b);
            myCircularQueue.enqueue(student);
        }
    }
}
