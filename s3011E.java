import java.util.Scanner;
import unit4.collectionsLib.*;
public class s3011E {
    
    public static boolean ifPolynomial1(String st) {
        return ezer(st, 0);
    }
    
    private static boolean ezer(String st, int i) {
        if(i > st.length() / 2) return true;
        return st.charAt(i) == st.charAt(st.length() - 1) && ezer(st, i++);
    }
    
    public static boolean ifPolynomial2(String st) {
        if(st.length() == 0 || st.length() == 1) return true;
        return st.charAt(0) == st.charAt(st.length() - 1) && ifPolynomial2(st.substring(1, st.length() - 1));
    }
    
    public static int howMuchTimesIn(String st, char tav) {
        if(st.length() == 0) return 0;
        if(st.charAt(0) == tav) return  1 + howMuchTimesIn(st.substring(1), tav);
        return howMuchTimesIn(st.substring(1), tav);
    }

    
    
    
    public static int countCells(String[] a) {
        return ezerCountCells(a, 0);
    }
    
    private static int ezerCountCells(String[] a, int i) {
        if(i == a.length - 1) return 0;
        if(a[i].charAt(a[i].length() - 1) != a[i + 1].charAt(0)) return 1 + ezerCountCells(a, ++i);
        return ezerCountCells(a, ++i);
    }
    
    
    

    public static int countRStrings(int[][] a) {
        return ezercountRS1(a, 0);
    }

    private static int ezercountRS1(int[][] a, int i) {
        if (i == a.length) return 0;
        if (ezercountRS2(a[i], 0)) return 1 + ezercountRS1(a, ++i);
        return ezercountRS1(a, ++i);
    }

    private static boolean ezercountRS2(int[] b, int i) {
        if(i == b.length) return true;
        return b[i] >= 50 && ezercountRS2(b, ++i);
    }
    
    
    
    
    public static boolean divisibleBy3WithoutRemainder(int num) {
        if(num == 0) return true;
        return (num%10%3 == 0) && divisibleBy3WithoutRemainder(num / 10);
    }
    
    
    
    public static boolean chIfMoreB2(int i) {
        if(i < 10) return true;
        if(Math.abs(i % 10 - i/10%10) > 2) return false;
        return chIfMoreB2(i / 10);
    }
    
    
    
    public static boolean chIfAllMoreB2ThInAnother(int a, int b) {
        if(a == 0 && b == 0) return true;
        if(a != 0 && b == 0 || a == 0 && b != 0) return false;
        return b % 10 == a % 10 * 2 && chIfAllMoreB2ThInAnother(a / 10, b / 10);
    }
    
    
    
    
    public static boolean chSumDigits(int[] a) {
        return ezerChSumDigits(a, 0, 0);
    }
    
    private static boolean ezerChSumDigits(int[] a, int i, int c) {
        if (a.length == i) return c >= 2;
        if (sumDigits(a[i]) > 10) return ezerChSumDigits(a, ++i, ++c);
        return ezerChSumDigits(a, ++i, c);
    }
    
    private static int sumDigits(int num) {
        if(num == 0) return 0;
        return num % 10 + sumDigits(num / 10);
    }
}

