import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner S=new Scanner(System.in);
        String A=S.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder a=new StringBuilder(A);
    a.reverse();
    if(A.equals(a.toString())){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    }
}