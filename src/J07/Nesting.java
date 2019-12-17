package J07;

public class Nesting {
    public static void main(String[] args) {
        MovieTheatre a = new MovieTheatre("PVR Phoenix", "Panasonic", true);
        System.out.println("Two classes : "+a);
        MovieTheatreNested b = new MovieTheatreNested("PVR Phoenix", "Panasonic", true);
        System.out.println("Static nested: "+b);
        MovirTheatreInner c = new MovirTheatreInner("PVR phoenix", "Panasonic", true);
        System.out.println("Inner nested: "+c);

    }
}
