import java.util.*;
public class nextgreaterelement {
    public static int[] nge(int[] arr){
        int[] result=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        // result[arr.length-1]=-1;
        // st.push(arr[arr.length-1]);
        // for(int i=arr.length-2;i>=0;i--){
        //    while(st.size()>0 && arr[i]>=st.peek()){
        //        st.pop();
        //    }
        //    if(st.size()==0){
        //        result[i]=-1;
        //    }else{
        //        result[i]=st.peek();
        //    }
        st.push(0);
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                result[st.peek()]=arr[i];
                st.pop();
            }

            st.push(i);
        }
        while(st.size()>0){
            int post =st.peek();
            result[post]=-1;
            st.pop();
        }

        
        return result;
    }
  public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=obj.nextInt();
      }
      obj.close();
      int[] result=nge(arr);
      for(int i=0;i<result.length;i++){
          System.out.println("Next greater for "+arr[i]+" is "+result[i]);
      }
  }
}
