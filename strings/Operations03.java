package strings;

import java.util.*;
public class Operations03 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(binaryop(s));
    }
    public static int binaryop(String s)
    {
        int res=s.charAt(0)-'0';
        for(int i=1;i<s.length();i+=2)
        {
            int value=s.charAt(i+1)-'0';
            char ch=s.charAt(i);
            if(ch=='A')
                res=res & value;
            else if(ch=='B')
                res=res | value;
            else if(ch=='C')
                res=res ^ value;
        }
        return res;
    }
}
