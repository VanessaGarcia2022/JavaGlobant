package models;

public class ApplicationProcess extends Process {
    private final int MIN = 10;
    private final int MAX = 20;

    public ApplicationProcess() {

        super.setSize(MIN, MAX);
        super.setFormatID();
    }

    @Override
    public String getFormatID(){
        return "a"+super.getFormatID();
    }

}
