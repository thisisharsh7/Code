import java.util.*;
public class nextsmallertoleft {
    public static int[] sel(int[] arr){
        int[] result=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
               result[st.peek()]=arr[i];
               st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            result[st.peek()]=0;
            st.pop();
        }
        return result;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        int[] result=sel(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println("Next smaller of "+arr[i]+" is "+result[i]);
        }
    }
    
}
