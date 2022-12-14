package ch08.sec04;

public class Television implements RemoteControl {
	
	private int volume; //외부에서 볼륨 값 접근하지 못하게하기.
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume> RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume= volume;
		}
		System.out.println("현재 Tv 볼륨"+this.volume);
	}
}
