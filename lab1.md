# Lab Report 1

## Examples of using the command with no argument

### Example 1

**Code**

```sh
[user@sahara ~]$ cd
[user@sahara ~]$
```

**Working Directory Structure**

```
├── home
│   ├── lecture1
│   │   ├── messages
│   │   │   ├── en-us.txt
│   │   │   ├── es-mx.txt
│   │   │   ├── zh-cn.txt
│   │   │   ├── zh-tw.txt
│   │   ├── Hello.class
│   │   ├── Hello.java
│   │   ├── README
```

**Why this output?**

> The `cd` command change the directory of the current directory to the directory that we specify. Since no directory is specify here, the `cd` command doesn't do anything and return nothing.

**Error? If so, why it's an error**

> No, this is not an error.

### Example 2

**Code**

```sh
[user@sahara ~]$ ls
lecture1
```

**Working Directory Structure**

```
├── home
│   ├── lecture1
│   │   ├── messages
│   │   │   ├── en-us.txt
│   │   │   ├── es-mx.txt
│   │   │   ├── zh-cn.txt
│   │   │   ├── zh-tw.txt
│   │   ├── Hello.class
│   │   ├── Hello.java
│   │   ├── README
```

**Why this output?**

> The `ls` command, short for list, help you list out all the files and directories inside the directory that I'm in, which is `/home`

**Error? If so, why it's an error**

> No, this is not an error.

### Example 3

**Code**

```sh
[user@sahara ~]$ cat

```

**Working Directory Structure**

```
├── home
│   ├── lecture1
│   │   ├── messages
│   │   │   ├── en-us.txt
│   │   │   ├── es-mx.txt
│   │   │   ├── zh-cn.txt
│   │   │   ├── zh-tw.txt
│   │   ├── Hello.class
│   │   ├── Hello.java
│   │   ├── README
```

**Why this output?**

> After entering `cat` command, the program didn't output anything and stop working because the command line is waiting for the user to input something after the command of `cat`, which the command line will stay there until user enter something or force stop the command with ctrl-c.

**Error? If so, why it's an error**

> Yes, this is an error because the command line stop doing anything and just waiting for user to input something to continue working because arugment is required to run this command.

## Examples of using the command with a path to a directory as an argument

### Example 4

**Code**

```sh
[user@sahara ~/lecture1]$ cd messages/
[user@sahara ~/lecture1/messages]$
```

**Working Directory Structure**

```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
│   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

**Why this output?**

> The `cd` command is exectued with a path to a directory as an argument. Since `cd` stands for change directory, the current directory of the terminal is changed. The directory we use as an argument is `messages/`, which will take the current directory from `/home/lecture1` to `/home/lecture1/messages`.

**Error? If so, why it's an error**

> No, this is not an error.

### Example 5

**Code**

```sh
[user@sahara ~/lecture1]$ ls messages/
en-us.txt  es-mx.txt  zh-cn.txt  zh-tw.txt
```

**Working Directory Structure**

```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
│   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

**Why this output?**

> The `ls` command prints out all the files and directory inside the folder we specify. Since an argument of directory `messages/` is added after the `ls` command, the files printed out is the files and directories inside the directory `messages/` which is `en-us.txt es-mx.txt zh-cn.txt zh-tw.txt`.

**Error? If so, why it's an error**

> No, this is not an error.

### Example 6

**Code**

```sh
[user@sahara ~/lecture1]$ cat messages/
cat: messages/: Is a directory
```

**Working Directory Structure**

```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
│   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

**Why this output?**

> The `cat` command is used to print out the file in the command line, since we specify a directory, the output from the command line is `cat: messages/: Is a directory` which tell the user that `messages/` is a directory instead of file that can be print out.

**Error? If so, why it's an error**

> Yes, there is an error caused by giving the `cat` command a directory as the first argument, which the `cat` doesn't accept directory as input so output a `cat: messages/:Is a directory` error in the command line.

## Examples of using the command with a path to a file as an argument

### Example 7

**Code**

```sh
[user@sahara ~/lecture1]$ cd Hello.java
bash: cd: Hello.java: Not a directory
```

**Working Directory Structure**

```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
│   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

**Why this output?**

> Since the `cd` command is used to change the current working directory to another directory, after running the command with a file specify as the first argument, the command line return a `bash: cd: Hello.java: Not a directory` which said that you cannot change the directory to a file.

**Error? If so, why it's an error**

> Yes, this is an error because we pass a argument specify a file to the change directory command, which `cd` doesn't take file as the argument input and return `bash: cd: Hello.java: Not a directory` error information to the user.

### Example 8

**Code**

```sh
[user@sahara ~/lecture1]$ ls Hello.java
Hello.java
```

**Working Directory Structure**

```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
│   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

**Why this output?**

> The `ls` command list out the files and directories of the input relative/absolute path in the first argument. Since we passed a specific file `Hello.java`, the only thing printed out is `Hello.java` since the file is specify and the only file or directory under that path is `Hello.java`.

**Error? If so, why it's an error**

> No, this is not an error.

### Example 9

**Code**

```sh
[user@sahara ~/lecture1]$ cat Hello.java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hello {
  public static void main(String[] args) throws IOException {
    String content = Files.readString(Path.of(args[0]), StandardCharsets.UTF_8);
    System.out.println(content);
  }
```

**Working Directory Structure**

```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
│   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

**Why this output?**

> The `cat` command printed out the file specify in the first argument. In this case, `Hello.java` specified, so the output displayed in the command line is the java program in plain text.

**Error? If so, why it's an error**

> No, this is not an error.
