import java.util.*;
public class javafirstpattern {
    public static void main(String[] args){
        System.out.println("Input will give stair pattern.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
    
}
