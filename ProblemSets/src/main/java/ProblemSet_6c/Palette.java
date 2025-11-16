package ProblemSet_6c;

public class Palette {
	private P_COLOUR[] primaryColours;
	private String displayMixColour;
	private int counter;

	public Palette() {
		this.primaryColours = new P_COLOUR[3];
	}

	public Palette(P_COLOUR[] primaryColours) {
		
		if (primaryColours.length > 3) {
			throw new IllegalArgumentException();
		}
		
		this.primaryColours = new P_COLOUR[3];
		for (int i = 0;i < primaryColours.length; i++) {
			if (primaryColours[i] != null) {
				this.primaryColours[i] = primaryColours[i];
			}
		}
	}

	public void addColour(P_COLOUR colour) {
//		int counter = 0;
//		for (P_COLOUR current : this.primaryColours) {
//			if (current != null) {
//				counter++;
//			}
//		}
//
//		if (counter == this.primaryColours.length) {
//			return;
//		}

		int hashCodeCurrentColour = 0;
		for (int i = 0; i < this.primaryColours.length; i++) {
			if (this.primaryColours[i] == null) {
				if (colour.hashCode() == hashCodeCurrentColour) {
					break;
				}

				this.primaryColours[i] = colour;
				break;
			}

			hashCodeCurrentColour = this.primaryColours[i].hashCode();
		}
	}

	public String getColours() {
		int counter = 0;
		StringBuilder sb = new StringBuilder();
		String result = "";

		for (int i = 0; i < this.primaryColours.length; i++) {
			if (this.primaryColours[i] != null) {
				sb.append(this.primaryColours[i] + ", ");
				counter++;
			}
		}

		if (counter > 0 && counter <= this.primaryColours.length) {
			result = sb.toString().substring(0, sb.length() - 2);
		} else {
			result = "No colours added";
		}

		return result;
	}
	
	public String mixColours() {
		String color = "";
		
		for (P_COLOUR currentColor: this.primaryColours) {
			if (currentColor != null ) {
				this.counter++;
			}
		}
		
		if (this.counter == 1) {
			color = this.primaryColours[0].toString();
			
			this.displayMixColour = color + " = " + color;
		} else if (this.counter == 2) {
			P_COLOUR firstColor = this.primaryColours[0];
			P_COLOUR secondColor = this.primaryColours[1];
			
			if ((firstColor == P_COLOUR.RED &&
					secondColor == P_COLOUR.BLUE) ||
					(firstColor == P_COLOUR.BLUE
					&& secondColor == P_COLOUR.RED)) {
				color = "PURPLE";
			} else if ((firstColor == P_COLOUR.RED &&
					secondColor == P_COLOUR.YELLOW) ||
					(firstColor == P_COLOUR.YELLOW &&
					secondColor == P_COLOUR.RED)) {
				color = "ORANGE";
			} else {
				color = "GREEN";
			}
			
			this.displayMixColour = firstColor.toString() + ", "
			+ secondColor.toString()
			+ " = " + color;
		} else if (this.counter == 3) {
			P_COLOUR firstColor = this.primaryColours[0];
			P_COLOUR secondColor = this.primaryColours[1];
			P_COLOUR thirdColor = this.primaryColours[2];
			
			color = "black";
			
			this.displayMixColour = firstColor.toString() + ", "
			+ secondColor.toString()
			+ ", "
			+ thirdColor.toString()
			+ " = " + color;
		}
		
		return color;
	}
	
	public String display() {
		this.mixColours();
		
		return this.displayMixColour;
	}
}
