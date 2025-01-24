public class VideoPlayer implements MediaPlayer {

    public String videoName;

    @Override
    public void play(String trackName) {

    }

    @Override
    public void pause() {

    }

    @Override
    public String getCurrentTrack() {
        return this.videoName;
    }
}
