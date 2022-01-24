package models;

import java.util.Formatter;

public abstract class Process {
    // Variables

    public static int count = 0;
    private int id;
    private static String formatID;
    private Formatter obj = new Formatter();
    private int size;

    //Constructor
    Process(){
        setId(++count);
    }

    //Methods
    public void setId(int id) {
        this.id = id;
    }
    public void setSize(int max, int min) {
        this.size = (int) (Math.random()*(max-min)) + min;
    }

    public void setFormatID() {
        this.formatID = String.valueOf(obj.format("%03d", getId()));
    }

    public int getId() {
        return id;
    }

   public int getSize() {
        return size;
    }

    public String getFormatID() {
        return formatID;
    }
}
