package designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class NewsPublisher {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    public void setNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}
