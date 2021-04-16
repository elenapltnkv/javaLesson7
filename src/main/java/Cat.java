public class Cat {
    private String name;
    private int appetite;
    private boolean hangry;

    public Cat(String name, int appetite) {
        this.name = name;

        this.appetite = appetite;
        this.hangry = false;
    }

     public void eat(Plate plate){
         if (plate.addFood (appetite) && !hangry) {
             System.out.println(name + " кушает.");
             plate.desreaseFood(appetite);
             hangry = true;
         }
         else if (!plate.addFood(appetite)){
             System.out.println(name + " просит кушать!");
         }
         else if (hangry)
         {
             System.out.println(name + " сытый!");
         }

     }
}