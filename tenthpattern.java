import java.util.*;
public class tenthpattern {
    public static void main(String[] args){
        System.out.println("tilted square type pattern.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        int os=x/2;
        int is=-1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=os;j++){System.out.print("\t");}
            System.out.print("*\t");
            for(int j=1;j<=is;j++){System.out.print("\t");}
            if(i>1 && i<x){System.out.print("*\t");}
            System.out.println("");
            if(i<=x/2){
                os--;
                is+=2;
            }
            else{os++;
            is-=2;}
        }
    }
    
}
