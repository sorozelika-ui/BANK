# BANK PROJECT - Java

## Auteur
soro wagnigui zélika

## Description

Ce projet Java représente un système simple de gestion de comptes bancaires utilisant les concepts de :

- l’héritage
- les classes abstraites
- les constructeurs
- les getters et setters
- le polymorphisme

Le projet contient une classe parent `BankAccount` et trois classes enfants :

- `CheckingAccount` (compte courant)
- `SavingAccount` (compte épargne)
- `COD` (certificat de dépôt)

---

# Fonctionnement
Classe parent : BankAccount

La classe BankAccount contient les attributs communs :

account
balance

Elle contient également :

un constructeur
des getters
des setters
une méthode affiche()

Classe CheckingAccount

La classe CheckingAccount hérite de BankAccount et ajoute :

limit

Classe SavingAccount

La classe SavingAccount hérite de BankAccount.

Classe COD

La classe COD hérite également de BankAccount.

# Fonctionnalités

Création de comptes bancaires
Affichage des informations des comptes
Modification du solde d’un compte
Utilisation de l’héritage entre les classes

# Concepts Java utilisés
Classes et objets
Héritage (extends)
Encapsulation
Getters / Setters
Redéfinition de méthode (@Override)
Constructeurs
Polymorphisme

# Structure du projet
```text
src/
└── main/
    └── java/
        └── org/
            └── example/
                ├── Main.java
                ├── BankAccount.java
                ├── CheckingAccount.java
                ├── SavingAccount.java
                └── COD.java
