/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Tehtävä 4: implementoi Rectangle ja Circle ennen ajoa.");
        Shape[] shapes=new Shape[2];
        shapes[0]=new Circle(5.0);
        shapes[1]=new Rectangle(4.0, 6.0);
        double totalArea=0;
        for(Shape s:shapes){
            totalArea+=s.area();
        }
        for(Shape s:shapes){
            System.out.println(s.toString());
        }
        System.out.printf("Kokonaispinta-ala: %.2f\n", totalArea);
    }
}