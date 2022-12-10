public static void main(String[] args) {
      Stack<Integer> q=new Stack<Integer>();
      Scanner s = new Scanner(System.in); 
      int i = 5;
      q.push(12);
      q.push(i);
      System.out.println(q);
      System.out.println(q.pop());
      System.out.println(q);
      int u = 10;
      q.push(u);
      q.push(i);
      System.out.println(q);
      while (true) {
        System.out.println("Do u wanna play? 1. pop() 2. top() 3. isEmpty() 4. count Elements 5. sum 6. exists 10. Exit");
        int ans = s.nextInt();
        if (ans == 1) {
            System.out.println("Popped successfully : " + q.pop());
            System.out.println("Now the Stack looks like so: " + q);
        }
        
        if (ans == 2) {
            System.out.println("Top val : " + q.top());
            System.out.println("Now the Stack looks like so: " + q);
        }
        if (ans == 3) {
            String st = "";
            if (q.isEmpty()) st += "Empty";
            else st += "not Empty";
            System.out.println("The Stack is " + st);
        }
        
        if (ans == 4) System.out.println("Now we have " + counter(q) + " elements");
        if (ans == 5) System.out.println("The sum equals to " + sum(q));
        if (ans == 6) System.out.println("The statement ''" + sum(q));
        
        if (ans == 10) {
            break;
        }
        }
      
    }
    
    public static int counter(Stack<Integer> s) {
      Stack<Integer> temp = new Stack<Integer>();
      int co = 0;
      while (!s.isEmpty()) {
        temp.push(s.pop());
        co = co + 1;
        }
      while (!temp.isEmpty()) s.push(temp.pop());
      return co;
    }
    
    public static int sum(Stack<Integer> s) {
      Stack<Integer> temp = new Stack<Integer>();
      int sum = 0;
      while (!s.isEmpty()) {
        sum += s.top();
        temp.push(s.pop());
        }
      while (!temp.isEmpty()) s.push(temp.pop());
      return sum;
    }
    
    public static boolean exists(Stack<Integer> s, int x) {
        boolean flag = false;
        Stack<Integer> temp = new Stack<Integer>();
        while(!s.isEmpty() && flag == false) {
            x = s.pop();
            if (x== num) flag = true
            temp.push(x);
        }
        
        while (!temp.isEmpty()) s.push(temp.pop());
        return flag;
    }
