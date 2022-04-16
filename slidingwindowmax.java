import java.util.*;
public class slidingwindowmax {
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=obj.nextInt();
    }
    int k=obj.nextInt();
    obj.close();
    int[] result=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        result[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                result[i]=arr.length;
            }else{
                result[i]=arr[st.peek()];
            }
            st.push(i);
            }
            int j=0;
        for(int i=0;i<arr.length-k;i++){
            if(j<i){
                j=i;
            }
            while(result[j]<i+k){
                j=result[j];
            }
            System.out.println(arr[j]);
        }
    }
    
}
