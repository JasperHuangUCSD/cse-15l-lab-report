# Lab Report 3

## Part 1

### Associated Code

```java
public class ArrayExamples {
    // Changes the input array to be in reversed order
    static void reverseInPlace(int[] arr) {
        for(int i = 0; i < arr.length; i += 1) {
            arr[i] = arr[arr.length - i - 1];
        }
    }
}
```

Failure-inducing Input (Test)

```java
@Test
public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 4, 5, 6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, input1);
}
```

Non Failure-inducing Input

```java
@Test
public void testReverseOneElementInPlace() {
    int[] input1 = {1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1}, input1);
}
```

### Symptoms

```
JUnit version 4.13.2
..E
Time: 0.044
There was 1 failure:
1) testReverseInPlace(ArrayTests)
arrays first differed at element [3]; expected:<3> but was:<4>
        at org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:78)
        at org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:28)
        at org.junit.Assert.internalArrayEquals(Assert.java:534)
        at org.junit.Assert.assertArrayEquals(Assert.java:418)
        at org.junit.Assert.assertArrayEquals(Assert.java:429)
        at ArrayTests.testReverseInPlace(ArrayTests.java:11)
        ... 32 trimmed
Caused by: java.lang.AssertionError: expected:<3> but was:<4>
        at org.junit.Assert.fail(Assert.java:89)
        at org.junit.Assert.failNotEquals(Assert.java:835)
        at org.junit.Assert.assertEquals(Assert.java:120)
        at org.junit.Assert.assertEquals(Assert.java:146)
        at org.junit.internal.ExactComparisonCriteria.assertElementsEqual(ExactComparisonCriteria.java:8)
        at org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:76)
        ... 38 more

FAILURES!!!
Tests run: 2,  Failures: 1
```

### Fix the Bug

#### Before:

```java
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
        arr[i] = arr[arr.length - i - 1];
    }
}
```

#### After:

```java
static void reverseInPlace(int[] arr) {
    for (int i = 0; i < arr.length / 2; i += 1) {
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }
}
```

> The fix addresses the issue because the value is updated without storing the previous value. Before the temp variable is added and the loop is loop only for half of the array, the `arr[i] = arr[arr.length - i - 1];` directly override the value that we need to save it and interchange it. By loop through only half of the array and switch the elements between each other with the value stored in the `temp` first address the problem that the method change the array value with the wrong way.

## Part 2

### Command Interested `find`

#### First Option: `find -iname [name]`

1. First Example

```bash
jasperhuang@Jasper-Surface:/mnt/c/Users/Jaspe/Desktop/github_repo/cse-15l-lab/lab5/docsearch$ find -iname "*result*txt"
./find-results.txt
./grep-results.txt
```

2. Second Example

```bash
jasperhuang@Jasper-Surface:/mnt/c/Users/Jaspe/Desktop/github_repo/cse-15l-lab/lab5/docsearch$ find -iname "*0023*txt"
./technical/biomed/gb-2002-3-5-research0023.txt
./technical/plos/pmed.0010023.txt
./technical/plos/pmed.0020023.txt
```

> The `-iname` option help you search for the file while not knowing the complete file name of that file. It is useful when you forgot the entire file name and you're trying to find the file inside a large amount of files and directories.
