import Interf.IHotDog;
import model.BasicHotDog;
import model.ingredients.Bacon;
import model.ingredients.Pineapple;
import model.ingredients.ShoestringPotatoes;

public class App {
    public static void main(String[] args) {
        IHotDog hotDog = new BasicHotDog();
        hotDog = new Bacon(hotDog);

        hotDog.showIngredient();

        System.out.println("---------------- add other ---------------");
        hotDog = new Pineapple(hotDog);

        hotDog.showIngredient();

        hotDog = new ShoestringPotatoes(hotDog);
        System.out.println("---------------- add other ---------------");
        hotDog.showIngredient();

    }
}
