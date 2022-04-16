import java.util.*;
public class javafunction1{
    public static int df(int n,int f){
        int count=0;
        while(n>0){
            int r;
            r=n%10;
            if(r==f){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int f=obj.nextInt();
        obj.close();
        int ans=df(n,f);
        System.out.println(ans);

    }
    
}
