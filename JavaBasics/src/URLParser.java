import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String protocol = "";
        String server = "";
        String resource = "";

        int twoSlashesIndex = input.indexOf("://");
        if (twoSlashesIndex != -1) {

            String[] inputSplit = input.split("://");
            protocol = inputSplit[0];
            String serverAndResource = inputSplit[1];
            int oneSlashIndex = serverAndResource.indexOf("/");
            if (oneSlashIndex != -1) {
                resource = serverAndResource.substring(oneSlashIndex + 1);
                server = serverAndResource.substring(0, oneSlashIndex);
            } else {
                server = serverAndResource;
            }
        } else {
            int oneSlashIndex = input.indexOf("/");
            String[] inputSplit = new String[2];
            if (oneSlashIndex != -1) {
                inputSplit = input.split("/");
                server = inputSplit[0];
                resource = inputSplit[1];
            } else {
                server = input;
            }
        }
        String newLine = System.getProperty("line.separator");

        System.out.printf("[protocol] = \"%s\"%s", protocol.trim(), newLine);
        System.out.printf("[server] = \"%s\"%s", server.trim(), newLine);
        System.out.printf("[resource] = \"%s\"%s", resource.trim(), newLine);
    }
}
