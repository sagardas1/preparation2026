package com._6.preparation2026.java21.newFeature.SEALED;

public sealed class Animal permits Lion,Tiger {

    /**
     * to give developers more control over class hierarchies—specifically, to restrict which classes can extend or implement a type.
     * @return
     */

    public String design() {
        return "4 legs";
    }
}
