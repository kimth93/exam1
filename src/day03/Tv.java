package day03;

public class Tv {
	private int channel;
	private int volume;
	private boolean power;
	
	
	public int channelUp() {
		channel = channel++;
		return channel;
	}
	
	public int channelDown() {
		channel = channel--;
		return channel;
	}
	
	public int volumeUp() {
		volume = volume++;
		return volume;
	}

}
