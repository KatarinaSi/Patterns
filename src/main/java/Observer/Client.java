package Observer;

import Observer.observer.Post;
import Observer.subscriber.Magazin;
import Observer.subscriber.NewsPaper;

public class Client {
    public static void main(String[] args) {
        Post post = new Post();
        post.add(new NewsPaper(post));
        post.add(new Magazin(post));
        post.setState("New news release");
        post.setState("delivered...");
    }
}
