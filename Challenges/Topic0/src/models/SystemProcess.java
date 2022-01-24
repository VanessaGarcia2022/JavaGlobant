package models;

public class SystemProcess extends Process {

    private final int MIN = 10;
    private final int MAX = 20;

    public SystemProcess() {
        super.setSize(MIN, MAX);
        super.setFormatID();
    }

    @Override
    public String getFormatID(){
        return "s"+super.getFormatID();
    }
}
