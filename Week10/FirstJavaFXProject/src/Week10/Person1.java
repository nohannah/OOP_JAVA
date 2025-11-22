package Week10;
import java.util.ArrayList;
public class Person1 {
String name;
int age;
ArrayList<Todo> todos = new ArrayList<>();
Person1(String name, int age) {
this.name = name;
this.age = age;
}
void increaseAge() {
this.age += 1;
}
void decreaseAge() {
this.age -= 1;
}
void setName(String name) {
this.name = name;
}
public void addTodo(Todo todo) {
this.todos.add(todo);
}

@Override
public String toString() {
return this.name + ", aged: " + this.age;
}
}
