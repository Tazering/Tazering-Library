# ***Matlab Documentation***

## **Overview**
Matlab is a high-level programming language and interactive environment for numerical computation, visualization, and programming. The term *matlab* means *Matrix Laboratory*. Matlab has a variety application ranging from image processing, biomedicine, machine learning and many others.

## **Installations**



## **Syntax**

## **Commands**

Matrix Creation

```matlab
a = [1 2 3 4; 5 6 7 8]
# create 2 x 4 matrix 
#[1 2 3 4]
#[5 6 7 8]
```
- semicolon indicates next row

Reduced Row-Echelon Form
```matlab
[Rb, pb] = rref(M)
# looks for the reduced row echelon form of a matrix
```
- *M* is the parameter of data type: matrix
    - the matrix you want to reduce
- returns two things
    - reduced row echelon form of M
    - row vector of pivot point locations

```matlab
Ab = cell2mat(varargin) # converts an array of matrices to single matrix
```

- *varargin* is the parameter of data type: array
- return matrix array

## **Resources**

[Matlab Documentation](https://www.mathworks.com/help/matlab/)