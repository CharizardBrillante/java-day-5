package interfaces;

public interface Brightness {
	
	default String displayBrightness(int brightness) {
		return new String(new char[brightness]).replace("\0", "*");
	}
	
}
