import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import bazime.Darbininkas;


public class Main {

    public static void main(String[] args) {

        Darbininkas Tomas = new Darbininkas("Tomas", "Kontaktoriai", 1200, 220);
        Darbininkas Tadas = new Darbininkas("Tadas" ,"Varztai", 1100, 50.50);
        Darbininkas Dainius = new Darbininkas("Dainius", "Verzles", 800, 70);
        Darbininkas Darius = new Darbininkas("Darius", "Fiksatoriai", 950, 150);
        Darbininkas Saulius = new Darbininkas("Saulius", "Plokstes", 1220, 100);
        Darbininkas Vytautas = new Darbininkas("Vytautas", "Padai", 2000, 40);
        Darbininkas Marius = new Darbininkas("Marius", "Gradines", 1505, 80);
        Darbininkas Petras = new Darbininkas("Petras", "Itempejai", 1200, 130);
        Darbininkas Romas = new Darbininkas("Romas", "Gaubtai", 500, 140);
        Darbininkas Dovydas = new Darbininkas("Dovydas", "Apsaugos", 700, 300);

        ArrayList<Darbininkas> darbininkai = new ArrayList();
        darbininkai.add(Tomas);
        darbininkai.add(Tadas);
        darbininkai.add(Dainius);
        darbininkai.add(Darius);
        darbininkai.add(Saulius);
        darbininkai.add(Vytautas);
        darbininkai.add(Marius);
        darbininkai.add(Petras);
        darbininkai.add(Romas);
        darbininkai.add(Dovydas);
        double suma = 0;
        double suma2 = 0;
        System.out.println("Sarasas");
        System.out.println(darbininkai);
        System.out.println("\n" + "Pagamintu detaliu dienos suvestine: ");
        for (Darbininkas zmogus : darbininkai) {
            if (!(zmogus == null)) {

                suma2 = zmogus.getKiekis() * zmogus.getKaina();
                suma = suma + zmogus.getKiekis() * zmogus.getKaina();
                System.out.println("Vardas: " + zmogus.getVardas() + " Detale: " + zmogus.getDetale() + ", Kiekis: " + zmogus.getKiekis() + ", Kaina " + zmogus.getKaina() + "€" + " Bendra kaina: " + suma2 + "€");
            }
        }
        System.out.println("Bendra kaina: " + suma + "€");

        System.out.println("\n" + "Darbininkai surusiuoti pagal kieki MAX-MIN o jeigu kiekis vienos pagal detale A-Z");
        darbininkai.sort(Comparator.comparing(Darbininkas::getKiekis, Collections.reverseOrder()).thenComparing(Darbininkas::getDetale));
        System.out.println(darbininkai);

        System.out.println("\n" + "Surusiuoti darbininkai pagal ivykdytas normas");
        for (Darbininkas zmogus : darbininkai) {
            if (zmogus.getKiekis() > 1000){
                System.out.print("Norma ivykdyta - " + zmogus);
            }
            if (zmogus.getKiekis() < 1000){
                System.out.print("Norma neivykdyta - " + zmogus);
            }
        }

        System.out.println("\n" + "Darbininkai po pasalinimo: ");
        darbininkai.removeIf(obj -> obj.getKaina() > 100);
        System.out.println(darbininkai);


    }

        }



