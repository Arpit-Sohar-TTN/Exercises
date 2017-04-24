/**
 * Created by arpit on 19/4/17.
 */
class Stack {
    List<Object> objectList = new ArrayList<Object>()
    void push (Object obj) {
        objectList.add(obj)
    }
    Object pop() {
        if (objectList.size()>0)
        objectList.remove(objectList.size()-1)
        else
            println "Please push atleast 1 object"
    }
    Object top() {
        if (objectList.size()>0)
        objectList.get(objectList.size()-1)
        else
        println "Please push atleast 1 object"

    }

}
class Exercise15 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pop() //Pop element before push
        stack.top() //finding top element before push

        println "Pushing elements"
        stack.push(new Integer(1))
        stack.push("Arpit")
        stack.push("JVM Department")
        stack.push("To The New")
        println stack.objectList.toString()
        println stack.objectList.size()
        println stack.pop()
        println stack.objectList.size()
        println stack.top()
    }
}