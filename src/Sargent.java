public class Sargent extends Soldier implements Punch, Shoot {
    public Sargent(String name, String rank, int serviceNumber) {
        super(name, rank= "sargent", serviceNumber);
    }

    @Override
    public String walk() {
        return "I am a sargent walking";
    }

    @Override
    public String speak() {
        return "yea back when I was a foot soldier I wasnt a sargent  ";

    }

    @Override
    public String eat() {
        return "nam nam nam ";

    }

    @Override
    public String throwPunch() {
        return "huh huh haaa";

    }

    @Override
    public String shoot() {
        return "pop pop bang bang";

    }

    @Override
    public String reload() {
        return "cover me im reloading";

    }
}
