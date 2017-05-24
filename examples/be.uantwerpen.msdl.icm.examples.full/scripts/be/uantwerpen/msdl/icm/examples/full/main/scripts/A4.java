package be.uantwerpen.msdl.icm.examples.full.main.scripts;

import org.apache.log4j.Level;
import java.util.Map;
import com.google.common.collect.Maps;

import be.uantwerpen.msdl.icm.runtime.scripting.scripts.JavaBasedScript;
import be.uantwerpen.msdl.icm.runtime.variablemanager.VariableManager;

public class A4 extends JavaBasedScript{
	
	private Map<Object, Object> parameters = Maps.newHashMap();
	
	//Constructor
	public A4() {
		parameters.put("totalMass", "161.0");
	}
	
	@Override
	public void run() {
		logger.setLevel(Level.DEBUG);
		logger.debug("Executing " + this.getClass().getSimpleName());
		
		ChangeValue changeValue = new ChangeValue();
		
		changeValue.runWithParameters(parameters);
	}
}
