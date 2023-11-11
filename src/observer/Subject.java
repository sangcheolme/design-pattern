package observer;

public interface Subject {

    void registerObserver(Display display);

    void removeObserver(String name);

    void notifyObservers();
}
