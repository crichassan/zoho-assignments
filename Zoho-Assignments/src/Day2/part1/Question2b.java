//Write a program to do the following patterns using for loop?
//a) 1 1 R R R R
//1 1 R R
//1 R R R R
//1 1 R R
//1 1 R R
package Day2.part1;

public class Question2b {
	public static void main(String[] args) {
    int n=5;
    for(int row=0;row<=n;row++){
        for(int col=1;col<=n-1;col++){
            if(row==1 || row==3){
                System.out.print("R");
            }
            if(row==2 || row==5){
                if(col==1 || col==n-1){
                    System.out.print("R");
                }else {
                    System.out.print(" ");
                }
            }
            if(row==4){
                if(col==1 || col==n-2){
                    System.out.print("R");
                }else {
                    System.out.print(" ");
                }
            }

        }
        System.out.println();
    }
}
}


