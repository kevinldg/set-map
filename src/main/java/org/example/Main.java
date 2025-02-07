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

        System.out.println("### Suche nach Medikament ###");
        Medication foundMedication = pharmacy.find("Ibuprofen");
        System.out.println(foundMedication);

        System.out.println("### Liste der Medikamente nach dem Entfernen eines Eintrags ###");
        pharmacy.delete("Ratiopharm");
        System.out.println(pharmacy.getMedications());
    }
}