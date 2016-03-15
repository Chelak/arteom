/**
 * Created by scelac on 3/15/16.
 */
public class Terran {

    String name;
    int power;



    public Terran(int k) {
        this.name = "Terran " + k;
        this.power = 2 + k;
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
