package models;

import java.util.Formatter;

/**
 * Process abstract class: define the object type Process, and contains the methods for define
 * the attributes of an object.
 */
public abstract class Process {
    // Attributes
    public static int count = 0;
    private int id;
    private String formatID;
    private final Formatter obj = new Formatter();
    private int size;

    //Constructor
    Process(){
        setId(++count);
    }

    //Methods

    /**
     * Method to set the id process
     * @param id id of process
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method to set the size based in the min and max possible size.
     * @param max maximum size
     * @param min minimum size
     */
    public void setSize(int max, int min) {
        this.size = (int) (Math.random()*(max-min)) + min;
    }

    /**
     * Method to give a correct format to id (00x)
     */
    public void setFormatID() {
        this.formatID = String.valueOf(obj.format("%03d", getId()));
    }

    /**
     * Method to get the id object
     * @return id of object
     */
    public int getId() {
        return id;
    }

    /**
     * Method to get the size of the object
     * @return size of the object
     */
    public int getSize() {
        return size;
    }

    /**
     * Method to get the correct format of id
     * @return correct format of id
     */
    public String getFormatID() {
        return formatID;
    }
}
