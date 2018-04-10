package basics;

public class Cities {

	public static void main(String[] args) {

		String cities[] = {"Perm", "Moscow", "Volgograd"};
		String towns [] = new String [3];
		System.arraycopy(cities, 0, towns, 0, 3 );
		
		for(String town : cities ) {
			System.out.println(town);
		}
		System.out.println("======================");
		for(String town : towns ) {
			System.out.println(town);
		}
		System.out.println("======================");
		int i = 0;
		do {
			System.out.println(towns[i]);
			i++;
		} while (i < towns.length);
		
		System.out.println("==========|============");
		
		int y = 0;
		 boolean townFound = false;
			while (!townFound) {
				if (towns[y] == "Perm") {
			System.out.println("town found: " + towns[y]);
			townFound = true;
				}
			y++;
		} 
		
		
}
}
