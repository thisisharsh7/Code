import java.util.*;
public class rotate {
    public static void main(String[] args){
        System.out.println("Input no. will rotate by input rotation.");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        obj.close();
        int count=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        k=k%count;
        if(k<0){
            k=k+count;
        }
        int power=(int)Math.pow(10,k);
        int q=n/power;
        int r=n%power;
        power=(int)Math.pow(10,count-k);
        System.out.println((r*power)+q);
    }
    
}
