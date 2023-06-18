package builder;

public class Watch implements WatchBuilding {
    private String design;
    private String hardware;
    private String assembling;
    private String quality;


    public void initDesign(String design){
        this.design=design;
    }

    public void makeHardware(String hardware){
        this.hardware=hardware;
    }

    public void initAssembling(String assembling){
        this.assembling=assembling;
    }

    public void finalizingQuality(String quality){
        this.quality=quality;
    }

}
