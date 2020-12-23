public interface Device {

    //This is the Device (Implementation) interface
    //All class using this interface will be stored as a reference and called upon using the Abstraction objects' methods

    public boolean isEnabled();
    public void enable();
    public void disable();
    public int getVolume();
    public void setVolume(int volume);
    public int getChannel();
    public void setChannel(int channel);
    public void printStatus();
}
