/**
 * Created by scelac on 3/15/16.
 */
public class Protos
{
    String name;
    int power;

    public Protos(int j) {
       this.name = "Protos " + j;
        this.power = -6 + j;
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
