package J07;

public class MovieTheatre {
    String name;
    projector Projector;
    public MovieTheatre(String name, String model, boolean imax){
        this.name = name;
        this.Projector = new projector(model, imax, this);

    }
    @Override
    public String toString(){
        return "Theatre "+name+" has a projector "+Projector;
    }
}
