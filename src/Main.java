

public class Main {

    public static void main(String[] args) {
        System.out.println("******foot soldier*********");
        FootSoldier footSoldier = new FootSoldier("john", "footsoldier", 11232);
        System.out.println(footSoldier.speak());
        System.out.println(footSoldier.eat());
        System.out.println(footSoldier.walk());
        System.out.println(footSoldier.shoot());
        System.out.println(footSoldier.reload());
        System.out.println(footSoldier.throwPunch());

        System.out.println("******General*********");

        General general = new General("major","general", 43232);
        System.out.println(general.speak());
        System.out.println(general.eat());
        System.out.println(general.walk());
        System.out.println(general.shoot());
        System.out.println(general.reload());
        System.out.println(general.throwPunch());

        System.out.println("******sargent*********");

        Sargent sargent = new Sargent("Richard","sargent", 747489);
        System.out.println(sargent.speak());
        System.out.println(sargent.eat());
        System.out.println(sargent.walk());
        System.out.println(sargent.shoot());
        System.out.println(sargent.reload());
        System.out.println(sargent.throwPunch());



    }
}
