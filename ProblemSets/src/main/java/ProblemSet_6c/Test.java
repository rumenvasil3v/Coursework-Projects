package ProblemSet_6c;

public class Test {

	public static void main(String[] args) {
//		P_COLOUR[] colours = new P_COLOUR[3];
//		colours[0] = P_COLOUR.RED;
//		colours[1] = P_COLOUR.RED;
//		
//		int hashCode = colours[0].hashCode();
//		int hashCode2 = colours[1].hashCode();
//		
//		System.out.println(hashCode);
//		System.out.println(hashCode2);
//
//		P_COLOUR[] colourArray = new P_COLOUR[] { P_COLOUR.BLUE, P_COLOUR.YELLOW, null };
//		Palette p2 = new Palette(colourArray);
//		System.out.println(p2.getColours());
		
		P_COLOUR[] colourArray = new P_COLOUR[] { P_COLOUR.BLUE, P_COLOUR.YELLOW, null };
		Palette p2 = new Palette(colourArray);
		
		System.out.println(p2.display());
		
		Palette p1 = new Palette();
		System.out.println(p1.mixColours());
	}

}
