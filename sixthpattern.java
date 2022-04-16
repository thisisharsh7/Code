import java.util.*;
public class sixthpattern {
    public static void main(String[] args){
        System.out.println("Hollow shape star through the input no.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        int str=x/2+1;
        int spc=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=str;j++){System.out.print("*\t");}
            for(int j=1;j<=spc;j++){System.out.print("\t");}
            for(int j=1;j<=str;j++){System.out.print("*\t");}
            if(i<=x/2){str--;
                spc+=2;}
                else{str++;
                    spc-=2;}
                    System.out.println(" ");
        }
    }   
    
}
