# ***R Documentation***

## **Tidyverse**

Install the `tidyverse` package
```r
install.package("tidyverse")
```

Load the tidyverse package
```r
library(tidyverse)
```

Pivot Wides

## **DPLYR**

Piping 
```r
|>
```

## **ggplot2**

Basic syntax of ggplot2 package

```r
ggplot(data = <Data>) + 
    <GEOM_FUNCTION>(
        mapping = aes(<MAPPINGS>),
        stat = <STAT>,
        position = <POSITION>
    ) +
    <SCALE_FUNCTION> + 
    <COORDINATE_FUNCTION> +
    <FACET_FUNCTION> + ...
```

**Geometry**: the actual visualization used for the data

**Scales**: specific interpretation of values (discrete, continuous, etc)

**Facet**: whether to have multiple or a single graph
- `facet_wrap()`: builds new chart for every level of a categorical variable

**Coordinates**: limits and transformation can be applied to scales

**Themes**: stylistic changes to the plot not related to data

## **Coding Basics**

### Math Operations

- `+`: addition
- `-`: subtraction
- `*`: multiplication
- `/`: division
- `^` or `**`: exponentiation
- `%%`: modulo
- `%/%`: integer division

### Assignment

Objects can be assigned using `<-` or `=`
```r
x <- 3 + 4
```

### Vectors

Can create a vector
```r
evens <- c(2, 4, 6, 8)
```

Basic arithmetic applies to all elements in vector

```r
evens + 1
```

```
c(3, 5, 7, 9)
```

Access vector index using square brackets
```r
s <- c("aa", "bb", "cc", "dd", "ee")
s[3]
```
```
"cc"
```

Use combine function to collect certain values
```r
s[c(1, 4)]
```
```
"aa" "dd"
```

Use `:` to retrieve a range
```r
s[c(1:4)]
```
```
"aa" "bb" "cc" "dd"
```

*first index starts at 1 not 0*

### Commenting

Comments can be made using `#`

```r
#This is a comment
```

### Functions

You can call functions in R
```r
function_name(argument1 = value1, argument2 = value2, ...)
```

### Quotations

Use quotations for strings
```r
x <- "Data Science Rocks"
x
```

```
"Data Science Rocks"
```


