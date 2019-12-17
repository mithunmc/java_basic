package J07;

public class projector {
    private String model;
    private boolean imax;
    private MovieTheatre screen;

    projector(String model, boolean imax, MovieTheatre screen){
        this.model = model;
        this.imax = imax;
        this.screen = screen;
    }
    @Override
    public String toString(){
        return "Model : "+model+" is imax "+imax+ " in screen "+ screen.name;
    }
}
