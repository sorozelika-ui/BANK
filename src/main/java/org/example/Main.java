package org.example;

public class Main {

    public static void main(String[] args) {

        // Création du compte courant
        CheckingAccount checking =
                new CheckingAccount("CHK001", 500000, 100000);

        // Création du compte épargne
        SavingAccount savings =
                new SavingAccount("SVG001", 750000);

        // Création du certificat de dépôt
        COD cod =
                new COD("COD001", 1000000);
    }
}