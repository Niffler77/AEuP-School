package OtherThings.WeightedRandom;

import OtherThings.Main;

import java.util.ArrayList;
import java.util.Random;

public class WeigthedRandom {

    public static void WeightedRng() {
        ArrayList<Broker> brokers = new ArrayList<Broker>();
        brokers.add(new Broker(1, Main.Weightname.Platin));
        brokers.add(new Broker(100, Main.Weightname.Diamant));
        brokers.add(new Broker(2000, Main.Weightname.Gold));
        brokers.add(new Broker(15000, Main.Weightname.Silver));
        brokers.add(new Broker(15000000, Main.Weightname.Bronze));

        int bronzeamount = 0;
        int silveramount = 0;
        int goldamount = 0;
        int diaamount = 0;
        int platinamount = 0;
        for (int i = 0; i < 100000000; i++ ) {
            switch (GetWeight(brokers).name) {
                case Bronze -> bronzeamount++;

                case Silver -> silveramount++;

                case Gold -> goldamount++;

                case Diamant -> diaamount++;

                case Platin ->  platinamount++;
            }
        }

        System.out.println("Bronze: " + bronzeamount);
        System.out.println("Silver: " + silveramount);
        System.out.println("Gold: " + goldamount);
        System.out.println("Diamant: " + diaamount);
        System.out.println("Platin: " + platinamount);

    }

    public static Broker GetWeight(ArrayList<Broker> brokers) {
        int totalweight = 0;
        for (var broker : brokers) {
            totalweight += broker.weight;
        }

        Random random = new Random();

        var randomnumber = random.nextInt(totalweight);

        Broker selectedBroker = null;
        for (var broker : brokers) {
            if (randomnumber < broker.weight) {
                selectedBroker = broker;
                break;
            }

            randomnumber -= broker.weight;
        }

        return selectedBroker;
    }
}
