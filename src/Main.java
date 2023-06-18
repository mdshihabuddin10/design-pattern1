import bridge.*;
import bridge.Package;
public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread(new Make(),new Package());
        bread.manufacture();
        System.out.println();
        Chocolate chocolate = new Chocolate(new Make(), new Package());
        chocolate.manufacture();
}

}