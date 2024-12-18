package Lab3.ex2;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Map<String, Integer> materials = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> notGood = new LinkedHashMap<>();

        String[] arg = scanner.nextLine().split(" ");

        for(int a = 0; a < arg.length; a+=2){
            int quantity = Integer.parseInt(arg[a]);
            String material = arg[a + 1].toLowerCase();

            if(material.equals("shards") || material.equals("motes")
            || material.equals("fragments")) {
                if (!materials.containsKey(material.toLowerCase())) {

                    materials.put(material.toLowerCase(), quantity);
                } else {

                    materials.put(material.toLowerCase(), materials.get(material) + quantity);
                }
            } else {

                if (!notGood.containsKey(material.toLowerCase())) {

                    notGood.put(material.toLowerCase(), quantity);
                } else {

                    notGood.put(material.toLowerCase(), notGood.get(material) + quantity);
                }
            }
        }

        if(materials.get("fragments") >= 250){
            System.out.println("Valanyr obtained!");
            printRes(materials,notGood);

        } else if(materials.get("motes") >= 250){
            System.out.println("Dragonwrath obtained!");
            printRes(materials,notGood);

        } else if (materials.get("shards") >= 250){
            System.out.println("Shadowmourne obtained!");
            printRes(materials,notGood);

        }
    }

    private static void printRes(Map<String, Integer> materials, Map<String, Integer> notGood) {
        materials
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(a -> {
                    System.out.printf("%s: %d",a.getKey(),a.getValue());
                });

        notGood
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(a -> {
                    System.out.printf("%s: %d",a.getKey(),a.getValue());
                });
    }
}
