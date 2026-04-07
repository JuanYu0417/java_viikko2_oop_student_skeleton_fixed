/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public double getBalance(){
        return balance;
    }
    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        if (balance<0){
            this.balance=0;
        }else{
            this.balance=balance;
        }
    }
    public double deposit(double amount){
        if (amount<0){
            return balance;
        }
        return balance+=amount;
    }
    public double withdraw(double amount){
        if(amount<0||amount>balance){
            return balance;
        }
        return balance-=amount;
    }

    @Override
    public String toString(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        //throw new UnsupportedOperationException("TODO: implement toString()");
        return"Account: "+accountNumber+",balance:"+balance;
    }

    @Override
    public boolean equals(Object o){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        //throw new UnsupportedOperationException("TODO: implement equals(Object)");
        if(this==o){
            return true;
        }
        if (o==null||getClass()!=o.getClass()){
            return false;
        }
        BankAccount that = (BankAccount) o;
        return accountNumber.equals(that.accountNumber);
    }
}