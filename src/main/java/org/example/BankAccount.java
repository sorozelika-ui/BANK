package org.example;

// Classe parent représentant un compte bancaire.

public abstract class BankAccount {

    // Numéro du compte
    protected String account;

    // Solde du compte
    protected double balance;

    // Constructeur de BankAccount

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    // recuperer le compte
    public String getAccount() {
        return account;
    }

    // modifier le compte
    public void setAccount(String account) {
        this.account = account;
    }

    // recuperer le solde
    public double getBalance() {
        return balance;
    }

    // modifier le solde
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Affiche les informations du compte

    public void Affiche() {
        System.out.println("Compte : " + account);
        System.out.println("Solde : " + balance + " FCFA");
    }

    public abstract void affiche();
}