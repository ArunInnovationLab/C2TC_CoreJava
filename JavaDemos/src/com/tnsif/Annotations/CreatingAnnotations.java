package com.tnsif.Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

  
		@SuppressWarnings("unused")
		Cat cat = new Cat("Stella");
        Dog dog = new Dog();
		
		if(dog.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("This thing is very important");
		}else {
			System.out.println("This thing is not very important");
		}
		
		for(Method method: cat.getClass().getMethods()) {
			if(method.isAnnotationPresent(RunImmedietly.class)) {
				method.invoke(cat);
			}
		}
	}

}
