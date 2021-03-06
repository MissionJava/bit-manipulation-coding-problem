# To run this app using docker
```
    $ docker build -t number-is-power-of-two .
    $ docker run -it --rm --name number-is-power-of-two
```
# OR compile app inside docker container but run the app outside docker container

There may be an occasion where you want to just compile your app, but it is not 
appropriate to run your app inside container, then you can use below docker command
```
    $ docker run --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk:11 javac NumberIsPowerOfTwo.java
```
# How to check if a given number is a power of 2 ?
Consider a number N and you need to find if N is a power of 2. Simple solution to this problem is to repeated divide N by 2 if N is even. If we end up with a 1 then N is power of 2, otherwise not. There are a special case also. If N = 0 then it is not a power of 2. Let’s code it.

# Implementation:
```
bool isPowerOfTwo(int x) { 
    if(x == 0)
        return false;
    else {
        while(x % 2 == 0) x /= 2;
        return (x == 1);
    }
}
```

Above function will return true if x is a power of 2, otherwise false.
Time complexity of the above code is O(logN).

The same problem can be solved using bit manipulation. Consider a number x that we need to check for being a power for 2. Now think about the binary representation of (x-1). (x-1) will have all the bits same as x, except for the rightmost 1 in x and all the bits to the right of the rightmost 1.
Let, x = 4 = (100)2
x - 1 = 3 = (011)2
Let, x = 6 = (110)2
x - 1 = 5 = (101)2

It might not seem obvious with these examples, but binary representation of (x-1) can be obtained by simply flipping all the bits to the right of rightmost 1 in x and also including the rightmost 1.

Now think about x & (x-1). x & (x-1) will have all the bits equal to the x except for the rightmost 1 in x.
Let, x = 4 = (100)2
x - 1 = 3 = (011)2
x & (x-1) = 4 & 3 = (100)2 & (011)2 = (000)2
Let, x = 6 = (110)2
x - 1 = 5 = (101)2
x & (x-1) = 6 & 5 = (110)2 & (101)2 = (100)2

Properties for numbers which are powers of 2, is that they have one and only one bit set in their binary representation. If the number is neither zero nor a power of two, it will have 1 in more than one place. So if x is a power of 2 then x & (x-1) will be 0.

# Implementation:
```
bool isPowerOfTwo(int x)
{
    // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
    return (x && !(x & (x - 1)));
}
```

