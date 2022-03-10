/*
byte    -- 1 byte
short   -- 2 byte
int     -- 4 byte
long    -- 8 byte
float   -- 4 byte
double  -- 8 byte
char    -- 2 byte
boolean -- 1 byte
String  -- [sizeof(char)*len] byte
*/
public class variables {
    public static void main(String[] args)
    {
        int a = 5;
        short b = 10;
        double c = 3.14;
        char d = 'D';
        boolean e = true;
        String f = "Furkan";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("Value of a: " + a);
    }
}
