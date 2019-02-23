package pl.sdacademy;

public class HelloSpring {
    private String welcomeMessage;

    public HelloSpring(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String toString() {
        return welcomeMessage;
    }
}
