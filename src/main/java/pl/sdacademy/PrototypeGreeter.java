package pl.sdacademy;

public class PrototypeGreeter {
    private String prototypeMessage;

    public PrototypeGreeter(String prototypeMessage) {
        this.prototypeMessage = prototypeMessage;

    }

    public String getPrototypeMessage() {
        return prototypeMessage;
    }

    public void setPrototypeMessage(String prototypeMessage) {
        this.prototypeMessage = prototypeMessage;
    }

    @Override
    public String toString() {
        return prototypeMessage;
    }
}
