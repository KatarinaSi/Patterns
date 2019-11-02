package Observer.subscriber;

import Observer.observer.Post;

public class NewsPaper implements MassMedia {
    private Post post;

    public NewsPaper(Post post){
        this.post = post;
    }

    @Override
    public void update() {
        System.out.println("NewsPaper " + post.getState());
    }
}
