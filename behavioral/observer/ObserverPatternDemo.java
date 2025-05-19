package designPattern.behavioral.observer;

class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Observer sub1 = new NewsSubscriber("CNN");
        Observer sub2 = new NewsSubscriber("BBC");

        publisher.attach(sub1);
        publisher.attach(sub2);

        publisher.setNews("Breaking news: Design patterns simplify code!");

        publisher.detach(sub1);

        publisher.setNews("Update: Observers notified successfully!");
    }
}