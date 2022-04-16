import java.util.*;
public class bulbtoggle {
    public static void main(String[] args){
        System.out.println("Taking input no. of bulbs which is equal to fluctuation output showing how many bublbs are still on.");
        Scanner obj=new Scanner(System.in);
        int b=obj.nextInt();
        obj.close();
        for(int i=1;i*i<=b;i++){
           System.out.println(i*i);
        }

    }
    
}
