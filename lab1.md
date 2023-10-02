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
> The "ls" command, short for "list", help you list out all the files and directories inside the directory that I'm in, which is "/home".

__Error? If so, why it's an error__
> No, this is not an error.

## Examples of using the command with a path to a directory as an argument

## Examples of using the command with a path to a file as an argument

