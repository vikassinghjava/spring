package mypack;

public class Person 
{
	System.out.println("hello Person");
  int id; String name;
Person(String name)
{
	this.name=name;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
}
