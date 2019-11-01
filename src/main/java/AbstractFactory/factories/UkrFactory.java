package AbstractFactory.factories;

import AbstractFactory.factories.subtitles_tracks.SubTrack;
import AbstractFactory.factories.subtitles_tracks.UkrSubtitlesTrack;

public class UkrFactory implements Factory {
    @Override
    public SubTrack createSubtitleAndTrack() {
        return new UkrSubtitlesTrack();
    }
}
