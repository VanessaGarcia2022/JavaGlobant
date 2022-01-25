package models;

import exceptions.MemoryOverflowException;

/**
 * Memory class: Generate a memory representation with a matrix of 20 x 10 and
 * contains many methods for MEMORY management.
 */
public class Memory {
    // Attributes
    private final  int COLUMNS = 10;
    private final  int ROWS = 20;
    private final Process[][] MEMORY = new Process[ROWS][COLUMNS];

    /**
     * Method to print the memory status.
     */
    public void printMemory(){
        System.out.println("Memory status:");
        for (int i = MEMORY.length-1; i >= 0 ; i--) {
            for (int j = 0; j < MEMORY[i].length ; j++)
                if (MEMORY[i][j] == null)
                    System.out.print("**** ");
                else
                    System.out.print(MEMORY[i][j].getFormatID() + " ");
            System.out.println();
        }
    }

    /**
     * Method that check if there is enough space in memory to store the new process
     * @param sizeProcess size of process
     * @return returns true if there is enough space to store the process,else return false
     */
    public boolean verifyMemory(int sizeProcess) {
        int availableSpace = 0;
        int i = MEMORY.length - 1 ;
        while (i >= 0) {
            for (Process space: MEMORY[i]) {
                if (space == null) {
                    // count available spaces
                    availableSpace++;
                }
                if (availableSpace >= sizeProcess) {
                    return true;
                }
            }
            i--;
        }
        // not enough MEMORY space available to save the process
        return false;
    }

    /**
     * Method to add new process in the memory
     * @param process Object of type process to add in the memory
     * @throws MemoryOverflowException exception to No MEMORY space
     */
    public void addProcess(Process process) throws MemoryOverflowException{

        // check if there is MEMORY available to save the process
        boolean availableMemory = verifyMemory(process.getSize());
        if(!availableMemory){
            throw new MemoryOverflowException("No MEMORY space");
        }else{
            int i = 0 ;
            int spacesNeed = process.getSize();
            // add process to MEMORY
            while (i < MEMORY.length || spacesNeed != 0) {
                for (int j = 0; j < MEMORY[i].length; j++) {
                    if (spacesNeed != 0) {
                        if (MEMORY[i][j] == null) {
                            this.MEMORY[i][j] = process;
                            spacesNeed--;
                        }
                    }else break;

                }
                i++;
            }
            // print the MEMORY status
            printMemory();
        }
    }

    /**
     * Method to delete a process by id
     * @param id id of process to delete.
     */
    public void deleteProcess (int id) {
        int i = 0;
        String deleted = null;
        while (i < MEMORY.length) {
            int j = 0;
            while (j < MEMORY[i].length && MEMORY[i][j] != null) {
                // compare and delete id
                if (MEMORY[i][j].getId() == id) {
                    deleted = MEMORY[i][j].getFormatID();
                    this.MEMORY[i][j] = null;
                }
                j++;
            }
            i++;
        }
        System.out.println("Process " + deleted +" successfully deleted\n");
        //sort MEMORY
        sortMemoryProcess();
        //print the MEMORY status
        printMemory();
    }

    /**
     * Method to compact the memory when a process was deleted.
     */
    public void sortMemoryProcess(){

        int [] locationNull = new int[2];
        int [] locationNextElement;

        while(true) {
            // find the location of next null
            locationNull = findCoordinates(locationNull, "null");
            //find the location of next Object
            locationNextElement = findCoordinates(locationNull, "Object");
            // check if no element was fund
            if(locationNextElement[0] == 0 && locationNextElement[1]==0) break;
            // swap object with null
            swapValues(locationNull, locationNextElement);

        }
        //printMemory();
    }

    /**
     * Method to find the coordinates of the first element either of type Process or null
     * @param coordinates coordinates to start so search, or of the last element found
     * @param search type of object to search: Process or null
     * @return the location of the first element found
     */
    public int [] findCoordinates(int [] coordinates, String search) {

        boolean firstElement = false; // flag to check if the element was found
        int [] locationElement = new int [2]; // element coordinates
        // Start to search in the last element found.
        int i = coordinates[0];
        int j = coordinates[1];
        while (i < MEMORY.length) {
            while (j < MEMORY[i].length) {
                if( search == "null"){// find a next null
                    if (!firstElement){
                        if (MEMORY[i][j] == null) {
                            locationElement[0] = i;
                            locationElement[1] = j;
                            firstElement = true;
                            break;
                        }
                    }
                }else{ // find a next object
                    if (!firstElement){
                        if (MEMORY[i][j] != null) {
                            locationElement[0] = i;
                            locationElement[1] = j;
                            firstElement = true;
                            break;
                        }
                    }

                }
                j++;
            }
            // check if the first element is has been found
            if (firstElement) break;
            j = 0;
            i++;
        }
        // check if the first element was not found
        if(!firstElement){
            // reset the coordinates.
            locationElement[0] = 0;
            locationElement[1] = 0;
            return locationElement;
        }
        return locationElement;
    }

    /**
     * Method to swap two element (Null vs Process)
     * @param cNUll coordinates of null
     * @param cObject coordinates of the Process object
     */
    public void swapValues(int [] cNUll, int [] cObject) {
        Process temp;
        // set the object coordinates
        int oI = cObject[0];
        int oJ = cObject[1];
        // set the null coordinates
        int nI = cNUll[0];
        int nJ = cNUll[1];
        // swap the objects
        temp = MEMORY[oI][oJ];
        MEMORY[oI][oJ] = MEMORY[nI][nJ];
        MEMORY[nI][nJ] = temp;
    }

}