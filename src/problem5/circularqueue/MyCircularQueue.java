/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private int size;

    public MyCircularQueue() {
        rear = null;
        size = 0;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);

    }
}
