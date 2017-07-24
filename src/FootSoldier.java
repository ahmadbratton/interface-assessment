public class FootSoldier extends Soldier implements Punch, Shoot {
    public FootSoldier(String name, String rank, int serviceNumber) {
        super(name, rank= "FootSoldier", serviceNumber);
    }

    @Override
    public String walk() {
        return "I am a footsoldier walking";
    }

    @Override
    public String speak() {
        return "foootSoildierrrrrr";

    }

    @Override
    public String eat() {
        return "food taste batter after a long day of being a foot soldier";

    }

    @Override
    public String throwPunch() {
        return "bam boo bah bam ";

    }

    @Override
    public String shoot() {
        return "pew pew pew";

    }

    @Override
    public String reload() {
        return "holy shit i have to reload";

    }

}
