package com.aktepe.deneme2;

public class Flat extends House {
    public Flat() {
        square = 250;
        roomNumber = 2;
    }

    public Flat(int square, int roomNumber, Color color, boolean isAmericanKitchen, boolean isNew) {
        super(square, roomNumber, color, isAmericanKitchen, isNew);
    }
}
