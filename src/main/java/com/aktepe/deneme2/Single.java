package com.aktepe.deneme2;

public class Single extends House {
    public Single() {
        square = 2000;
        roomNumber = 4;
    }

    public Single(int square, int roomNumber, Color color, boolean isAmericanKitchen, boolean isNew) {
        super(square, roomNumber, color, isAmericanKitchen, isNew);
    }

    @Override
    public void print() {
        this.print();
    }
}
