import java.lang.reflect.Array;
import java.util.ArrayList;

class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
ArrayList<Todo> todo=new ArrayList<>();
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
@Override
public String toString() {
return this.name + ", aged: " + this.age;
}
}