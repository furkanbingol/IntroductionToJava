public class stringMethods {
    public static void main(String[] args) {
        String s0 = "Furkan";  //"Furkan" created in RAM, s0 and s1 point to the SAME REFERENCE(in Java) 
        String s1 = "Furkan";
        String s2 = new String("Kevin");
        
        System.out.println("length of s2: " + s2.length());
        System.out.println("0.index of s2: " + s2.charAt(0));
        System.out.println("Last index of s2: " + s2.charAt(s2.length() - 1));
        
        System.out.println(s2.startsWith("Ke")); //if s2 start with "Ke" returns True, else False
        System.out.println(s2.endsWith("in"));   //if s2 end with "in" returns True, else False
        
        if (s0 == s1)
            System.out.println("same reference");
        else
            System.out.println("not same reference");
    }
}
