public interface Subject {
    void attach(Observer observer, String genre);
    void detach(Observer observer, String genre);
    void notify(String genre, String title);
}
