package media;
import abstractClasses.Media;
import interfaces.Intensity;
import interfaces.Volume;

public class Audio extends Media implements Volume, Intensity{
	
	String title;
	int duration;
	int volume;
	String played;
	
	public Audio(String title, int duration) {
		this.title = title;
		this.duration = duration;
		this.volume = 50;
	}

	public int getVolume() {
		return this.volume;
	}
	
	public void volumeUp() {
		this.volume = increase(this.volume);
	}
	
	public void volumeDown() {
		this.volume = decrease(this.volume);
	}
		
	public String play() {
		String rows = "";
		for(int i = 0; i < this.duration; i++) {
			rows += this.title + displayVolume(this.volume) + "\n";
		}
		return rows;
	}
	
	
}
