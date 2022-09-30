
import java.util.Scanner;
import abstractClasses.Media;
import abstractClasses.MediaMaker;
import media.*;

public class MediaPlayer extends MediaMaker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Java MediaPlayer! \n "
				+ "Allowed types: audio, video, image.\n"
				+ "Insert 5 medias.");
		
		
		Media[] playlist = new Media[5]; //Instance playlist
		
		
		System.out.println("File type, title and duration divided by white space.\n"
				+ "If file type is 'image', set duration 0"
				+ "Example: image myPhoto 0"); 
		for (int i = 0; i < playlist.length; i++) {	//fill playlist
			String input = scanner.nextLine();
			String[] splitted = input.split(" ");
			
			String type = splitted[0];
			String title = splitted[1];
			int duration = Integer.parseInt(splitted[2]);
			
			createPlaylist(playlist, type, title, duration, i);
			
		}
		
		
		while(true) { //play tracks
			
			System.out.println("What track you want to reproduce?\n"
					+ "Digit a number between 0 and 4 to select the track or 5 to exit.");
			
			int track = scanner.nextInt();
			
			if(track == 5) {
				break;
			} else if (track > 5) {
				System.out.println("Wrong input. Retry.");
			} else {
				reproduce(track, playlist);
			}
			
		}	
		scanner.close();
		
	}
	
	static void reproduce(int track, Media[] playlist) {

		if(playlist[track] instanceof Image) {
			Image image = (Image)playlist[track];
			System.out.println(image.show()); 
		} else if (playlist[track] instanceof Audio){
			Audio audio = (Audio)playlist[track];
			System.out.println(audio.play()); 
		} else if (playlist[track] instanceof Video) {
			Video video = (Video)playlist[track];
			System.out.println(video.play());
			
		}
	}
	
	

}
