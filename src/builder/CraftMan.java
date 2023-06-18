package builder;

public class CraftMan {
    private WatchBuilder watchBuilder;
    public void CraftMan(WatchBuilder watchBuilder){
        this.watchBuilder=watchBuilder;
    }
    public void makeWatch(){
        this.watchBuilder.completeDesign();
        this.watchBuilder.makeHardware();
        this.watchBuilder.doAssembling();
        this.watchBuilder.qualityTest();
    }

}
