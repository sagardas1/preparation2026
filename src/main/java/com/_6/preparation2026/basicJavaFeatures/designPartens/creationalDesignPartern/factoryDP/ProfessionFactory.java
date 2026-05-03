package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.factoryDP;

public class ProfessionFactory {

    public Profession getObject(String professionName) {
        return switch (professionName) {
            case "Teacher" -> new Teacher();
            case "Doctor" -> new Doctor();
            case "Engineer" -> new Engineer();
            default -> null;
        };

    }
}
