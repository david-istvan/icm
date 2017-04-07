package be.uantwerpen.msdl.icm.examples.full.main.scripts;

import org.apache.log4j.Level;

import be.uantwerpen.msdl.icm.runtime.variablemanager.VariableManager;
import be.uantwerpen.msdl.icm.scripting.scripts.JavaBasedScript;
import be.uantwerpen.msdl.processmodel.pm.AutomatedActivity;
import be.uantwerpen.msdl.processmodel.pm.PmFactory;

public class A1 extends JavaBasedScript {

    // TODO figure out automated generation here
    public A1() {
        AutomatedActivity activity = PmFactory.eINSTANCE.createAutomatedActivity();
        activity.setName("a1");
        activity.setId("3694bd4a-3259-4ee6-826c-091f2ab07e0f");
        setAutomatedActivity(activity);
    }

    @Override
    public void run() {
        logger.setLevel(Level.DEBUG);

        logger.debug("Executing " + this.getClass().getSimpleName());

        logger.debug(String.format("Setting variable %s to value %d", "platformMass", 100));

        VariableManager.getInstance().setVariable("platformMass", 100);
    }
}
