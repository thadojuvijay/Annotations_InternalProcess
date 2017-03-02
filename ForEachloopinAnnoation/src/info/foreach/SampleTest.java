package info.foreach;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.management.InstanceAlreadyExistsException;

public class SampleTest {

	public static void main(String[] args) {
Object []obj={"new Method()","new Constructor()"};
System.out.println(obj.length);
for (Object object : obj)
{
	if(object instanceof Method)
	{
		Method method=(Method)object;
	}
	if(object instanceof Constructor)
	{
		Constructor constructor=(Constructor)object;
	}

}

	}

	
}
