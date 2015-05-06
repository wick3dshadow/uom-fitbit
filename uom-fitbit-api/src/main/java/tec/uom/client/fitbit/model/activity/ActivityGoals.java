package tec.uom.client.fitbit.model.activity;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;
import javax.measure.quantity.Time;

import tec.uom.lib.domain.health.Floor;
import tec.uom.lib.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ActivityGoals {

	private Quantity<Energy> caloriesOut;
	private Quantity<Step> steps;
	private Quantity<Length> distance;
	private Quantity<Time> activeMinutes;
	private Quantity<Floor> floors;

	public ActivityGoals() {
	}

	public Quantity<Energy> getCaloriesOut() {
		return caloriesOut;
	}

	public Quantity<Step> getSteps() {
		return steps;
	}

	public Quantity<Length> getDistance() {
		return distance;
	}

	public Quantity<Time> getActiveMinutes() {
		return activeMinutes;
	}

	public Quantity<Floor> getFloors() {
		return floors;
	}

	public boolean hasAnyValue() {
		return caloriesOut != null || steps != null || distance != null
				|| activeMinutes != null || floors != null;
	}
}