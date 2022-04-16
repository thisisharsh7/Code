import java.util.*;
public class spanofanarray {
    public static void main(String[] args){
        int[] arr;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();}
        obj.close();
        int max=arr[0];
        int min=arr[n-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                 max=arr[i];}
                 else if(arr[i]<min){min=arr[i];}
        }
        int span=max-min;
        System.out.println(span);

    }
    
}
