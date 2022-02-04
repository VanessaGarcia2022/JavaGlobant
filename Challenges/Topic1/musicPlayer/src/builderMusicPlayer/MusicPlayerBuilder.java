package builderMusicPlayer;

import musicPlayers.Color;
import musicPlayers.MusicPlayer;

/**
 * Concrete builders implement steps defined in common interface.
 */

public class MusicPlayerBuilder implements Builder {
    private Color color;
    private int memory;
    private int battery;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public MusicPlayer getResult() {
        return new MusicPlayer(color, memory, battery);
    }

    @Override
    public String toString() {
        return "Your music player was created successfully with the following specifications:\n" +
                "color: " + color +
                ", memory: " + memory +
                ", battery: " + battery;
    }
}
