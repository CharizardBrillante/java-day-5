package interfaces;

public interface Intensity {
	default int increase(int i) {	
		i = i < 100 ? ++i : 100;
		return i;
	}
	
	default int decrease(int i) {
		i = i > 0 ? --i : 0;
		return i;
	}
}
