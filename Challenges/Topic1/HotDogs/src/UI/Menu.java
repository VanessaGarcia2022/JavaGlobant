package UI;


import Main.App;
import model.ingredients.Bacon;
import model.ingredients.Pineapple;
import model.ingredients.Sauces;
import model.ingredients.ShoestringPotatoes;

public class Menu {
    public static void menu(){

        int op;
        System.out.println("\t\t\t\t\n\n******* Welcome to Doggolicious *******\n\n");

        do{
            System.out.println("Select an option:");
            System.out.println("1 - Add ingredients");
            System.out.println("2 - show hot dog status");
            System.out.println("3 - Finish");
            op = App.op.nextInt();

            switch (op){
                case 1:
                    showMenuIngredients();
                    break;
                case 2:
                    System.out.println("These are the current ingredients of your hot dog:");
                    App.hotDog.showIngredient();
                    System.out.println("\n***************************************************\n");
                    break;
                case 3:
                    System.out.println("\n" +"Your hot dog has been successfully created with the following ingredients: ");
                    App.hotDog.showIngredient();
                    System.out.println("\n\nIt was a pleasure serving you, see you later");

                    return;
                default:
                    System.out.println("Please choose an option");
            }
        }while(true);
    }
    public static void showMenuIngredients(){
        int op = 0;
        System.out.println("Choose your addition:");
        System.out.println("1 - Sauces");
        System.out.println("2 - Bacon");
        System.out.println("3 - Pineapple in pieces");
        System.out.println("4 - Shoestring Potatoes");
        System.out.println("5 - Finish");
        op = App.op.nextInt();

        switch (op){
            case 1:
                App.hotDog = new Sauces(App.hotDog);
                break;
            case 2:
                App.hotDog = new Bacon(App.hotDog);
                break;
            case 3:
                App.hotDog = new Pineapple(App.hotDog);
                break;
            case 4:
                App.hotDog = new ShoestringPotatoes(App.hotDog);
                break;
            case 5:
                return;
            default:
                System.out.println("Please choose an ingredient");
        }
    }

}
