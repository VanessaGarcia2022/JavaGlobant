import duda.persona.X;
import duda.persona.Y;

public class Main {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();

        ((Y)x2).doY();

    }
}
