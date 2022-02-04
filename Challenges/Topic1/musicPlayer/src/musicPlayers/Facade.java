package musicPlayers;

import builderMusicPlayer.MusicPlayerBuilder;

import java.util.Locale;

/**
 * Facade of program
 */

public class Facade {

    public void CreateMP(String color, int memory, int battery){
        MusicPlayerBuilder builder = new MusicPlayerBuilder();

        //color
        color = color.toUpperCase();
        if (color.equals("BLUE")){
            builder.setColor(Color.BLUE);
        }else if (color.equals("GREEN")){
            builder.setColor(Color.GREEN);
        }else{
            System.out.println("Color not available");
            return;
        }
        //memory
        if (memory == 8){
            builder.setMemory(8);
        }else if (memory == 16){
            builder.setMemory(16);
        }else{
            System.out.println("Size of memory not available");
            return;
        }

        // battery
        if (battery == 5){
            builder.setBattery(5);
        }else if (battery == 8){
            builder.setBattery(8);
        }else{
            System.out.println("Hours of battery life not available");
            return;
        }
        //print
        System.out.println(builder);

    }
}
