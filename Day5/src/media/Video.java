package media;

import abstractClasses.Media;
import interfaces.*;

public class Video extends Media implements Brightness, Intensity, Volume{
	
	String title;
	int duration;
	int volume;
	int brightness;
	String played;
	
	public Video(String title, int duration) {
		this.title = title;
		this.duration = duration;
		this.volume = 50;
		this.brightness = 50;
	}

	public int getVolume() {
		return this.volume;
	}
	
	public int getBrightness() {
		return this.brightness;
	}
	
	public void volumeUp() {
		this.volume = increase(this.volume);
	}
	
	public void volumeDown() {
		this.volume = decrease(this.volume);
	}
	
	public void brightnessUp() {
		this.brightness = increase(this.brightness);
	}
	
	public void brightnessDown() {
		this.brightness = decrease(this.brightness);
	}
		
	public String play() {
		String rows = "";
		for(int i = 0; i < this.duration; i++) {
			rows += this.title + displayVolume(this.volume) + displayBrightness(this.brightness) + "\n";
		}
		return rows;
	}
	
}
