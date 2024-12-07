# Groovy eachWithIndex Exception Handling

This example demonstrates an issue with Groovy's `eachWithIndex` method when an exception is thrown within the closure. The iteration stops prematurely, not processing the remaining elements in the list. This can lead to unexpected behavior in applications that require all elements to be handled regardless of exceptions in some elements.

The `bug.groovy` file shows the problem, while `bugSolution.groovy` presents a solution using a traditional `for` loop for more explicit control over exception handling and iteration.