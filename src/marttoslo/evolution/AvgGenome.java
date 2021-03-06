package marttoslo.evolution;

import java.util.ArrayList;

import action.Action;
import ai.evolution.Genome;

public class AvgGenome extends Genome {

	public AvgGenome() {
		super();
		actions = new ArrayList<Action>();
		value = 0;
		visits = 0;
	}

	public double fitness() {
		return avgValue();
	}

}
