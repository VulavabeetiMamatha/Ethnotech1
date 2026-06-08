package strings;

public class LongestWord03 {
    public static void main(String args[])
    {
        String str="i love to code in java programming";
        String words[]=str.split(" ");
        int max=0;
        StringBuilder lon=new StringBuilder();
        for(String s:words)
        {
            int l=s.length();
            max=Math.max(max,l);
            if(max==l)
            {
                lon.setLength(0);
                lon.append(s);
            }
                
        }
        System.out.println(lon);
    }
}
