package day2.part1;

public class Question3b {

	public static void main(String[] args) {
        int n=5;
        int temp=1;
        for(int row=1;row<=n;row++){
            int colCond=row<=(n/2)+1?temp++:(n-row)+1;
            for(int col=1;col<=colCond;col++){
                System.out.print("W");
            }
            System.out.println();
        }

	}

}
