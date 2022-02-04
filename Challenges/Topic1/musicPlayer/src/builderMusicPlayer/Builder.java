package builderMusicPlayer;

import musicPlayers.Color;

/**
 * Common interface of builder, defines all possible ways to configure a product
 */

public interface Builder {
    void setColor(Color color);
    void setMemory(int memory);
    void setBattery(int battery);
}
