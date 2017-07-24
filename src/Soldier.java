public abstract class Soldier implements Punch , Shoot {

String rank;
String name;
int serviceNumber;






    public Soldier(String name , String rank , int serviceNumber) {
        this.name = name;
        this.rank = rank;
        this.serviceNumber =  serviceNumber;
    }

    public String sleep(){
       return "zzzzzz";
    }

    public abstract String walk();

    public abstract String speak();

    public abstract String eat();


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }


}
