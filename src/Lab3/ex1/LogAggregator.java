package Lab3.ex1;

import java.util.*;

public class LogAggregator {
    public static void main(String[] args) {

        Map<String, User> users = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] arg = scanner.nextLine().split(" ");
            String api = arg[0];
            String name = arg[1];
            double duration = Double.parseDouble(arg[2]);

            if(!users.containsKey(name)){
                User user = new User(name, duration);
                user.addApi(api);
                users.put(name,user);
            }
            else {
                users.get(name).addApi(api);
                users.get(name).setDuration(users.get(name).getDuration() + duration);
            }
        }

        for (String name : users.keySet()
                .stream()
                .sorted()
                .toList()){

            System.out.printf("%s: %.0f %s" + "\n",name
                    ,users.get(name).getDuration()
                    , Arrays.toString(users.get(name).getApis().stream().sorted().toArray()));
        }
    }
}
