package adapter;

public class  BiriyaniAdapter extends SpecialKacchi{
    private Biriyani biriyani;
    public BiriyaniAdapter(Biriyani biriyani){
        this.biriyani=biriyani;
    }


    @Override
    public void makeItSpecial() {
        biriyani.takeIngredients();
        biriyani.makeNow();
        System.out.println("Added extra ingredients to make it special");
    }
}
