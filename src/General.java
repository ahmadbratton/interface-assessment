public class General extends Soldier implements Punch, Shoot {
    public General(String name, String rank, int serviceNumber) {
        super(name, rank = "General", serviceNumber);
    }

    @Override
    public String walk() {
        return "I am a General walking";
    }

    @Override
    public String speak() {
        return "did i mention that I'm a General";

    }

    @Override
    public String eat() {
        return "Danm this food is good";

    }

    @Override
    public String throwPunch() {
        return "boom bop bam";

    }

    @Override
    public String shoot() {
        return "toooo tooo tooo ";

    }

    @Override
    public String reload() {
        return "hey you give me your gun mine is empty!";

    }

}
