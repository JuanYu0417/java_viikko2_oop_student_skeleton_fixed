/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Tehtävä 5: implementoi SalariedEmployee ja HourlyEmployee ennen ajoa.");
        Employee[] employees=new Employee[2];
        employees[0]=new SalariedEmployee("John Doe", 5000.0);
        employees[1]=new HourlyEmployee("Jane Smith", 20.0, 40);
        double totalPay=0.0;
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
            totalPay+=employees[i].monthlyPay();
        }
        System.out.println("Total monthly pay: " + totalPay);
    }
}