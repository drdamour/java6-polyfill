# java6-polyfill
Fill in java 8 types for libs that want to run on java6 and java8

# How it works
You have a lib targeting java6 but you know it will be used in java8.  You want to offer some methods that return java8 types, right? but they just aren't on your classpath.

Well...add this lib as a provided dependency to your java6 lib and you can compile and test some basic java 8 functions in java6.  Include this lib in your java 6 runtime environment..but when your lib is in java 8 don't bother...and magic!

# Why
Have you ever been on one of those legacy platforms that still is java 6 or java 7?
