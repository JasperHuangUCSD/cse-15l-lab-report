import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {

    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String string = "";
    int count = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return string;
        } else  {
            if (url.getPath().equals("/add-message")) {
                count += 1;
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    string +=
                            String.format("%d. %s\n", count, parameters[1]);
                    return string;
                }
            }
            return "404 Not Found!";
        }
    }
}

public class StringServer {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(
                    "Missing port number! Try any number between 1024 to 49151"
            );
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
