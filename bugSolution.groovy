```groovy
def myMethod(List<String> strings) {
  for (int i = 0; i < strings.size(); i++) {
    String str = strings.get(i)
    println "String at index $i: $str"
    try {
       if (str.contains("error")) {
         throw new RuntimeException("Error found in string: $str")
       }
    } catch (RuntimeException e) {
       println "Exception caught at index $i: ${e.message}"
       // Handle or log the exception as needed
       // Continue processing the rest of the list
    }
  }
}

myMethod(["hello", "world", "error", "test"])
```