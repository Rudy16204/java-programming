// public class reverseusingpositive {
//     public static void reverse(String str)
//     {
//         String rev = "";
//         int len = str.length();
//         for(int i=0;i<len;i++)
//         {
//             rev=rev+ str.charAt(len-i-1);
//         }
//         System.out.print("The reveresed string is:"+rev);
//     }
//     public static void main(String[] args) {
//         String str = "apple";
//         reverse(str);
//     }
// }

public class reverseusingpositive {
    public static void reverse(String str)
    {
        String rev = "";
        int len = str.length();
        for(int i=len;i>0;i--)
        {
            rev=rev+ str.charAt(i-1);
        }
        System.out.print("The reveresed string is:"+rev);
    }
    public static void main(String[] args) {
        String str = "apple";
        reverse(str);
    }
}

