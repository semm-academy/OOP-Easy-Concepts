package com.aktepe.deneme2;

public class Town extends House {
    public Town() {
        square = 1250;
        roomNumber = 3;
    }

    public Town(int square, int roomNumber, Color color, boolean isAmericanKitchen, boolean isNew) {
        super(square, roomNumber, color, isAmericanKitchen, isNew);
    }
}
