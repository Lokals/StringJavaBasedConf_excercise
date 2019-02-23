package pl.sdacademy;

public class SingletonGreeter {

    private String messageSingleton;

    public SingletonGreeter(String messageSingleton) {
        this.messageSingleton = messageSingleton;
    }

    public String getMessageSingleton() {
        return messageSingleton;
    }

    public void setMessageSingleton(String messageSingleton) {
        this.messageSingleton = messageSingleton;
    }

    @Override
    public String toString() {
        return messageSingleton;
    }
}
