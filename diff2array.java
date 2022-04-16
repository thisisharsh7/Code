import java.util.*;
public class diff2array {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=obj.nextInt();
        }
        int n2=obj.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=obj.nextInt();
        }
        obj.close();
        int c=0;
        int[] diff=new int[n1];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
        while(k>=0){
            int d=0;
            int alv=i>=0?arr1[i]:0;
            if(arr2[j]+c>=alv){
                d=arr2[j]+c-alv;
                c=0;
            }else{
                d=arr2[j]+c+10-alv;
                c=-1;
            }
           diff[k]=d;
           i--;
           j--;
           k--;
        }
        int idx=0;
        while(idx<diff.length){
             if(diff[idx]==0){
                 idx++;
             }else{break;}
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
        

    }
    
}
