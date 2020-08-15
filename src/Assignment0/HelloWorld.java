package Assignment0;
public class HelloWorld implements HelloWorld_Interface {


  public HelloWorld () { // default constructor
    // explicitly include this
    // we need to have the default constructor
    // if you then write others, this one will still be there
  }

@Override
public String say_it() {
	// TODO Auto-generated method stub
	String it = new String("hello world");
	return it;
}
@Override
public String say_it_loud() {
	String loud = new String("HELLO WORLD");
	return loud;
}
  
  // rest of your code to implement the various operations
}