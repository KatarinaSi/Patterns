package AbstractFactory.factories;

import AbstractFactory.factories.subtitles_tracks.EngSubTrack;
import AbstractFactory.factories.subtitles_tracks.SubTrack;

public class EngFactory implements Factory{
    @Override
    public SubTrack createSubtitleAndTrack() {
        return new EngSubTrack();
    }
}
