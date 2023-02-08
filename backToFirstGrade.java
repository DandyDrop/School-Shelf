import java.util.*;

public class backing {
  public static void main(String[] args) {
    for (int i = 100; i < 1000; i++) if ((i % 10) + (i / 100) == (i/10%10)) System.out.println(i);
  }
}

public class zonina {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      System.out.println(i);
      int p = 1;
      for (int j = 2 j < i + 1; i++) p = p * j;
      System.out.println(i+ " : " +p)
    }
  }
}


