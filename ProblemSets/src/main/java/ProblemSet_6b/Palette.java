package ProblemSet_6b;

public class Palette {
	private P_COLOUR[] primaryColours;

	public Palette() {
		this.primaryColours = new P_COLOUR[3];
	}

	public Palette(P_COLOUR[] primaryColours) {
		this.primaryColours = primaryColours;
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
}
