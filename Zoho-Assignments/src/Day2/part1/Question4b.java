//b) ZOHO
//CORP
//ORAT
//IONS
package Day2.part1;

public class Question4b {
	public static void main(String[] args) {
    String s = "ZOHOCORPORATIONS";
    int i=0;
    do{
        if(i>0 && i%4==0){
            System.out.println();
        }
        System.out.print(s.charAt(i));
        i++;
    }while(i<s.length());
}

}
