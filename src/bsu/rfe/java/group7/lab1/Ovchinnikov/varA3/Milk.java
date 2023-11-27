package bsu.rfe.java.group7.lab1.Ovchinnikov.varA3;

public class Milk extends Food {
    private String fat;
    public String getFat() {

        return fat;
    }

    public void setFat(String fat) {

        this.fat = fat;
    }
    public Milk(String fat) {
        super("Молоко");
        this.fat = fat;
    }
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Milk)) return false; // Шаг 2
            return fat.equals(((Milk)arg0).fat); // Шаг 3
        } else
            return false;
    }
    @Override
    public void consume() {
        System.out.println(this + " выпито");
    }
    public String toString() {
        return super.toString() + " жирности '" + fat.toUpperCase() + "'";
    }
}
