/**
 * Created by scelac on 3/15/16.
 */
public class BigWar
{
    Zerg[] zergs;
    Protos[] protos;
    Terran[] terran;
    public BigWar() {
    }

    public BigWar(Zerg[] zergs, Protos[] protos, Terran[] terran) {
        this.zergs = zergs;
        this.protos = protos;
        this.terran = terran;
    }

    public void sort(int[] zergs) {
        for (int i = 0; i < zergs.length - 1; i++) {
            for (int j = 0; j < zergs.length - i - 1; j++) {
                if (zergs[j] > zergs[j + 1]) {
                    int tmp = zergs[j];
                    zergs[j] = zergs[j + 1];
                    zergs[j + 1] = tmp;
                    System.out.println(tmp);


                }
            }
        }
    }
}
