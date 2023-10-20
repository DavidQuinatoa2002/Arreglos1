import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto[] arregloAuto=new Auto[3];

        Auto auto1 = new Auto("plac1","Carlos",2009);
        Auto auto2 = new Auto("plac2","Lucho",2010);
        Auto auto3 = new Auto("plac3","David",2011);
        Auto auto4 = new Auto("plac4","Isra",2002);

        for(int i=0; i<3; i++){
            arregloAuto[i] = auto1;
        }
//aggrgar al inicio
        System.out.println("La placa del auto 3 es: "+arregloAuto[2].getPlaca());

        //vamos lista, agfg lo que quiero

        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        listaAutos.add(auto4);

        System.out.println("La placa del auto 2 es: "+listaAutos.get(1).getPlaca());





        //con map
        Map<Integer,Auto> mapAutos = new HashMap<>();
        mapAutos.put(3,auto1);
        mapAutos.put(100,auto2);
        mapAutos.put(4,auto3);
        mapAutos.put(1000,auto4);

        System.out.println("La placa del auto 2 es: "+mapAutos.get(100).getPlaca());
    }
}