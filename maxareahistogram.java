import java.util.*;
public class maxareahistogram {
    public static int maxarea(int[] arr){
        int max=0;
        //rhs
        int[] rb=new int[arr.length];//nse index on the right
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        rb[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                 rb[i]=arr.length;
            }else{
                rb[i]=st.peek();
            }
            st.push(i);
        }
        //lhs
        int[] lb=new int[arr.length];//nse index on the left
        st=new Stack<>();
        st.push(0);
        lb[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }else{
                lb[i]=st.peek();
            }
            st.push(i);
        }
        //max
        for(int i=0;i<arr.length;i++){
            int width=rb[i]-lb[i]-1;
            int area=arr[i]*width;
            if(area>max){
                max=area;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        int reqarea=maxarea(arr);
        System.out.println(reqarea);
    }
    
}
