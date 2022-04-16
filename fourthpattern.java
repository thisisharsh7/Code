import java.util.*;
public class fourthpattern {
    public static void main(String[] args){
        System.out.println("fourth downward pattern as input.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        int str=x;
        int spc=0;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            str--;
            spc++;
            System.out.println("");
        }
    }
    
}
