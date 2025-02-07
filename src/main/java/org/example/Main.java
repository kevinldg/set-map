package org.example;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(new Medication("Ratiopharm", 2.49, 10));
        pharmacy.save(new Medication("Ibuprofen", 3.25, 8));
        pharmacy.save(new Medication("Paracetamol", 4.99, 19));

        System.out.println("### Anzahl der Medikamente ###");
        System.out.println(pharmacy.getCount());

        System.out.println("### Liste der Medikamente ###");
        System.out.println(pharmacy.getMedications());
    }
}