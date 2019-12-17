package J03;

public class Boolean {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println("a: "+a);
        boolean b = false;
        System.out.println("b: "+b);
        java.lang.String s = "FAlse";
        boolean c = java.lang.Boolean.parseBoolean(s);
        System.out.println("c: "+c);
    }
}
