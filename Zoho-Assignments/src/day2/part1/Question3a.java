package day2.part1;

public class Question3a {

	public static void main(String[] args) {
        int n=5;
        int one=1;
        int temp=n;
        int inc=1;

        for(int row=1;row<=n;row++){
            int spaceCond=row<=(n/2)+1?(n-row)-2:one++;
            for(int space=1;space<=spaceCond;space++){
                System.out.print(" ");
            }
            int colCond=row<=(n/2)+1?(row*2)-1:temp-2;
            for(int col=1;col<=colCond;col++){
                if(col%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print(inc++);
                }
            }
            if(!(row<=(n/2)+1)){
                temp=temp-2;
            }
            System.out.println();
        }

	}

}
