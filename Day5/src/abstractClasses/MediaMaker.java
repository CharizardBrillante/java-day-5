package abstractClasses;

import java.util.Scanner;

import media.*;

public abstract class MediaMaker {
	
	public static Audio createAudio(String title, int duration) {
		return new Audio(title, duration);
	}
	
	public static Image createImage(String title) {
		return new Image(title);
	}
	
	public static Video createVideo(String title, int duration) {
		return new Video(title, duration);
	}
	
	public static void createPlaylist(Media[] playlist, String type, String title, int duration, int i) {	
			
			switch(type) {
				case "image":
					playlist[i] = createImage(title);
					break;
				case "audio":
					playlist[i] = createAudio(title, duration);
					break;
				case "video":
					playlist[i] = createVideo(title, duration);
					break;
				default:
					System.out.println("Something went wrong!");
					i--;
					break;			
			}


	}
	
}
