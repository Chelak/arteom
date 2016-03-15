/**
 * Created by scelac on 3/15/16.
 */
public class Zerg {
    String name;
    int power;


    public Zerg() {

    }

    public Zerg(int i) {
        this.name = "Zerg " + i;
        this.power = 5 + i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
