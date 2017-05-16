package io.swagger.client.api;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Map;

import org.junit.Test;

import io.swagger.client.model.Execution;
import io.swagger.client.model.PipelineParameter;

public class ValuesTest {
	@Test
	public void inputValueTest(){
		Execution executionTest = new Execution();
		Object param = executionTest.getInputValues(); 
		boolean test = param instanceof Map;;
		assertTrue(test);
	}
	
	@Test
	public void defaultValueTest(){
		Class classTest = new PipelineParameter().getClass();               
		Field[] m = classTest.getDeclaredFields();

		for(int i = 0; i < m.length; i++){
			//System.out.println(m[i].getName());
			if(m[i].getName() == "defaultValue"){
				boolean test = m[i].getName() instanceof Object;
				//System.out.println(test);
				assertTrue(test);
				return;
			}
		}
		assertTrue(false);
	}
}
