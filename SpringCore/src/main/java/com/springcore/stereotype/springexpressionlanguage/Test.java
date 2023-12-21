package com.springcore.stereotype.springexpressionlanguage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;


public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/springexpressionlanguage/springexpressionlanguageconfig.xml");

	Demo demo1 = context.getBean("demo1",Demo.class);
	System.out.println(demo1);
	System.out.println(demo1.hashCode());
	
	SpelExpressionParser temParser = new SpelExpressionParser();
	Expression expression  =   temParser.parseExpression("55+99");
	System.out.println(expression.getValue());

}
	}