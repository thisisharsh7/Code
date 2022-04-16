import java.util.*;
public class twelevthpattern {
    public static void main(String[] args){
        System.out.println("Fibonnaci sequence pattern in triangle.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int a=0;
        int b=1;
        obj.close();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
              System.out.print(a+"\t");
              int c=a+b;
              a=b;
              b=c;
            }
            System.out.println("");
        }
    }
    
}
