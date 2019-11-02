package Observer.subscriber;

import Observer.observer.Post;

public class Magazin implements MassMedia {
    private Post post;

    public Magazin(Post post){
        this.post = post;
    }

    @Override
    public void update() {
        System.out.println("Magazin " + post.getState());
    }
}
