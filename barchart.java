import java.util.*;
public class barchart {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int[] arr;
        int n=obj.nextInt();
        arr=new int[n];
        for(int i=0;i<arr.length;i++){
             arr[i]=obj.nextInt();
        }
        obj.close();
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){max=arr[i];}
        }
        for(int i=max;i>=1;i--){
                for(int j=0;j<n;j++){
                  if(arr[j]>=i){System.out.print("*\t");}
                  else{System.out.print("\t");}
            }
            System.out.println();
        }
    }
        
}
    

