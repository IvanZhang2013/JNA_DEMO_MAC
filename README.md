# JNA_DEMO_MAC
jna mac demo

===
mac  中java调用c语言的函数的方法的例子

使用jna的jar包

1. 编写c的函数

2. 生成指令库
gcc -c main.c 
gcc -dynamiclib -o libNativeTest.dylib main.o

3. 使用java语言调用函数
