package J06;

public class Methods {
    public static void boo(){
        int x = 12;
        System.out.println("Boo!");
    }
    static void add(int x, int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        boo();
        System.out.println(x);
        add(x,5);
    }
}
