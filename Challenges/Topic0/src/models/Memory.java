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

    private Process[][] memory = new Process[20][10];

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
     * @param sizeProcess
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

    public void deleteProcess (Process process) {
        int i = 0;
        while (i < memory.length) {
            int j = 0;
            while (j < memory[i].length && memory[i][j] != null) {
                // compare and delete id
                if (memory[i][j].getId() == process.getId()) {
                    this.memory[i][j] = null;
                }
                j++;
            }
            i++;
        }
        System.out.println("Process " + process.getFormatID() +" successfully deleted");
        //print the memory status
        printMemory();

    }

    public void sortProcess(){

    }
}