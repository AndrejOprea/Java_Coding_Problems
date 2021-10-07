package com.company.Immutable;

public final class Coordonate {

    private final int z;
    private final MyImmuableClass ic;


    public Coordonate(int z, MyImmuableClass ic) {
        this.z = z;
        this.ic = new MyImmuableClass();
    }

    public MyImmuableClass getIc() {

        MyImmuableClass clone = new MyImmuableClass();
        clone.setX(this.ic.getX());
        clone.setY(this.ic.getY());

        return clone;
    }
}
