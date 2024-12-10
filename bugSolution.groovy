```groovy
def myMethod(Object obj) {
  if (obj instanceof String) {
    println "String: "+obj.toUpperCase()
  } else if (obj instanceof Integer) {
    println "Integer: "+obj * 2
  } else if(obj.is(List)){
    println "List: "+obj
  } else {
    println "Other: "+obj.toString()
  }
}

myMethod(10)
myMethod( "hello")
myMethod([1,2,3])
```