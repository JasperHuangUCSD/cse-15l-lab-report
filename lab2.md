# Lab Report 2
## Part 1
*StringServer.java*
```java
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
```
## /add-message?s=Hello
![Hello](/lab2/hello.png)
- Which methods in your code are called?
  - The method called in my code is handleRequest().
- What are the relevant arguments to those methods, and the values of any relevant fields of the class?
  - The relevant argument is url with the class of URI, and the values of any relevant fields are string (class:String) and count (class:int). In this case, we get the url, containing the query information that the user enter for the url, with the string that we format and added into the string variables in the Handler class, with the count indicator formatted also added into the string variable. The values is originally "" for string and 0 for count, which is changed to "1. Hello\n" for string and 1 for count.  
- How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.
  - The url with the class of URI is changed by the request that user send to the server, containing important information such as path, which is used as the parameter and action indicator. It contains the path of "/add-message" and paramater of "s=Hello" in this case. The value of count and string inside the Handler class is changed. Specifically, the string variable is added with the additional string with a number indicated before the string, which is "1. Hello" in this case from the url. Count is added by one to change the count of the total row inside the string list, which serves as the indicator number inside the printed string when the system displayed the list. 


## /add-message?s=How are you
![How are you](/lab2/how_are_you.png)
- Which methods in your code are called?
  - The method called in my code is handleRequest().
- What are the relevant arguments to those methods, and the values of any relevant fields of the class?
  - The relevant argument is url with the class of URI, and the values of any relevant fields are string (class:String) and count (class:int). In this case, we get the url query information with the string that we format and added into the string variables in the Handler class, with the count indicator formatted also added into the string variable. The values is originally "1. Hello\n" for string and 1 for count, which is changed to "1. Hello\n2. How are you\n" for string and 2 for count.
- How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.
  - The url with the class of URI is changed by the request that user send to the server, containing important information such as path, which is used as the parameter and action indicator. It contains the path of "/add-message" and paramater of "s=How are you" in this case. The value of count and string inside the Handler class is changed. Specifically, the string variable is added with the additional string with a number indicated before the string, which is "2. How are you" in this case. Count is added by one to change the count of the total row inside the string list, which serves as the indicator number inside the printed string when the system displayed the list.

# Part 2
## Path to private key
`C:\Users\Jaspe/.ssh/id_rsa`
![ls private key](/lab2/ls_private_key.png)


## Path to public key
`/home/linux/ieng6/cs15lfa23/cs15lfa23gd/.ssh/authorized_keys`
![ls public key](/lab2/ls_public_key.png)


## A terminal interaction where you log into ieng6 with your course-specific account without being asked for a password.
![interation image](/lab2/part2-terminal-screenshot.png)

# Part 3
> During week 2 and week 3, I learned how to connect to remote server with ssh using private and public key that I haven't use nor learn before, which I found it interesting of how ssh can use public-key cryptography to verify the connection without password. 