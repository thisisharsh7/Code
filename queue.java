import java.util.*;
public class queue {
    public static void main(String[] args){
          Queue<Integer> q=new ArrayDeque<>();
          q.add(10);
          System.out.println(q);
          q.add(20);
          System.out.println(q);
          q.add(30);
          System.out.println(q);
          q.add(40);
          System.out.println(q);
          System.out.println("removing from the first in");
          System.out.println(q.peek());
          q.remove();
          System.out.println(q);
          q.remove();
          System.out.println(q);
          q.remove();
          System.out.println(q);
    }
}
