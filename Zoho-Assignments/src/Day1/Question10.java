//Write a program to check whether the object is an instance of a particular class?

package Day1;

class check{

}

public class Question10{
    public static void main(String[] args) {
        check obj = new check();
        Question10 obj1 = new Question10();

        System.out.println(obj1 instanceof Question10);
        System.out.println(obj instanceof check);
    }
}