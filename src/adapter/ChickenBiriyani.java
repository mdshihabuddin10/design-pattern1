package adapter;

public class ChickenBiriyani implements Biriyani{
    @Override
    public void takeIngredients() {
        System.out.println("Ingredients used");

    }

    @Override
    public void makeNow() {
        System.out.println("Started making");
    }
}
