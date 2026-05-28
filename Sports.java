// Interface
interface Playable {
    void play();
}

// Football class
class Football implements Playable {

    public void play() {
        System.out.println("Playing Football");
    }
}

// Volleyball class
class Volleyball implements Playable {

    public void play() {
        System.out.println("Playing Volleyball");
    }
}

// Basketball class
class Basketball implements Playable {

    public void play() {
        System.out.println("Playing Basketball");
    }
}

// Main class
public class Sports {

    public static void main(String[] args) {

        Playable f = new Football();
        Playable v = new Volleyball();
        Playable b = new Basketball();

        f.play();
        v.play();
        b.play();
    }
}