import java.util.*;
public class swastikpattern {
    public static void main(String[] args){
        System.out.println("Swastik pattern as per input.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==1){
                    if(j==x || j<=x/2+1){
                        System.out.print("*\t");
                    }
                else{System.out.print("\t");}}
                else if(i<=x/2){
                    if(j==x || j==x/2+1){
                        System.out.print("*\t");
                    }
                else{System.out.print("\t");}}
                
                else if(i==x/2+1){System.out.print("*\t");}
                else if(i<x){ if(j==1 || j==x/2+1){
                    System.out.print("*\t");
                }
            else{System.out.print("\t");}}
                else{ if(j==1 || j>=x/2+1){
                    System.out.print("*\t");
                }
            else{System.out.print("\t");}}

            }
            System.out.println("");
        }
    }
    
}
