# Lab Report 5

## Part 1

### Conversation

> User: Jasper
>
> > I got this error message
> > ![Image-1](./lab5-img/Screenshot%202023-12-03%20141740.png)
> > I think all my command inside the bash script are correct, do you know what is a potential problem? Is it because of the linux and windows command different problem? or other problem?

> User: TA
>
> > Can you provide your code for test.sh?

> User: Jasper
>
> > Yes, definitely
> > ![Image-2](./lab5-img/Screenshot%202023-12-03%20150431.png)

> User: TA
>
> > The code I see is all right, but if you still see this error, there is an article that you can referrence and see if this fix your problem. https://stackoverflow.com/questions/55583222/invalid-flag-error-when-using-bash-to-compile-java
> > It could be because of the file is using the DOS style line endings `^M` instead of Unix line terminators. If you are interested in the difference, feel free to come to my OH.

> User: Jasper
>
> > Thank you so much! It fixed the issue.
> > The bug is exactly what you mentioned. After I fixed the file to use the Unix line terminator, the bash script runs correctly.
> > ![Image-3](./lab5-img/Screenshot%202023-12-03%20151558.png)

### Folder Stucture

```
|-- lib
|-- |-- hamcrest-core-1.3.jar
|-- |-- junit-4.13.2.jar
|-- ListExamples.java
|-- ListExamplesTests.java
|-- test.sh
```

### File info

#### Before

`ListExamples.java`
![Image-3](./lab5-img/Screenshot%202023-12-03%20151842.png)

`ListExamplesTest.java`
![Image-3](./lab5-img/Screenshot%202023-12-03%20151904.png)

`test.sh`
![Image-2](./lab5-img/Screenshot%202023-12-03%20150431.png)

#### After

No change for ListExamples.java, ListExamplesTest.java

Changes for test.sh not noticable from previous image, so I use `cat -v` instead for this case:

`test.sh`

> Before: ![Image-2](./lab5-img/Screenshot%202023-12-03%20152225.png)
> After (in file`test_fixed.sh`): ![](./lab5-img/Screenshot%202023-12-03%20152338.png)

## Part 2

During the second half of the lab, I learned how the auto grader work, which is one of the most interesting thing I learned that I never though about before. I have experience writing shell script, but I never thought of combining these commands and recreate a auto grader that can actually grade java files and code.
