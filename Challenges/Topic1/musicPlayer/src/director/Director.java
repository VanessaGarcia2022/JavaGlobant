package director;

import builderMusicPlayer.Builder;
import musicPlayers.Color;

public class Director {

    public void constructAzul(Builder builder) {
        builder.setColor(Color.AZAUL);
        builder.setBattery(5);
        builder.setMemory(8);
    }
}
