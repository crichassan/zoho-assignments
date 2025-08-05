//Define a method to convert the decimal number to a binary number?
package Day2.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(deciToBin(n));
    }
    public static List<Integer> deciToBin(int n){
        List<Integer> ls = new ArrayList<>();
        while(n>0){
            ls.add(n%2);
            n=n/2;
        }
        Collections.reverse(ls);
        return ls;
    }
}
