package SomeFunCheck;

import inheridance.Lion;

import java.util.Map;

public class Engine {






    //https://ioflood.com/blog/java-tuple/
    public void fightCompare(Map.Entry<Lion, Double> fighters, String name) {
        //List<Pair<Lion, Double>> newFighters = new List<Pair<Lion, Double>>();
        //Pair<String, Integer> agePair = new Pair<>("Alice", 25);
        //Pair<Integer, String> p = new Pair<>(5 ,"Five");
        //Map.Entry<Lion, Double> pair = Map.entry(1, "a");
        //Pair<String, Integer> pair = Pair.of('Hello', 5);
        //System.out.println(pair);

        //Triplet<String, Integer, Boolean> triplet = Triplet.with('Hello', 5, true);
        //System.out.println(triplet);



        System.out.println(fighters.getKey());
        System.out.println(fighters.getValue());

    }



















}
