import java.util.*;
public class stockspan {
    public static int[] stpan(int[] arr){
        int[] result=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        result[0]=1;
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                     st.pop();
                     
            }if(st.size()==0){
                result[i]=result[i+1];
            }else{

                result[i]=i-st.peek();
            }
            st.push(i);
        }

        return result;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        int[] result=stpan(arr);
        for(int i=0;i<n;i++){
            System.out.println("Span of "+arr[i]+" is "+result[i]);
        }

    }
    
}
