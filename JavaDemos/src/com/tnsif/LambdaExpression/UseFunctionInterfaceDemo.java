package com.tnsif.LambdaExpression;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;


public class UseFunctionInterfaceDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> factorial = (n)->{
			Integer result = 1;
			for(int i=1;i<=n;i++) {
				result = result*i;
			}
			return result;
		};
		System.out.println(factorial.apply(10));
		
		System.out.println("******************");
		UnaryOperator<Integer> uo = (o)->{
			return (++o);
		};
		
		System.out.println(uo.apply(10));
		
		System.out.println("*****************");
		
		BinaryOperator<String> strConcat = (str1,str2)->{
			return str1+str2;
		};
		
		System.out.println(strConcat.apply("Hello ", "World"));
		
		System.out.println("*****************");
		
		Supplier<Integer> supplier = ()->{
			return 0;
		};
		
		System.out.println(supplier.get());
		
		System.out.println("*****************");
		
		Consumer<Integer> consumer = (n)->{
			System.out.println(n);
		};
		consumer.accept(10);
		
		System.out.println("*****************");
		
		Predicate<Integer> evenTest = num -> num%2==0;
		System.out.println(evenTest.test(10));
		System.out.println("*************************");
		Predicate<Integer> primeCheck = (num)-> {
//			boolean result = true;
//			for (int i=2;i<=num/2;i++) {
//				if(num%i==0) {
//					result = false;
//					break;
//				}
//			}
//			return result;
			int i=2;
			boolean flag = true;
			while(i<=num/2) {
				if(num%i==0) {
					flag = false;
					break;
				}
				i++;
				
			}
			return flag;
		};
		
		System.out.println(primeCheck.test(33));
		
    }
}