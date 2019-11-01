package AbstractFactory.factories;

import AbstractFactory.factories.subtitles_tracks.SubTrack;

public interface Factory {
    SubTrack createSubtitleAndTrack();
}
