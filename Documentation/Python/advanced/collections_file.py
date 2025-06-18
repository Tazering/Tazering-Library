# collections: Counter, namedtuple, OrderedDict, defaultdict, deque
from collections import Counter
from collections import namedtuple
from collections import OrderedDict
from collections import defaultdict
from collections import deque

a = "aaaaaabbbbbccccc"
my_counter = Counter(a)
print(my_counter)
print(my_counter.most_common(1)[0])

print(list(my_counter.elements()))


Point = namedtuple("Point", "x, y")
pt = Point(1, -4)
print(pt)
print(pt.x, pt.y)

ordered_dict = OrderedDict()
ordered_dict["a"] = 1
ordered_dict["b"] = 2
ordered_dict["c"] = 3
ordered_dict["d"] = 4

print(ordered_dict)


d = defaultdict(int)
d["a"] = 1
d["b"] = 2
print(d["c"])

d = deque()

d.append(1)
d.append(2)

d.appendleft(3)
print(d)


d.extendleft([4, 5, 6])
print(d)
d.rotate()
print(d)