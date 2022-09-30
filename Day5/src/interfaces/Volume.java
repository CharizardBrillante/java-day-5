package interfaces;

public interface Volume {
		

	default String displayVolume(int volume) {
		return new String(new char[volume]).replace("\0", "!");
	}

	
}
