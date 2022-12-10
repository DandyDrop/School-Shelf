import java.util.Stack;

public class mahsanitLES {
    public static boolean somePractice(Stack<Integer> s1, Stack<Integer> s2) {
        boolean bool = true;
        Stack<Integer> temp = new Stack<Integer>();
        while (!s1.isEmpty() && bool == true) {
            int x = s1.pop();
            if (!ezer(s2, x)) bool = false;
            temp.push(x);
        }
        while (!temp.isEmpty()) s1.push(temp.pop());
        return bool;
    }
    
    public static boolean ezer(Stack<Integer> s2, int val) {
        boolean bool = false;
        Stack<Integer> temp = new Stack<Integer>();
        while(!s2.isEmpty() && bool == false) {
            int x = s2.pop();
            if (x == val) bool = true;
            temp.push(x);
        }
        while (!temp.isEmpty()) s2.push(temp.pop());
        return bool;
    }
}
