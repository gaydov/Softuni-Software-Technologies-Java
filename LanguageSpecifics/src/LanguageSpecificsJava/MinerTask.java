package LanguageSpecificsJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String resource = console.nextLine();

        LinkedHashMap<String, Integer> resourcesWithQuantities = new LinkedHashMap<>();

        while (!resource.equals("stop")) {

            int quantity = Integer.parseInt(console.nextLine());

            if(!resourcesWithQuantities.containsKey(resource)) {

                resourcesWithQuantities.put(resource, quantity);
            }
            else  {

                int currentQuantity = resourcesWithQuantities.get(resource);
                resourcesWithQuantities.put(resource, currentQuantity += quantity);
            }

            resource = console.nextLine();

        }

        for (Map.Entry<String, Integer> entry : resourcesWithQuantities.entrySet()) {

            System.out.printf("%s -> %d %n", entry.getKey(), entry.getValue());
        }

    }
}
