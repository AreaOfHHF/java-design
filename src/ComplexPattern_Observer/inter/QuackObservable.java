package ComplexPattern_Observer.inter;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObserver();
}
