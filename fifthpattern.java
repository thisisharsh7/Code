import java.util.*;
public class fifthpattern {
    public static void main(String[] args){
        System.out.println("diamond pattern from a input no.");
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        scn.close();
        int sp=x/2;
        int str=1;
        for(int i=1;i<=x;i++){
          for(int j=1;j<=sp;j++){
              System.out.print("\t");
          }
          for(int j=1;j<=str;j++){
              System.out.print("*\t");
          }
          if(i<=x/2){sp--;
        str+=2;}
        else{
            sp++;
            str-=2;
        }
            System.out.println("");
        }
    }
    
}
