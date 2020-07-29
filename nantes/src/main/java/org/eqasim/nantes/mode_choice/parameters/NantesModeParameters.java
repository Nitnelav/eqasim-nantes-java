package org.eqasim.nantes.mode_choice.parameters;

import org.eqasim.core.simulation.mode_choice.parameters.ModeParameters;

public class NantesModeParameters extends ModeParameters {
	public class NantesCarParameters {
		public double betaInsideUrbanArea;
		public double betaCrossingUrbanArea;
	}

	public class NantesBikeParameters {
		public double betaInsideUrbanArea;
	}

	public final NantesCarParameters nantesCar = new NantesCarParameters();
	public final NantesBikeParameters nantesBike = new NantesBikeParameters();

	public static NantesModeParameters buildDefault() {
		NantesModeParameters parameters = new NantesModeParameters();

		// Cost
		parameters.betaCost_u_MU = -0.206;
		parameters.lambdaCostEuclideanDistance = -0.4;
		parameters.referenceEuclideanDistance_km = 40.0;

		// Car
		parameters.car.alpha_u = 1.35;
		parameters.car.betaTravelTime_u_min = -0.06;

		parameters.car.constantAccessEgressWalkTime_min = 4.0;
		parameters.car.constantParkingSearchPenalty_min = 4.0;

		parameters.nantesCar.betaInsideUrbanArea = -0.5;
		parameters.nantesCar.betaCrossingUrbanArea = -1.0;

		// PT
		parameters.pt.alpha_u = 0.0;
		parameters.pt.betaLineSwitch_u = -0.17;
		parameters.pt.betaInVehicleTime_u_min = -0.017;
		parameters.pt.betaWaitingTime_u_min = -0.0484;
		parameters.pt.betaAccessEgressTime_u_min = -0.0804;

		// Bike
		parameters.bike.alpha_u = -2.0;
		parameters.bike.betaTravelTime_u_min = -0.05;
		parameters.bike.betaAgeOver18_u_a = -0.0496;

		parameters.nantesBike.betaInsideUrbanArea = 1.5;

		// Walk
		parameters.walk.alpha_u = 1.43;
		parameters.walk.betaTravelTime_u_min = -0.15;

		return parameters;
	}
}
