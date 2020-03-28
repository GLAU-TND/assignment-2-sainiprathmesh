/*
 *   Created by IntelliJ IDEA.
 *   User: prathmesh
 *   Date: 28/03/20
 *   Time: 5:35 PM
 */
package problem2.main;

import problem4.myqueue.MyQueue;

public class Methods {
    private MyQueue pre, post;

    public Methods() {

        pre = new MyQueue();
        post = new MyQueue();
    }

    public MyQueue getPre() {
        return pre;
    }

    public void setPre(MyQueue pre) {
        this.pre = pre;
    }

    public MyQueue getPost() {
        return post;
    }

    public void setPost(MyQueue post) {
        this.post = post;
    }
}
