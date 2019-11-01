package AbstractFactory.factories;

import AbstractFactory.factories.subtitles_tracks.DeutschSubTrack;
import AbstractFactory.factories.subtitles_tracks.SubTrack;

public class DeutschFactory implements Factory{
    @Override
    public SubTrack createSubtitleAndTrack(){
        return new DeutschSubTrack();
    };
}
