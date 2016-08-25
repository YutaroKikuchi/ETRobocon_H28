package linetrace;

import drive_control.ForwardSelecter;
import drive_control.TurnCalc;
import motor_control.WheelMotorCtrl;
import motor_control.tailCtrl;

public class LineTracer {

	private TurnCalc tc = new TurnCalc();
	private ForwardSelecter fs = new ForwardSelecter();
	private WheelMotorCtrl wmc = new WheelMotorCtrl();
	private tailCtrl tail = new tailCtrl();

	public void linetrace(){

		tail.tailTwo();

		float forward = fs.SelectForward();
		float turn = tc.calcTurn();

		wmc.setForward(forward);
		wmc.setTurn(turn);
		wmc.controlWheel();
	}

}