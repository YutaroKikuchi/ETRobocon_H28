package drive_control;

import area_param.AreaParamSelecter;

public class ForwardSelecter {

	private AreaParamSelecter aps;

	public ForwardSelecter(){
		aps = new AreaParamSelecter();
	}

	public float SelectForward(){
		return aps.getSpeed();
	}

}