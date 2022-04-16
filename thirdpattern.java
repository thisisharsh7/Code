import java.util.*;
public class thirdpattern {
    public static void main(String[] args){
        System.out.println("Right aligned patter as per given input.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        int str=1;
        int spc=x-1;
        for(int i=1;i<=x;i++){
         for(int j=1;j<=spc;j++){
             System.out.print("\t");
         }
         for(int j=1;j<=str;j++){
             System.out.print("*\t");
         }
         spc--;
         str++;
         System.out.println("");
         
        }
    }
    
}
