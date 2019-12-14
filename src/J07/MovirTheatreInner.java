package J07;

public class MovirTheatreInner {
    String name;
    ProjectorInner projector;
    public class ProjectorInner {
        private String model;
        private boolean imax;

        ProjectorInner(String model, boolean imax) {
            this.model = model;
            this.imax = imax;

        }

        @Override
        public String toString() {
            return "projector model: " + model + " is imax " + imax;
        }
    }
        public MovirTheatreInner(String name, String model, boolean imax){
                this.name = name;
                this.projector = new ProjectorInner(model,imax);
        }
        @Override
    public String toString(){
        return "Movie theatre: "+name+ " has a "+projector;
        }
    }

