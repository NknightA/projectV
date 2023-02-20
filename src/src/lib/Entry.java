package lib;

import java.util.Arrays;
import java.util.Scanner;

public class Entry {
    public static void main () {
        Load ii = new Load();
        System.out.println(ii.enter);
        Sub.sub();
    }
}

class Load {
    Scanner sc = new Scanner(System.in);
    String enter = sc.next();
}

class Sub {
    public static void sub () {
        String [] S = new String[3];
        S[0] = "a";
        S[1] = "a";
        S[2] = "a";
        System.out.println(Arrays.toString(S));
    }
}
