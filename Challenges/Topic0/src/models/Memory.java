package models;

import exceptions.MemoryOverflowException;

/**
 * models.Memory class: contains all the methods for memory management.
 * - inicializateMemory
 * - printMemory
 * - verifyMemory
 *
 */
public class Memory {

    private final Process[][] memory = new Process[20][10];

    public void inicializateMemory(){
        for (int i = 0; i < memory.length; i++)
            for (int j = 0; j < memory[i].length; j++) {
                this.memory[i][j] = null;
            }
        System.out.println("Memory initialized.");
    }


    public void printMemory(){
        System.out.println("Memory status:");
        for (int i = memory.length-1; i >= 0 ; i--) {
            for (int j = 0; j < memory[i].length ; j++)
                if (memory[i][j] == null)
                    System.out.print("**** ");
                else
                    System.out.print(memory[i][j].getFormatID() + " ");
            System.out.println();
        }
    }

    /**
     * @param sizeProcess size of process
     * @return returns true if there is enough space to store the process,else return false
     */
    public boolean verifyMemory(int sizeProcess) {
        int availableSpace = 0;
        int i = memory.length - 1 ;
        while (i >= 0) {
            for (Process space:memory[i]) {
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
        // not enough memory space available to save the process
        return false;
    }

    public void addProcess(Process process) throws MemoryOverflowException{

        // check if there is memory available to save the process
        boolean availableMemory = verifyMemory(process.getSize());
        if(!availableMemory){
            throw new MemoryOverflowException("No memory space");
        }else{
            int i = 0 ;
            int spacesNeed = process.getSize();
            // add process to memory
            while (i < memory.length || spacesNeed != 0) {
                for (int j = 0; j < memory[i].length; j++) {
                    if (spacesNeed != 0) {
                        if (memory[i][j] == null) {
                            this.memory[i][j] = process;
                            spacesNeed--;
                        }
                    }else break;

                }
                i++;
            }
            // print the memory status
            printMemory();
        }
    }

    public void deleteProcess (int id) {
        int i = 0;
        String deleted = null;
        while (i < memory.length) {
            int j = 0;
            while (j < memory[i].length && memory[i][j] != null) {
                // compare and delete id
                if (memory[i][j].getId() == id) {
                    deleted = memory[i][j].getFormatID();
                    this.memory[i][j] = null;
                }
                j++;
            }
            i++;
        }
        System.out.println("Process " + deleted +" successfully deleted\n");
        //print the memory status
        printMemory();
        //sort me mory
        sortMemoryProcess();

    }

    public void sortMemoryProcess(){

        int [] locationNull = new int [2];
        int [] locationNextElement = new int [2];
        boolean fristNull = false, nextElement = false;

        //find the first null
        int i = 0;
        while (i < memory.length) {
            int j = 0;
            while (j < memory[i].length) {
                // find a next null
                if (!fristNull){
                    if (memory[i][j] == null) {
                        locationNull[0] = i;
                        locationNull[1] = j;
                        fristNull = true;
                        break;
                    }
                }
                j++;
            }
            i++;
        }

        //find the next element
        i = locationNull[0];
        int j = locationNull[1];
        while (i < memory.length) {
            while (j < memory[i].length) {
                // find a next element
                if (fristNull){
                    if (memory[i][j] != null) {
                        locationNextElement[0] = i;
                        locationNextElement[1] = j;
                        nextElement = true;
                        break;

                    }
                }
                j++;
            }
            if (nextElement) break;
            j=0;
            i++;
        }

        System.out.println("Location of null: " + locationNull[0] + ", " + locationNull[1]);
        System.out.println("Location of next element: " + locationNextElement[0] + ", " + locationNextElement[1]);

        // swap the values
        i = locationNull[0];
        j = locationNull[1];
        int x = locationNextElement[0];
        int y = locationNextElement[1];
        Process temp;

        while( i < memory.length && x < memory.length){
            while(j < memory[i].length && y < memory[x].length) {
                if(memory[i][j] == null || memory[x][y] != null){
                    temp = memory[x][y];
                    memory[x][y] = memory[i][j];
                    memory[i][j] = temp;
                }else {
                    continue;
                }
                printMemory();
                System.out.println("------------------------------------------------------------------");
                j++;
                y++;
            }
            i++;
            x++;
            j=0;
            y=0;
        }
        printMemory();

    }
}