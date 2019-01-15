# api-standard
RESTful API toolkit

## Parameter parser

```xml
<dependencies>
  <dependency>
    <groupId>net.unit8.apistandard</groupId>
    <artifactId>parameter-parser</artifactId>
    <version>0.1.0</version>
  </dependency>
</dependencies>
```

### ResourceFilter

`ResourceFilter` is a parser for `embed` and `filter` parameters. The specification of the parameter
can have nested fields. 
 
```java
ResourceFilter resourceFilter = new ResourceFilter();
List<ResourceField> resourceFields = resourceFilter.parse("(a,b,c)");
```

### SortParser

`SortParser` is a parser for a `sort` parameter. The prefix `+` means ascend order and the prefix
`-` means descend order. a default order is descend. 

```java
SortParser parser = new SortParser();
List<SortField> sortFields = parser.parse("+a,-b,c");
```

## License

Copyright by kawasima <kawasima1016@gmail.com>. Licensed under Eclipse Public License v2.0.

