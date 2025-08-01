//Write a program to find the first set bit of a number?
package Day1;

public class Question8 {

	public static void main(String[] args) {
		
		int num = 60;
        int count =1;
        //binary of 10 is 1010 and binary of 1 is 0001
        while((num & 1) ==0){
            num = num>>1; //right shift the binary number 1010 to 0101
            count++;
        }
        System.out.println(count);
	}

}
