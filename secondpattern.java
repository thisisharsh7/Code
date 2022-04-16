import java.util.*;
public class secondpattern {
    public static void main (String[] args){
        System.out.println("Second downward patern as a given input.");
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        scn.close();
        for(int i=x;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*\t");
        }
        System.out.println("");
    }
    }
    
}
