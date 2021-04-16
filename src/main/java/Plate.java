public class Plate {
    private int food;

    public Plate(int food) {

        this.food = food;
    }

    public void desreaseFood(int appetite) {
        if (!addFood(appetite)) {
            System.out.println("Съели все!");
        } else {
            food = food - appetite;
        }
    }

    public boolean addFood(int appetite) {

            return appetite < food;
        }
        public void increaseFood (int countOfFood)
        {
            food += countOfFood;
        }

    }


