# Lab Report 4

## Task

4. Log into ieng6
5. Clone your fork of the repository from your Github account (using the SSH URL)
6. Run the tests, demonstrating that they fail
7. Edit the code file to fix the failing test
8. Run the tests, demonstrating that they now succeed
9. Commit and push the resulting change to your Github account (you can pick any commit message!)

## Step 4

![Step 4 ScreenShot](/lab4-img/step-4.png)

Keys pressed:

```
ssh<space>cs15lfa23gd@ieng6.ucsd.edu<enter>
```

Explanation:

> The commend is never run in the terminal, which we need to type out the entire command includign the host that we're connecting to. The ssh key is already set up, so no password required.

## Step 5

![Step 5 ScreenShot](/lab4-img/step-5.png)

Keys pressed:

```
<open-website(https://github.com/jasper-hyj/lab7)>
<click-button(<> Code)>
<click-button(copy)>
<open-terminal>
git<space>clone<space><right-click>
```

Explanation:

> First go to webiste and copy the link by clicking the copy button in the website that copy the ssh link of the repository. Then go back to terminal type out the `git clone ` commmand and use right click to paste the link that we copy from the website `https://github.com/jasper-hyj/lab7`

## Step 6

![Step 6 ScreenShot](/lab4-img/step-6.png)

Key pressed:

```
cd<space>l<tab><enter>
bash<space>t<tab><enter>
```

Explanation:

> First use `cd` command to go in the directory we just clone. Since only `lab7` directory start with `l`, type `l` and then `<tab>` to auto-complete the directory name and press `enter` to execute. We then run the `test.sh` file by first type `bash`, and then type `t` and then `<tab>` to auto-complete the file name since only `test.sh` start with `t`.

## Step 7

![Step 7-1 ScreenShot](/lab4-img/step-7-1.png)

Key pressed:

```
vim<space>L<tab>.<tab><enter>
```

Explanation:

> First type `vim` command to open the vim editor for the .java file. Specify the file to open by first type `L` to specify the file name and `tab` to auto complete to `ListExamples`, then type `.` and `tab` to specify the file name to `ListExamples.java` instead of `ListExamplesTests.java`.

![Step 7-1 ScreenShot](/lab4-img/step-7-2.png)

Key pressed:

```
:set number<enter>
44gg
e
i
<delete>
2
<esc>
:x<enter>
```

Explanation:

> First type `:set number<enter>` to make the vim editor to display the line number. Sednd, use `44gg` to jump the cursor to line 44 since the code we want to fix is at line 44. After that, the `e` command move to the very end of the word `index1`, and change the mode to insert mode using `i` command. Then, we delete the number 1 with `<delete>` and type the number `2` in. Finally, we save the file by changing the mode to the normal mode by pressing `esc`, and save and quit the vim editor by typing `:x<enter>`.

## Step 8

![Step 8 ScreenShot](/lab4-img/step-8.png)

Key pressed:

```
bash<space>t<tab><enter>
```

Explanation:

> We use the `bash` command to run the `test.sh` bash script, which we first type `bash<space>t` and auto-complete the file name by typing `<tab>` and then `<enter>` to execute the command.

## Step 9

![Step 9 ScreenShot](/lab4-img/step-9.png)
Key pressed:

```
git<space>add<space>.<enter>
git<space>commit<space>-m<space>"fix<space>error"<enter>
git<space>push<enter>
```

Explanation:

> First we type out `git<space>add<space>.<add>` to add all the files in the directory to git. Then, we type out `git<space>commit<space>-m<space>` follow with the commit message `"fix<space>error"` and `<enter>` to execute the command. Lastly, we type `git<space>push<enter>` to push the changes to the directory to github.
