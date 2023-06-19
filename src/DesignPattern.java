import adapter.Biriyani;
import adapter.BiriyaniAdapter;
import adapter.ChickenBiriyani;
import adapter.SpecialKacchi;
import bridge.Bread;
import bridge.Chocolate;
import bridge.Make;
import bridge.Package;
import builder.*;

public class DesignPattern{
    public void callAdapter(){
        Biriyani chickenBiriyani=new ChickenBiriyani();
        SpecialKacchi specialKacchi=new SpecialKacchi();
        BiriyaniAdapter biriyaniAdapter=new BiriyaniAdapter(chickenBiriyani);
        biriyaniAdapter.makeItSpecial();

    }
    public void callBridge()
    {
        Bread bread = new Bread(new Make(),new Package());
        bread.manufacture();
        System.out.println();
        Chocolate chocolate = new Chocolate(new Make(), new Package());
        chocolate.manufacture();

    }
    public void callBuilder()
    {
        Watch watch=new Watch();
        RolexBuilder rolexBuilder=new RolexBuilder(watch);
        CraftsMan craftsMan = new CraftsMan(rolexBuilder);
        craftsMan.makeWatch();
    }
}