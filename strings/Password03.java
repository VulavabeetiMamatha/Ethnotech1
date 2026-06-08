package strings;

import java.util.*;
public class Password03 {
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     System.out.println(CheckPAssword(s));
 }
 public static int CheckPAssword(String str)
 {
     if (str.matches("^(?![0-9])(?=.*[A-Z])(?=.*\\d)[^\\s/]{4,}$")) {
         return 1;
     } else {
         return 0;
     }
 }
}
