package builder;

public class Watch implements WatchBuilding {
    private String design;
    private String hardware;
    private String assembling;
    private String quality;


    public void initDesign(String design){
        this.design=design;
        System.out.println(design);
    }

    public void makeHardware(String hardware){
        this.hardware=hardware;
        System.out.println(hardware);
    }

    public void initAssembling(String assembling){
        this.assembling=assembling;
        System.out.println(assembling);
    }

    public void finalizingQuality(String quality){
        this.quality=quality;
        System.out.println(quality);
    }

}
