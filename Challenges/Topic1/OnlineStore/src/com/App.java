package com;

import com.interfaces.Subject;
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
        ana.subscribe(tablet);
        tablet.attach(ana);

        ana.subscribe(microphone);
        microphone.attach(ana);

        // subscriptions of Angelica
        angelica.subscribe(mechanicalKeyboard);
        mechanicalKeyboard.attach(angelica);

//        angelica.subscribe(microphone);
//        microphone.attach(angelica);

        // subscriptions of Juan Jose
//        juanJose.subscribe(mechanicalKeyboard);
//        mechanicalKeyboard.attach(juanJose);

        // subscriptions of Carolina
        carolina.subscribe(tablet);
        tablet.attach(carolina);

//        carolina.subscribe(microphone);
//        microphone.attach(carolina);

//        carolina.subscribe(mechanicalKeyboard);
//        mechanicalKeyboard.attach(carolina);

        // subscriptions of federico
        federico.subscribe(tablet);
        tablet.attach(federico);

        tablet.setPrice(70.5);









    }
}
