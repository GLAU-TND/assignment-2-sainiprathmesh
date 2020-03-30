/*
 *   Created by IntelliJ IDEA.
 *   User: prathmesh
 *   Date: 27/03/20
 *   Time: 12:59 PM
 */
package problem3;

public class Student {
    private String name;
    private int rollNo;

    public Student(String s, int r) {
        name = s;
        rollNo = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        System.out.println("Student Name  " + getName());
        System.out.println("Student RollNo." + getRollNo());
        return "";
    }
}
