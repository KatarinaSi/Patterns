package AbstractFactory;

import AbstractFactory.factories.Factory;
import AbstractFactory.factories.subtitles_tracks.SubTrack;

public class Movie {
    SubTrack subTrack;

    public Movie(Factory factory){
        subTrack = factory.createSubtitleAndTrack();
    }
    public void showMovie(){
        subTrack.show();
    };
}
