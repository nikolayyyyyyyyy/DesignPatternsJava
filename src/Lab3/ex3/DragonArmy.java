package Lab3.ex3;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Map<String,Integer> nulls = new LinkedHashMap<>();
        nulls.put("damage",45);
        nulls.put("health",250);
        nulls.put("armour",10);

        Map<String, Set<Dragon>> dragons = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++){
            String[] arg = scanner.nextLine().split(" ");
            String type = arg[0];
            String name = arg[1];
            double damage;
            double health;
            double armour;

            if(Objects.equals(arg[2], "null")){
                damage = nulls.get("damage");
            } else {
                damage = Double.parseDouble(arg[2]);
            }

            if(Objects.equals(arg[3],"null")){
                health = nulls.get("health");
            } else {
                health = Double.parseDouble(arg[3]);
            }

            if(Objects.equals(arg[4],"null")){
                armour = nulls.get("armour");
            } else {
                armour = Double.parseDouble(arg[4]);
            }

            if(!dragons.containsKey(type)){

                dragons.put(type,new LinkedHashSet<>());
                dragons.get(type).add(new Dragon(name,damage,health,armour));
            } else {

                Dragon dragon = new Dragon(name,damage,health,armour);

                if(!dragons.get(type).contains(dragon)){

                    dragons.get(type).add(dragon);
                } else {

                    Dragon sameDragon = dragons.get(type)
                            .stream()
                            .filter(a -> Objects.equals(a.getName(), name))
                            .findFirst()
                            .orElse(null);
                    dragons.get(type).remove(dragon);
                    dragons.get(type).add(dragon);

                }
            }
        }

        for (String typeDragon :
                dragons.keySet()) {
            System.out.printf("%s::(%.2f/%.2f/%.2f)" + "\n",typeDragon,
                    dragons
                            .get(typeDragon)
                            .stream()
                            .mapToDouble(Dragon::getDamage)
                            .average().orElse(0),
                    dragons
                            .get(typeDragon)
                            .stream()
                            .mapToDouble(Dragon::getHealth)
                            .average().orElse(0),
                    dragons.get(typeDragon)
                            .stream()
                            .mapToDouble(Dragon::getArmour)
                            .average().orElse(0));

            for (Dragon dragon :
                    dragons.get(typeDragon)
                            .stream()
                            .sorted(Comparator.comparing(Dragon::getName))
                            .toList()) {
                System.out.printf("-%s -> damage: %.0f, health: %.0f, armour: %.0f" + "\n",
                        dragon.getName()
                        ,dragon.getDamage()
                        ,dragon.getHealth()
                        ,dragon.getArmour());
            }
        }
    }
}