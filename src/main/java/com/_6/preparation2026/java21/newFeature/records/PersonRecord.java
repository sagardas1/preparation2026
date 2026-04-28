package com._6.preparation2026.java21.newFeature.records;


/**
 * records introduces in java 16
 * @param name
 * @param pnNumber
 * @param address
 */
public record PersonRecord(String name, String pnNumber, String address, Human human)  implements A{

    /***
     * Records are immutable
     * records are final class
     * records have only all arg constructor
     * records have only getter methods
     * records have toString(), equals(), hashcode() methods
     */
}
