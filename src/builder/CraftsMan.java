package builder;

public class CraftsMan {
    private WatchBuilder watchBuilder;

    public CraftsMan(WatchBuilder watchBuilder) {
        this.watchBuilder=watchBuilder;
    }


    public void makeWatch(){
        this.watchBuilder.completeDesign();
        this.watchBuilder.makeHardware();
        this.watchBuilder.doAssembling();
        this.watchBuilder.qualityTest();
    }

}
