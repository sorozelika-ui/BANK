package org.example;

// heritié de BankAccount

public class CheckingAccount extends org.example.BankAccount {

    // Limite represente le plafond du compte
    private double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }

    // recuperer tout les plafonds
    public double getLimit() {
        return limit;
    }

    // modifier les plafonds
    public void setLimit(double limit) {
        this.limit = limit;
    }

   /* @Override
    public void affiche() {
        System.out.println("Limite : " + limit + " FCFA");
    }

    */

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Limite : " + limit + " FCFA");
    }

}