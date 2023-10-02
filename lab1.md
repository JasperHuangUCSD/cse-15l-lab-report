# Lab Report 1

## Examples of using the command with no argument

### Example 1
__Code__
```sh
[user@sahara ~]$ pwd
/home
```

__Working Directory Strucutre__
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

__Why this output?__
> The pwd command display the current directory that we're on. Since we're in the home directory, the output is "/home" on the command line.

__Error? If so, why it's an error__
> No, this is not an error.

### Example 2
__Code__
```sh
[user@sahara ~]$ ls
lecture1
```

__Working Directory Strucutre__
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

__Why this output?__
> The "ls" command, short for "list", help you list out all the files and directories inside the directory that I'm in, which is "/home".

__Error? If so, why it's an error__
> No, this is not an error.

### Example 3
__Code__
```sh
[user@sahara ~/lecture1]$ pwd
/home/lecture1
```

__Working Directory Strucutre__
```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
|   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

__Why this output?__
> Since I'm now inside the lecture1 directory, after I entered the "pwd" command, the displayed output will be "/home/lecture1"

__Error? If so, why it's an error__
> No, this is not an error.

## Examples of using the command with a path to a directory as an argument
### Example 4
__Code__
```sh
[user@sahara ~/lecture1]$ cd messages/
[user@sahara ~/lecture1/messages]$ 
```

__Working Directory Strucutre__
```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
|   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

__Why this output?__
> The "cd" command is exectued with a path to a directory as an argument. Since "cd" stands for change directory, the current directory of the terminal is changed. The directory we use as an argument is "messages/", which will take the current directory from "/home/lecture1" to "/home/lecture1/messages".

__Error? If so, why it's an error__
> No, this is not an error.

### Example 5
__Code__
```sh
[user@sahara ~/lecture1]$ ls messages/
en-us.txt  es-mx.txt  zh-cn.txt  zh-tw.txt
```

__Working Directory Strucutre__
```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
|   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

__Why this output?__
> The "ls" command print out all the files and directory inside the folder we specify. Since an argument of directory "messages/" is added after the "ls" command, the files printed out is the files and directories inside the directory "messages/" which is "en-us.txt  es-mx.txt  zh-cn.txt  zh-tw.txt".

__Error? If so, why it's an error__
> No, this is not an error.

### Example 6
__Code__
```sh
[user@sahara ~/lecture1]$ java messages/
Error: Could not find or load main class messages.
Caused by: java.lang.ClassNotFoundException: messages.
```

__Working Directory Strucutre__
```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
|   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

__Why this output?__
> The java command is used to compile and run .java files or run .class files. Since we specify a directory and there is no main class named "messages" inside "lecture1/", an error is displayed to tell the user that there is no class found named "messages".

__Error? If so, why it's an error__
> Yes, there is an error caused by ClassNotFoundException as there is no single messages.class file inside the current directory. 

## Examples of using the command with a path to a file as an argument
### Example 7
__Code__
```sh
[user@sahara ~/lecture1]$ javac Hello.java
[user@sahara ~/lecture1]$ 
```

__Working Directory Strucutre__
```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
|   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

__Why this output?__
> The javac command is used to compile .java files into .class files. Since we specify a file named "Hello.java" as the first argument, the Hello.class file is created without displaying in the command line.

__Error? If so, why it's an error__
> No, this is not an error.

### Example 8
__Code__
```sh
[user@sahara ~/lecture1]$ java Hello messages/en-us.txt 
Hello World!
```

__Working Directory Strucutre__
```
├── lecture1
│   ├── messages
│   │   ├── en-us.txt
|   │   ├── es-mx.txt
│   │   ├── zh-cn.txt
│   │   ├── zh-tw.txt
│   ├── Hello.class
│   ├── Hello.java
│   ├── README
```

__Why this output?__
> The java command is used to compile and run .java files or run .class files.

__Error? If so, why it's an error__
> No, this is not an error.

