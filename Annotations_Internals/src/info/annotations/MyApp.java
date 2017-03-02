package info.annotations;

import java.lang.annotation.Annotation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,ClassCastException
	{
		
		/*we internally use reflection Api to get annotation elements from top of the  calss,
		top of the methods,top of the fields.top of the package level.
		
		* in the java.lang.reflect package we have Interface AnnotatedElement.
		in that AnnotatedElement interface. we have one method with name getAnnotation()
		 Annotation[]	getAnnotations()
         Returns annotations that are present on this element.
         * By using this method we can see annotation elements on the top of the
         field,Class, Constructor, Executable, Field, Method,
          Package, Parameter.
          
      if you want to use that method.we need implementation of that Interface AnnotatedElement.
       All Known Implementing Classes of AnnotatedElement:
AccessibleObject, Class, Constructor, Executable, Field, Method, Package, Parameter.

if the class,constructor,Executable, Field, Method, Package, Parameter have implementation of
 AnnotatedElement interface then we have the method           
                           getAnnotation();
       By using this method we can see all annotation elements on top of the class,constructor,
       Executable, Field, Method, Package, Parameter.
                create object of class and object of method,object of constructor
                to use the getAnnotation();
                 this is why we use reflection Api internally.
         
		We have AnnotatedType interface */
		Class cls=Cone.class;
		 Annotation[] annotation=cls.getAnnotations();
		 System.out.println(annotation.length);
for (Annotation annotation2 : annotation) 
{

	if(annotation2 instanceof MyAnnotationTwo)
	{
		
	}
	
	if(annotation2 instanceof MyAnnotationone)
	{
		MyAnnotationone annotationone= (MyAnnotationone)annotation2;
		String name = annotationone.author();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bms", "abc");
		Statement statement = connection.createStatement();
		statement.executeUpdate("create table "+name+"(id varchar2(50),name varchar2(50))");
		
	}
}

}
}
