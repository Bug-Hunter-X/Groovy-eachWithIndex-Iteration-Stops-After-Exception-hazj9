```groovy
def myMethod(List<String> strings) {
  strings.eachWithIndex { String str, int i ->
    println "String at index $i: $str"
    if (str.contains("error")) {
      throw new RuntimeException("Error found in string: $str")
    }
  }
}

myMethod(["hello", "world", "error", "test"])
```