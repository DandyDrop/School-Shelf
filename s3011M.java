import java.util.Scanner;
import unit4.collectionsLib.*;
class only2NSt{
    public static void stackChecker(Stack<Integer> i){
        // forms new stack that contains only the nums that devide by 2 and not by 5
        Stack<Integer> temp = new Stack<Integer>();
        while(!i.isEmpty()){
            int x = i.pop();
            if (x%2 == 0 || !(x%5 == 0)) temp.push(x);
        }
    }
    
    
    
    public static boolean stringChecker(String a, String b) {
        return ezer(a, b);
        
    }
    
    private static boolean ezer(String a, String b) {
        // checks if all characters of string a are in string b
        if(a.length()==0) return true;
        if(b.indexOf(a.charAt(0))==-1) return false;
        return ezer(a.substring(1),b);
    }
}
