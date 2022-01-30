package models;

/**
 * Class to create object of type Process,and set the size according a system process.
 */
public class SystemProcess extends Process {

    // Attributes
    private final int MIN = 10;
    private final int MAX = 20;

    // Constructor
    public SystemProcess() {
        super.setSize(MIN, MAX);
        super.setFormatID();
    }

    /**
     * Methos to override the method getFormatId, to the new format according to the Object type
     * @return a new formatId
     */
    @Override
    public String getFormatID(){return "s"+super.getFormatID();}
}

