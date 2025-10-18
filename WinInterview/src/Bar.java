interface Foo {
String name ="Foo";

void print();
}

class Bar implements Foo {

String name = "Bar";

public void print()
{ 
	System.out.println(name); // Line 1
}

public static void main(String[] args) { 
  Foo foo= new Bar(); // Line 2
  foo.print(); // Line 3
}}
