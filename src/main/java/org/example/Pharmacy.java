package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications = new HashMap<>();

    public int getCount() {
        return this.medications.size();
    }

    public String getMedications() {
        StringBuilder medications = new StringBuilder();

        for (Medication medication : this.medications.values()) {
            medications.append("Name: ").append(medication.getName())
                    .append(", Preis: ").append(medication.getPrice())
                    .append(", Anzahl: ").append(medication.getAvailability())
                    .append("\n");
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
