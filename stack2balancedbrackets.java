import java.util.*;
public class stack2balancedbrackets {
    
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        Stack<Character> st=new Stack<>();
        obj.close();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' ||ch=='[' ||ch=='{'){
                st.push(ch);
            }else if(ch==')'){
               boolean val=check(st,'(');
               if(val==false){
                   System.out.println(val);
                   return;
               }
            }else if(ch=='}'){
               boolean val=check(st,'{');
               if(val==false){
                System.out.println(val);
                return;
            }
            }else if(ch==']'){
               boolean val=check(st,'[');
               if(val==false){
                System.out.println(val);
                return;
            }
            }
        }
        if(st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
    public static boolean check(Stack<Character> st,char corch){
        if(st.size()==0){
            
            return false;
        }else if(st.peek()!=corch){
            
            return false;
        }else{
            st.pop();
            return true;
        }
    }
    
}
