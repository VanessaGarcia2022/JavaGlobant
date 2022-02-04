package musicPlayers;

/**
 * MusicPlayer is a product class.
 */
public class MusicPlayer {

    private final Color color;
    private final int memory;
    private final int battery;

    public Color getColor() {
        return color;
    }

    public int getMemory() {
        return memory;
    }

    public int getBattery() {
        return battery;
    }

    public MusicPlayer(Color color, int memory, int battery){
        this.color = color;
        this.memory = memory;
        this.battery = battery;

    }
}
