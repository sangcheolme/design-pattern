package observer.weather;

public interface Subject {

    void registerObserver(Display display);

    void removeObserver(Display display);

    void notifyObservers();
}
