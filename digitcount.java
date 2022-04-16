import java.util.*;
public class digitcount {
    public static void main(String[] args){
        System.out.println("Enter the no. whose digit is to be counted.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int count=0;
        obj.close();
        while(x!=0){
            x=x/10;
            count++;        }
        System.out.println(count);
    }
}
