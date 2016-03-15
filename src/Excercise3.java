/**
 * Created by scelac on 3/15/16.
 */
public class Excercise3
{
    public static void main(String[] args) {
        Zerg[] zergs = new Zerg[10];
        int [] zerg = new int[10];
        for (int i = 0; i < zergs.length; i++)
        {
            zergs[i] = new Zerg(i);
            zerg[i] = zergs[i].getPower();
            //System.out.println(zergs[i].name);


        }

        Protos[] protos = new Protos[7];
        int [] protos1 = new int[7];
        for (int j = 0; j < protos.length; j++) {
            protos[j] = new Protos(j);
            protos1[j] = protos[j].getPower();
            //System.out.println(protos[j].name);

        }
        // System.out.println();

        Terran[] terrans = new Terran[12];
        int [] terran = new int[12];
        for (int k = 0; k < terrans.length; k++) {
            terrans[k] = new Terran(k);
            terran[k] = terrans[k].getPower();
            //System.out.println(terrans[k].name);

        }

        BigWar bigWar = new BigWar(zergs,protos,terrans);
        bigWar.sort(zerg);
        bigWar.sort(protos1);
        bigWar.sort(terran);
    }


}
