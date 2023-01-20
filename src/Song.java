public class Song {
   private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


    // tostring is basically used for printing
    // something different like adding title and duration instead of address
    @Override
    public String toString() {
        return "Now we are listening Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
