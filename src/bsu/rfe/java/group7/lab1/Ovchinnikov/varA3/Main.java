package bsu.rfe.java.group7.lab1.Ovchinnikov.varA3;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if (parts[0].equals("Milk")) {
                breakfast[itemsSoFar] = new Milk(parts[1]);
            }
            itemsSoFar++;
        }
        countFood(breakfast, breakfast[0], breakfast[1], breakfast[2]);
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else {
                break;
            }
        }
    }
    public static void countFood(Food[] foods, Food food1, Food food2, Food food3) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food1)) {
                count++;
            }
        }
        int count1 = count;
        count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food2)) {
                count++;
            }
        }
        int count2 = count;
        count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food3)) {
                count++;
            }
        }
        int count3 = count;
        count = 0;
        System.out.println("There are " + count1 + " products of type " + food1.getClass().getSimpleName() + " in the breakfast");
        System.out.println("There are " + count2 + " products of type " + food2.getClass().getSimpleName() + " in the breakfast");
        System.out.println("There are " + count3 + " products of type " + food3.getClass().getSimpleName() + " in the breakfast");
    }

}
