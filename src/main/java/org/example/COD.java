package org.example;

//heritié de la classe BankAccount
public class COD extends BankAccount {

    //Classe représentant un certificat de dépôt.
    public COD(String account, double balance) {
        super(account, balance);
    }

    @Override
    public void affiche() {

    }
}