import java.util.*;
public class elementinarray {
    public static void main(String[] args){
        int[] arr;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        int x=obj.nextInt();
        obj.close();
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                ans=i+1;
                break;
            }
        }
        System.out.println(ans);
    }
    
}
