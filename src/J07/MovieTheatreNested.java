package J07;

public class MovieTheatreNested {
    String name;
    ProjectorStaticNested projector;

    static public class ProjectorStaticNested {
        private String model;
        private boolean hd;
        private MovieTheatreNested screen;

        ProjectorStaticNested(String model, boolean hd, MovieTheatreNested screen) {
            this.model = model;
            this.hd = hd;
            this.screen = screen;
        }

        @Override
        public String toString() {
            return "Model : "+model+" is imax "+hd+" in screen "+screen.name;
        }
    }


    public MovieTheatreNested(String name, String model, boolean hd) {
        this.name = name;
        this.projector = new ProjectorStaticNested(model, hd, this);
    }

    @Override
    public String toString() {
        return "Theatre "+ name + " has a projector "+projector;
    }
}
