//1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
package Day3;

public class Question1 {
    String name;
    int roll_no;
    Question1(String name, int roll_no) {
        this.name=name;
        this.roll_no=roll_no;
    }
    public static void main(String[] args) {
    	Question1 obj = new Question1("John",2);
        System.out.println(obj.name);
        System.out.println(obj.roll_no);
    }
}
