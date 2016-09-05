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
		if(White != Black){
			return (White - brightness)/(White - Black);	//����1�A����0�Ƃ��Đ��K��
		}
		else{
			return 0.5F;//�O���Z�ɂȂ�ꍇ�����O�B���C����ɂ�����̂Ƃ���
		}
	}
}
