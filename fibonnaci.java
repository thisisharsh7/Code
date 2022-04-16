import java.util.*;
public class fibonnaci {
    public static void main(String[] args){
        System.out.println("First n fibonnaci no.'s where n is input.");
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int a=0;
        int b=1;
        int i=0;
        while(i<x){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        scn.close();

    }
    
}
