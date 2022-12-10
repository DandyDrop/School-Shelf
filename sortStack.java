import unit4.collectionsLib.*;

public class sortStack {
    public static Stack<Integer> sort (Stack<Integer> s) {
        Stack<Integer> temp = new Stack<Integer>();
        System.out.println("Now the Stack looks like so: \n" + s);
        while (!isSorted(s)) {
            while (!s.isEmpty()) {
                if (temp.isEmpty()) temp.push(s.pop());
                int x = s.pop();
                if (x < temp.top()) {
                    int y = temp.pop();
                    temp.push(x);
                    temp.push(y);
                } else temp.push(x);
                System.out.println("Now the Stack looks like so: \n" + s);
                System.out.println("temp - " + temp);
            }
            while (!temp.isEmpty()) s.push(temp.pop());
            System.out.println("Now a bit sorted Stack looks like so: \n" + s);
        }
        System.out.println("Sorted Stack: " + s);
        return s;
    }

    public static boolean isSorted(Stack<Integer> s) {
        boolean flag = true;
        Stack<Integer> temp = new Stack<Integer>();
        while (!s.isEmpty() && flag) {
            if (temp.isEmpty()) temp.push(s.pop());
            int x = s.pop();
            if (x < temp.top()) {
                flag = false;
                s.push(x);
            } else temp.push(x);
            System.out.println("Now the Stack looks like so: \n" + s);
            System.out.println("temp - " + temp);
        }
        while (!temp.isEmpty()) s.push(temp.pop());
        return flag;
    }
}
