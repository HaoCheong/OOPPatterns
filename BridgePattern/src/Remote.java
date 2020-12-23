public interface Remote {

    //This is the Remote (Abstraction) interface
    //All classes which implements this interface will have methods which calls upon the referenced object stored within them
    //I.E: volumeUp and volumeDown will call a device objects' setVolume method

    public void power();
    public void volumeDown();
    public void volumeUp();
    public void channelDown();
    public void channelUp();
}
