import java.util.*;
public class eightpattern {
    public static void main(String[] args){
        System.out.println("Secondary diagonal pattern taking no. as input.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i+j==x+1){
                   System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                
            }
            System.out.println("");
        }
    }
}
