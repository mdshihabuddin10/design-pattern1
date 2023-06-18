package builder;

public interface WatchBuilder {
    public void completeDesign();

    public void makeHardware();

    public void doAssembling();

    public void qualityTest();

    public Watch getWatch();
}
