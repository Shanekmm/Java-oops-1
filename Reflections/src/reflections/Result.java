package reflections;
import java.lang.reflect.*;
import java.util.*;
public class Result {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Example e=new Example("hi");
		Class c=e.getClass();
		System.out.println(c.getName());
		Class[] i=c.getInterfaces();
		for(Class a:i)
		{
			System.out.println("interfaces:\n"+a);
		}
		Field [] f=c.getFields();
		for(Field a:f)
		{
			System.out.println("Public fields:\n"+a);
		}
		Field [] df=c.getDeclaredFields();
		System.out.println("All fields:\n");
		for(Field a:df)
		{
			System.out.println(a.getName());
		}
//		for(Field a:df)
//		{
//			if(a.getName().equals("val"))
//			{
//				a.setAccessible(true);
//				a.set(c,"Value");
//			}
//		}
		System.out.println("All fields:\n");
		for(Field a:df)
		{
			System.out.println(a.getName());
		}
		Method [] m=c.getDeclaredMethods();
		for(Method a:m)
		{
			System.out.println("methods: \n"+a.getName());
			System.out.println("return type: \n"+a.getReturnType());
			System.out.println("modifiers: \n"+a.getModifiers());
		}
		Constructor [] t=c.getDeclaredConstructors();
		for(Constructor a : t)
		{
			System.out.println("Constructor name:\n"+a.getName());
			System.out.println("Constructor parameters:\n"+a.getParameterCount());
		}
		
//		  Class c=Class.forName("Simple");    
//		  System.out.println(c.getName());   
}}
