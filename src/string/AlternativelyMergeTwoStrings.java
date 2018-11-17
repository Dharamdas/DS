package string;

public class AlternativelyMergeTwoStrings {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "zsd";   //azbsd
        System.out.println(merge(s1, s2));
        System.out.println(alternate(s1,s2));

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
        while(i!=s1.length())
            finalString.append(i++);
        while(j!=s2.length())
            finalString.append(j++);
        return finalString.toString();
    }


   static String alternate(String a, String b){

        StringBuilder builder = new StringBuilder();
        final int greaterLength = a.length() > b.length() ? a.length() : b.length();

        for(int i = 0; i < greaterLength; i++)
        {
            if (i < a.length()) {
                builder.append(a.charAt(i));
            }
            if (i < b.length()) {
                builder.append(b.charAt(i));
            }
        }
        return builder.toString();
    }

}
