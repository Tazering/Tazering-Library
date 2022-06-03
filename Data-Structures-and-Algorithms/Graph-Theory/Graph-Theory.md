# ***Graph Theory***

**directed graph**: relationships are only one way


## **Shortest Path Algorithm**

**Breadth First Search**: algorithm to find the shortest path

- Process
```
    - queue containing nodes to check

    loop while queue is empty

        - pop a node off the queue
        - check for target node
        - if target node is found => end
        - else => add neighbors to the queue

    endloop

    - if queue is empty => target node does not exist
```
- Make sure to check if your node has been checked
- O(V + E) where V is a vertex and E is an edge
    - linear

**Dijkstra's Algorithm**
- Process

    1. start at a random node
    2. find cheapest node
    3. check whether there is a cheaper path to the neighbors of this node
        - update cost accordingly
    4. repeat until cheapest cost is known for every node
    5. calculate final path
    

**Queue**: first in, first out
- *enqueue*: adds the element to the front of the queue
- *dequeue*: removes the oldest element in the queue

**Stack**: last in, first out

