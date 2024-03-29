package com.javaex.oop.tv;

public class Tv {
	//상수
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_CHANNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;
	
	private int channel;
	private int volume;
	private boolean power;
	
	public Tv() {
		this.channel=7;
		this.volume=20;
		this.power=false;
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on) {
		this.power=on;
	}
	//채녈 변경 메서드
	public void channel(int channel) {
		//채널의 범위 체크
		if(channel>=MIN_CHANNEL && channel <=MAX_CHANNEL) {
			this.channel=channel;
			//범위를 벗어나면 채녈 변경 x
		}
	}
	
	public void channel(boolean up) {
		if(up) {
			if(this.channel<MAX_CHANNEL) { 
				this.channel++;
			}
		}else {
			if(this.channel>MIN_CHANNEL) {
				this.channel--;
			}
		}
	}
	
	public void volume(int volume) {
		if(volume>=MIN_VOLUME&&volume<=MAX_VOLUME) {
			this.volume=volume;
		}
	}
	
	public void volume(boolean up) {
		if(up) {
			if(this.volume<MAX_VOLUME) {
				this.volume++;
			}
		}else {
			if(this.volume>MIN_VOLUME) {
				this.volume--;
			}
		}
	}
	
	
	public void status() {
		System.out.println("현재 채널: "+getChannel()+", 현재 볼륨: "+getVolume());
	}
}
