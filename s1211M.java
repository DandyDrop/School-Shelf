public static Stack<Integer> remove(Stack<Integer> s, int value) {
        while(!s.isEmpty()) {
            int x = s.pop();
            if (x != value) temp.push(x);
        }
        
        while(!temp.isEmpty()) s.push(temp.pop());
        return s;
    }
