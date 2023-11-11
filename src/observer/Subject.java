package observer;

public interface Subject {

    void registerObserver(Display display);

    void removeObserver(Display display);

    void notifyObservers();
}
