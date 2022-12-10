import unit4.collectionsLib.*;

public class sortStack {
    public static Stack<Integer> sort (Stack<Integer> s) {
        Stack<Integer> temp = new Stack<Integer>();
        System.out.println("Now the Stack looks like so: \n" + s);
        while (!isSorted(s)) {
            int x = s.pop();
            int y = s.pop();
            if (x > y) {
                temp.push(y);
                temp.push(x);
            } else {
                temp.push(x);
                temp.push(y);
            }
            while (!s.isEmpty()) {
                int z = s.pop();
                if (z < temp.top()) {
                    int y1 = temp.pop();
                    temp.push(z);
                    temp.push(y1);
                } else temp.push(z);
                System.out.println("Now the Stack looks like so: \n" + s);
                System.out.println("temp - " + temp);
            }
            while (!temp.isEmpty()) s.push(temp.pop());
            System.out.println("Now the Stack looks like so: \n" + s);
        }
        System.out.println("Sorted Stack: " + s);
        return s;
    }

    private static boolean isSorted(Stack<Integer> s) {
        boolean flag = true;
        Stack<Integer> temp = new Stack<Integer>();
        int x = s.pop();
        int y = s.pop();
        if (x > y) {
            s.push(y);
            s.push(x);
            return false;
        }
        else {
            temp.push(x);
            temp.push(y);
        }
        while(!s.isEmpty() && flag) {
            x = s.pop();
            if (x < temp.top()) {
                flag = false;
                s.push(x);
            }
            else temp.push(x);
            System.out.println("Now the Stack looks like so: \n" + s);
            System.out.println("temp - " + temp);
        }
        while (!temp.isEmpty()) s.push(temp.pop());
        return flag;
    }
}
