package Observer.observer;

import Observer.subscriber.MassMedia;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private List<MassMedia> massMedias = new ArrayList<>();
    private String state;

    public void add (MassMedia massMedia){
       massMedias.add(massMedia);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        massMedias.stream().forEach(i -> i.update());
    }

}
