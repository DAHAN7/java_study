package t4_state_control.notify_wait;

// dataBox의 데이터 소비 스레드
public class ConsumerThread extends Thread {

	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			String data = dataBox.getData();
			System.out.println("consumer thread data :" + data);
		} // end for
	}// end run

}
