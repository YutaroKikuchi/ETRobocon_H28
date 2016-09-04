package drive_control;

import hardware.Hardware;

public class BrightMeasure {
	public float measureBrightness() {

		return Hardware.getBrightness();
	}
	
	public float measureNormalizedBrightness(float White,float Black) { 
		//����:������э��̋P�x�l�
		float brightness;
		brightness = Hardware.getBrightness();
		return (White - brightness)/(White - Black);	//����1�A����0�Ƃ��Đ��K��
	}
}
