myset = set("Hello")
print(myset)

myset = {}
print(type(myset))

myset = set()
myset.add(1)
myset.add(2)
myset.add(3)

myset.remove(3)
print(myset)

myset.discard(4)
print(myset)
print(myset.pop())

for i in myset:
    print(i)

if 1 in myset:
    print("yes")

odds = {1, 3, 5, 7, 9}
evens = {0, 2, 4, 6, 8}
primes = {2, 3, 5, 7}

u = odds.union(evens)
print(u)

i = odds.intersection(primes)
print(i)

setA = {1, 2, 3, 4, 5, 6, 7, 8, 9}
setB = {1, 2, 3, 10, 11, 12}

diff = setA.difference(setB)
print(diff)

diff = setB.symmetric_difference(setA)
print(diff)

setA.update(setB)
print(setA)

setA.intersection_update(setB)
print(setA)

setA.difference_update(setB)
print(setA)


setA = {1, 2, 3, 4, 5, 6}
setB = {1, 2, 3}
print(setA.issubset(setB))

print(setB.issuperset(setA))

setA = {1, 2, 3, 4, 5, 6}

setB = setA

setB.add(7)
print(setB)
print(setA)

a = frozenset([1, 2, 3, 4])

print(a)
