package string;

public class AlternativelyMergeTwoStrings {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "forgeeks";
        System.out.println(merge(s1, s2));

    }

    public static String merge(String s1,String s2)
    {
        StringBuffer finalString = new StringBuffer();
        int i=0,j=0;
        while(i<s1.length() && j<s2.length())
        {
            finalString.append(s1.charAt(i++));
            finalString.append(s2.charAt(j++));
        }
        while(i<s1.length())
            finalString.append(i++);
        while(j<s2.length())
            finalString.append(j++);
        return finalString.toString();
    }
}
