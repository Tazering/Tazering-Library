my_string = "    Hello World    "
my_string = my_string.strip()
print(my_string)

my_string = "    Hello World    "
my_string.strip()
print(my_string)

print(my_string.count("pp"))
print(my_string.find("pp"))
print(my_string.replace('World', "Universe"))
print(my_string)

my_string = "how,are,you,doing"
my_list = my_string.split(",")
print(my_list)
new_string = ' '.join(my_list)
print(new_string)

var = 3
my_string = "the variable is %.2f" % var
print(my_string)

var = 3.141592
var2 = 6
my_string = "the variable is {:.2f} and {}".format(var, var2)
print(my_string)

