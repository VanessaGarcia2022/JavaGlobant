package Main;

import Interf.IHotDog;
import UI.Menu;
import model.BasicHotDog;
import model.ingredients.Bacon;
import model.ingredients.Pineapple;
import model.ingredients.Sauces;
import model.ingredients.ShoestringPotatoes;

import java.util.Scanner;

public class App {
    // Option of menu
    public static Scanner op = new Scanner(System.in);

    //HotDog must be global.
    public static IHotDog hotDog= new BasicHotDog();

    public static void main(String[] args) {

        Menu.menu();
    }
}
