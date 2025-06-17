mytuple = ("Max", 28, "Boston")
print(mytuple)

mytuple = ("Max")
print(type(mytuple))

mytuple = ("Max",)
print(type(mytuple))

mytuple = tuple(["Max", 28, "Boston"])
print(mytuple)

item = mytuple[2]
print(item)

for i in mytuple:
    print(i)

if "Max" in mytuple:
    print("Yes")
else:
    print("No")

my_tuple = ('a', 'p', 'p', 'l', 'e')
print(len(my_tuple))

print(my_tuple.count('p'))

my_list = list(my_tuple)
print(my_list)

my_tuple2 = tuple(my_list)
print(my_tuple2)

a = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
b = a[2:5]
print(b)

b = a[::2]
print(b)

my_tuple = "Max", 28, "Boston"
name, age, city = my_tuple
print(name)
print(age)
print(city)

my_tuple = (0, 1, 2, 3, 4)
i1, *i2, i3 = my_tuple
print(i1)
print(i3)
print(*i2)


import sys
my_list = [0, 1, 2, "hello", True]
my_tuple = (0, 1, 2, "hello", "True")
print(sys.getsizeof(my_list), "bytes")
print(sys.getsizeof(my_tuple), "bytes")

import timeit
print(timeit.timeit(stmt = "[0, 1, 2, 3, 4, 5]", number = 1000000))
print(timeit.timeit(stmt = "(0, 1, 2, 3, 4, 5)", number = 1000000))