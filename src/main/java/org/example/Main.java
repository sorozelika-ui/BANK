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


        // Affichage des informations
        System.out.println(" COMPTE COURANT");
        checking.affiche();

        System.out.println("COMPTE EPARGNE");
        savings.affiche();

        System.out.println("CERTIFICAT DE DEPOT");
        cod.affiche();

        // Modification des attributs
        savings.setBalance(900000);

        System.out.println("Nouveau solde du compte épargne : " + savings.getBalance() + " FCFA");
    }
}

