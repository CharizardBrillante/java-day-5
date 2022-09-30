package media;

import abstractClasses.Media;
import interfaces.Brightness;
import interfaces.Intensity;

public class Image extends Media implements Brightness, Intensity{
	
	int brightness = 50;
	String title;
	String showed;
	
	public Image(String title) {
		this.title = title;
	}

	public int getBrightness() {
		return this.brightness;
	}
	
	public void brightnessUp() {
		this.brightness = increase(this.brightness);
	}
	
	public void brightnessDown() {
		this.brightness = decrease(this.brightness);
	}
	
	public String show() {
		this.showed = this.title + displayBrightness(this.brightness);
		return this.showed;
	}

}
