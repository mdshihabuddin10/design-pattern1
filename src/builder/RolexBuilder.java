package builder;

public class RolexBuilder implements WatchBuilder{
    private Watch watch;
    public RolexBuilder()
    {
        this.watch=new Watch();
    }
    @Override
    public void completeDesign() {
        watch.initDesign("Started premium design");
    }
        
    @Override
    public void makeHardware() {
     watch.makeHardware("making hardware");
    }
    @Override
    public void doAssembling() {
        watch.initAssembling("Started assembling");
    }
    @Override
    public void qualityTest() {
        watch.finalizingQuality("Started quality testing");
    }
    @Override
    public Watch getWatch() {
        // TODO Auto-generated method stub
        return this.watch;
    }
    
}
