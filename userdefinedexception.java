class invalidageexception extends Exception{
private int age;
invalidageexception(int a){
age=a;
}
public String toString() {
return "age: " +age+ " is not a valid age to vote";
}	
}
public class userdefinedexception {
static void checkage(int age) throws invalidageexception{
if(age<18)
throw new invalidageexception(age);
System.out.println("age: " +age+ " is a valid age to vote");
}
public static void main(String args[]) {
try {
checkage(21);
checkage(13);
checkage(24);
}
catch(invalidageexception e) {
System.out.println("caught the exception" +e);
}}}

