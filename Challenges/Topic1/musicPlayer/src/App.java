import builderMusicPlayer.Builder;
import builderMusicPlayer.MusicPlayerBuilder;
import director.Director;

/**
 * Entry point.
 */

public class App {
    Director director = new Director();
    MusicPlayerBuilder mpBuilder = new MusicPlayerBuilder();
     director.constructAzul(mpBuilder);
}
