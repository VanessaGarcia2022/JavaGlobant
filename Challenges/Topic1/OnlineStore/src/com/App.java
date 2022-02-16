package com;

import com.models.*;

public class App {
    public static void main(String[] args) {

        // create three products
        Product tablet = new Tablet("Tablet", 516.4);
        Product microphone = new Microphone("Microphone", 256.8);
        Product mechanicalKeyboard = new MechanicalKeyboard("Mechanical keyboard", 157.6);

        // Create five subscribers
        Subscriber ana = new Subscriber("Ana");
        Subscriber angelica = new Subscriber("Angelica");
        Subscriber juanJose = new Subscriber("Juan Jose");
        Subscriber carolina = new Subscriber("Carolina");
        Subscriber federico = new Subscriber("Federico");

        // subscriptions of Ana
        tablet.attach(ana);
        microphone.attach(ana);

        // subscriptions of Angelica
        mechanicalKeyboard.attach(angelica);
        tablet.attach(angelica);

        // subscriptions of Juan Jose
        mechanicalKeyboard.attach(juanJose);

        // subscriptions of Carolina
        tablet.attach(carolina);
        microphone.attach(carolina);
        mechanicalKeyboard.attach(carolina);

        // subscriptions of federico
        tablet.attach(federico);

        tablet.setPrice(70.5);

        tablet.detach(carolina);
        System.out.println("-------------------------");
        tablet.setPrice(105.6);

        System.out.println("-------------------------");
        microphone.setPrice(89.47);








    }
}
