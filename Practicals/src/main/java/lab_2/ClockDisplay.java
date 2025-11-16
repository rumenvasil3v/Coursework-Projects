package lab_2;

import java.text.DecimalFormat;
import java.time.*;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;

	public ClockDisplay() {
		this.hours = new NumberInfo(24);
		this.minutes = new NumberInfo(60);
	}

	public String timeTick() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = this.hours.getValue(); i < this.hours.getLimit(); i = this.hours.increment()) {
			for (int j = this.minutes.getValue(); j < this.minutes.getLimit() + 1; j = this.minutes.increment()) {
				if (j == 60) {
					this.minutes.increment();
					break;
				}
				
				sb.append(toString());
				sb.append('\n');
			}
		}
		
		return sb.toString();
	}
	
	public NumberInfo getHours() {
		return this.hours;
	}
	
	public NumberInfo getMinutes() {
		return this.minutes;
	}

	@Override
	public String toString() {
		DecimalFormat style = new DecimalFormat("00");
		return (style.format(this.hours.getValue()) + ":" + style.format(this.minutes.getValue()));
	}
}
