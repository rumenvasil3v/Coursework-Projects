package lab_2;

public class ClockDisplayTest {
	
	public static void main(String[] args) {
		ClockDisplay clock = new ClockDisplay();
		
		for (int i = clock.getHours().getValue(); i < clock.getHours().getLimit(); i = clock.getHours().increment()) {
			for (int j = clock.getMinutes().getValue(); j < clock.getMinutes().getLimit() + 1; j = clock.getMinutes().increment()) {
				System.out.println(clock.toString());
				
				try {					
					Thread.sleep(60000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}