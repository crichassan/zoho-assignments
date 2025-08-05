// Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
//X[] =('m', 'n', 'o', 'p'} and
//Y[] =('m', 'n', 'o', 'p' }
package day2.part2;

public class Question5 {

	public static void main(String[] args) {
		
		char[] x ={'m', 'n', 'e', 'p'};
        char[] y ={'m', 'n', 'o', 'p' };
        if(x.length != y.length) {
            System.out.println("This Array is not Indential");
            return;
        }

        int left =0;
        int right =0;
        boolean check = false;
        int len = x.length;
        while(left <len && right<len){
            if(x[left] == y[right]){
                check = true;
                right++;
                left++;
        }
            else{
                System.out.println("This Array is not Indential");
        return;
        }

    }
        if(check){
            System.out.println("This Array is Indential");
        }
        else{
            System.out.println("This Array is not Indential");
        }
	}

}
