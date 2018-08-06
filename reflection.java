
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class reflection {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException
	
	{
		Person p = Person.class.getConstructor(String.class ,int.class).newInstance("Shruti",22);
		
		for (Field field : p.getClass().getDeclaredFields()) {
		    field.setAccessible(true);
		    String name = field.getName();
		    Object value = field.get(p);
		    System.out.println( name +":" + value.toString() );
		}
	}
	
	

}
class Person
{
	private String name;
	private int age;
	public Person(String name,int age)
	{
		
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}