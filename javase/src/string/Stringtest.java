package string;

public class Stringtest {
	public static void main(String[] args) {
		 
        String a1 = "abcd";
        String a2 = "abcd";
        System.out.println(a1 == a2);
        a2.toUpperCase();
        System.out.println(a1 == a2);
 
        String b1 = "abcd";
        String b2 = "ab" + "cd";
        System.out.println(b1 == b2);
         
        String c1 = "abcd";
        String c21 = "cd";
        String c2 = "ab" + c21;
        System.out.println(c1 == c2);
         
        String d1 = new String("abcd");
        String d2 = new String("abcd");
        System.out.println(d1 == d2);
    }
 
}
