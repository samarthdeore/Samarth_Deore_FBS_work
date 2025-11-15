abstract class Artist {
    String name;
    String genre;
    int experience; // in years

    Artist() {
        name = "Generic Artist";
        genre = "Unknown";
        experience = 1;
    }

    Artist(String n, String g, int exp) {
        name = n;
        genre = g;
        experience = exp;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getGenre() {
        return genre;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    int getExperience() {
        return experience;
    }

    void setExperience(int experience) {
        this.experience = experience;
    }

    void display() {
        System.out.println("Artist name is " + name);
        System.out.println("Genre is " + genre);
        System.out.println("Experience is " + experience + " years");
    }

    abstract void perform() ;
    
    public String toString() {
        return "Name: " + name +
               "\nGenre: " + genre +
               "\nExperience: " + experience + " years";
    }

}
//class Artist ends here
class Singer extends Artist {
    String vocalRange;

    Singer() {
        super();
        vocalRange = "Unknown";
    }

    Singer(String n, String g, int exp, String vr) {
        super(n, g, exp);
        vocalRange = vr;
    }

    String getVocalRange() {
        return vocalRange;
    }

    void setVocalRange(String vocalRange) {
        this.vocalRange = vocalRange;
    }

    void display() {
        super.display();
        System.out.println("Vocal range: " + vocalRange);
        System.out.println();
    }

    void perform() {
        System.out.println("Singer " + name + " is singing with a " + vocalRange + " vocal range.");
    }
    public String toString() {
        return super.toString() +
               "\nVocal Range: " + vocalRange;
    }

}
//class Singer ends here
class Dancer extends Artist {
    String style;

    Dancer() {
        super();
        style = "Unknown";
    }

    Dancer(String n, String g, int exp, String st) {
        super(n, g, exp);
        style = st;
    }

    String getStyle() {
        return style;
    }

    void setStyle(String style) {
        this.style = style;
    }

    void display() {
        super.display();
        System.out.println("Dance style: " + style);
        System.out.println();
    }

    void perform() {
        System.out.println("Dancer " + name + " is performing " + style + " dance moves.");
    }
    public String toString() {
        return super.toString() +
               "\nDance Style: " + style;
    }
}
//class Dancer ends here
class Painter extends Artist {
    String medium;

    Painter() {
        super();
        medium = "Unknown";
    }

    Painter(String n, String g, int exp, String m) {
        super(n, g, exp);
        medium = m;
    }

    String getMedium() {
        return medium;
    }

    void setMedium(String medium) {
        this.medium = medium;
    }

    void display() {
        super.display();
        System.out.println("Medium: " + medium);
        System.out.println();
    }

    void perform() {
        System.out.println("Painter " + name + " is creating art using " + medium + ".");
    }
    
    public String toString() {
        return super.toString() +
               "\nMedium: " + medium;
    }

}
//class Painter ends here
class TestArtist {
    public static void main(String[] args) {
        Artist[] artists = new Artist[3];

        artists[0] = new Singer("Aditya", "Pop", 10, "Soprano");
        artists[1] = new Dancer("Pratik", "Ballet", 15, "Classical Ballet");
        artists[2] = new Painter("Samarth", "Renaissance", 30, "Oil Paint");

        for (int i = 0; i < artists.length; i++) {
            artists[i].perform();
        }
        System.out.println(artists[2]);
        System.out.println(artists[2].toString());
    }
}
//class test artist ends here