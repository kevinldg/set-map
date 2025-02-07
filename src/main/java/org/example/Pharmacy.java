package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Pharmacy {
    private Map<String, Medication> medications = new HashMap<>();

    public int getCount() {
        return this.medications.size();
    }

    public String getMedications() {
        StringJoiner medications = new StringJoiner("\n");

        for (Medication medication : this.medications.values()) {
            medications.add("Name: " + medication.getName() +
                    ", Preis: " + medication.getPrice() +
                    ", Anzahl: " + medication.getAvailability());
        }
        return medications.toString();
    }

    public void save(Medication medication) {
        this.medications.put(medication.getName(), medication);
    }

    public void delete(String medicationName) {
        this.medications.remove(medicationName);
    }

    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }
}
