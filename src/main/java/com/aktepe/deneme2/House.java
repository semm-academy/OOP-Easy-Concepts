package com.aktepe.deneme2;

// DRY (Don't Repeat Yourself)

/*

            House
            -----
              |
              |
      ------ ---- ----
      Single Flat Town
 */

public class House {
    protected int square;
    protected int roomNumber;
    protected Color color;
    protected boolean isAmericanKitchen;
    protected boolean isNew;

    public House() {
        color = Color.GRAY;
        isAmericanKitchen = false;
        isNew = true;
    }

    public House(int square, int roomNumber, Color color, boolean isAmericanKitchen, boolean isNew) {
        this.square = square;
        this.roomNumber = roomNumber;
        this.color = color;
        this.isAmericanKitchen = isAmericanKitchen;
        this.isNew = isNew;
    }

    public void print() {
        System.out.println("HAYDAR");
    }

    @Override
    public String toString() {
        return "House{" +
                "square=" + square +
                ", roomNumber=" + roomNumber +
                ", color='" + color + '\'' +
                ", isAmericanKitchen=" + isAmericanKitchen +
                ", isNew=" + isNew +
                '}';
    }

    public static void main(String[] args) {

    }
}
