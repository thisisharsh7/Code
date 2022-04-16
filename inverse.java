import java.util.*;
public class inverse {
    public static void main(String[] args){
        System.out.println("Input no. will be inverse.");
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        scn.close();
        int count=0;
        int reverse=0;
        int div;
        while(x!=0){
           div=x%10;
           count++;
           reverse+=count*(int)Math.pow(10,div-1);
           x=x/10;

        }
        System.out.println(reverse);

    }
    
}
