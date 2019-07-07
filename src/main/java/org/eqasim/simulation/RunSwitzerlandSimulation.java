package org.eqasim.simulation;

import org.eqasim.simulation.mode_choice.SwissModeChoiceModule;
import org.eqasim.simulation.universal.UniversalConfigurator;
import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.CommandLine;
import org.matsim.core.config.CommandLine.ConfigurationException;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;

public class RunSwitzerlandSimulation {
	static public void main(String[] args) throws ConfigurationException {
		CommandLine cmd = new CommandLine.Builder(args) //
				.requireOptions("config-path") //
				.build();

		Config config = ConfigUtils.loadConfig(cmd.getOptionStrict("config-path"),
				UniversalConfigurator.getConfigGroups());
		cmd.applyConfiguration(config);

		Scenario scenario = ScenarioUtils.createScenario(config);
		UniversalConfigurator.configureScenario(scenario);
		ScenarioUtils.loadScenario(scenario);
		UniversalConfigurator.adjustScenario(scenario);

		Controler controller = new Controler(scenario);
		UniversalConfigurator.configureController(controller);
		controller.addOverridingModule(new SwissModeChoiceModule(cmd));
		controller.run();
	}
}
