import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PlataformaVideo implements Subject {
    private Map<String, List<Observer>> genreList = new HashMap<>();

    public void addMovie(String title, String genre) {
        System.out.println("Novo filme adicionado: " + title + " (" + genre + ")");
        notify(genre, title);
    }

    @Override
    public void attach(Observer observer, String genre) {
        genreList.computeIfAbsent(genre, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void detach(Observer observer, String genre) {
        List<Observer> observers = genreList.get(genre);
        if (observers != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notify(String genre, String title) {
        List<Observer> observers = genreList.get(genre);
        if (observers != null) {
            for (Observer observer : observers) {
                observer.update(genre, title);
            }
        }
    }
}