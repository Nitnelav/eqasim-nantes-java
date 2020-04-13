package org.eqasim.wayne_county.mode_choice.parameters;

import org.eqasim.core.simulation.mode_choice.parameters.ModeParameters;

public class WayneCountyModeParameters extends ModeParameters {

	public class WayneCountyWalkParameters {
		public double alpha_low_income = 0.0;
		public double alpha_medium_income = 0.0;
		public double alpha_high_income = 0.0;
		public double beta_time_min = 0.0;
	}
	
	public class WayneCountyBikeParameters {
		public double alpha_low_income = 0.0;
		public double alpha_medium_income = 0.0;
		public double alpha_high_income = 0.0;
		public double beta_time_min = 0.0;
	}	

	public class WayneCountyPTParameters {
		public double alpha_low_income = 0.0;
		public double alpha_medium_income = 0.0;
		public double alpha_high_income = 0.0;
		public double beta_time_min = 0.0;
	}

	public class WayneCountyDRTParameters {
		public double alpha_low_income = 0.0;
		public double alpha_medium_income = 0.0;
		public double alpha_high_income = 0.0;
		public double beta_time_min = 0.0;
		public double betaWaitingTime_u_min = 0.0;
		public double betaAccessEgressTime_u_min = 0.0;
	}

	public class WayneCountyCarParameters {
		public double beta_time_min = 0.0;
		public double alpha_low_income = 0.0;
		public double alpha_medium_income = 0.0;
		public double alpha_high_income = 0.0;
	}

	public class WayneCountyCostParameters {
		public double beta_cost_low_income = 0.0;
		public double beta_cost_medium_income = 0.0;
		public double beta_cost_high_income = 0.0;
	}


	public final WayneCountyWalkParameters wcWalk = new WayneCountyWalkParameters();
	public final WayneCountyBikeParameters wcBike = new WayneCountyBikeParameters();	
	public final WayneCountyPTParameters wcPT = new WayneCountyPTParameters();
	public final WayneCountyDRTParameters wcDRT = new WayneCountyDRTParameters();
	public final WayneCountyCarParameters wcCar = new WayneCountyCarParameters();
	public final WayneCountyCostParameters wcCost = new WayneCountyCostParameters();

	public static WayneCountyModeParameters buildDefault() {
		WayneCountyModeParameters parameters = new WayneCountyModeParameters();

		// Cost
		parameters.wcCost.beta_cost_low_income = -0.00706;
		parameters.wcCost.beta_cost_medium_income = -0.00230;
		parameters.wcCost.beta_cost_high_income = -0.00094;

		// Car
		parameters.wcCar.alpha_low_income = 0.0;
		parameters.wcCar.alpha_medium_income = 0.0;
		parameters.wcCar.alpha_high_income = 0.0;
		parameters.wcCar.beta_time_min = -0.025;

		// PT
		parameters.wcPT.alpha_low_income = -12.0034;
		parameters.wcPT.alpha_medium_income = -8.5997 ;
		parameters.wcPT.alpha_high_income = -7.0877;
		parameters.pt.betaWaitingTime_u_min = -0.0625;
		parameters.pt.betaAccessEgressTime_u_min = -0.0;
		parameters.wcPT.beta_time_min = -0.025;

		// DRT
		parameters.wcDRT.alpha_low_income = 2.7846;
		parameters.wcDRT.alpha_medium_income = 0.6191;
		parameters.wcDRT.alpha_high_income = 2.1311;
		parameters.wcDRT.betaWaitingTime_u_min = -0.0625;
		parameters.wcDRT.betaAccessEgressTime_u_min = -0.0;
		parameters.wcDRT.beta_time_min = -0.025;

		// Walk
		parameters.wcWalk.alpha_low_income = -0.7479;
		parameters.wcWalk.alpha_medium_income = -0.7479;
		parameters.wcWalk.alpha_high_income = -0.7479;
		parameters.wcWalk.beta_time_min = -0.0625;

		// Bike
		parameters.wcBike.alpha_low_income = -2.4811;
		parameters.wcBike.alpha_medium_income = -2.4811;
		parameters.wcBike.alpha_high_income = -2.4811;
		parameters.wcBike.beta_time_min = -0.0625;
		
		return parameters;
	}
}