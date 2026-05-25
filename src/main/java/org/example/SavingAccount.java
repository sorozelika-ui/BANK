package org.example;

// heritié de la classe BankAccount
public class SavingAccount extends BankAccount {

//Classe représentant un compte épargne.
    public SavingAccount(String account, double balance) {
        super(account, balance);
    }

    @Override
    public void affiche() {
        super.affiche();
    }
}