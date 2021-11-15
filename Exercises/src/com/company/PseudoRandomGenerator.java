package com.company;

public class PseudoRandomGenerator {
    int INIT_SEED = 123456789;
    long COEF = 22696477;
    long OFFSET = 1;
    long MODULO = (long)(Math.pow(2, 61))-1;
    long MASK = 0x7FFFFFFF;
    int internalValue;

    public PseudoRandomGenerator(){
        this.internalValue = INIT_SEED;
    }

    int getNextValue() {
        long value = (long)this.internalValue;
        value *= COEF;
        value += OFFSET;
        value %= MODULO;
        this.internalValue = (int) ((value >> 16) & MASK);
        return this.internalValue;
    }

    public double random() {
        long value = this.getNextValue();
        return ((double) value) / MASK;
    }


}
