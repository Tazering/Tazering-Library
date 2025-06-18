import random 

random.seed(1)
a = random.random()
print(a)

a = random.uniform(1, 10)
print(a)

a = random.normalvariate(0, 1)
print(a)

mylist = list("ABCDEFGH")
print(mylist)

a = random.choices(mylist, k = 3)
print(a)


import secrets

a = secrets.randbelow(10)
print(a)

a = secrets.randbits(4)
print(a)

mylist = list("ABCDEFGH")
a = secrets.choice(mylist)
print(a)

import numpy as np

a = np.random.rand(3, 3)
print(a)