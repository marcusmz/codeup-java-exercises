public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();

        dish1.nameOfDish  = "sushi roll";
        dish1.costInCents = 1000;
        dish1.wouldRecommend = true;

        dish1.printSummary();

    }
}
