public class Main {
    public static void main (String[] args) {
        Cat[] cats =
                {
                        new Cat("Федор", 10),
                        new Cat("Васька", 15),
                        new Cat("Дуся", 15)
                };
        Plate plate = new Plate(50);


        plate.desreaseFood(50);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.increaseFood(40);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
    }


