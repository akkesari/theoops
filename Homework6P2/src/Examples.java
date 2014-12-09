import tester.Tester;

class Examples{
	Examples(){
		// nothing here
	}
	
	MenuItem pizza = new MenuItem("Pizza", 500);
	MenuItem squirrelFry = new MenuItem("Squirrel Fry", 5);
	MenuItem bicycleStir = new MenuItem("Bicycle Stir", 25);
	MenuItem chickenRevenue = new MenuItem("Chicken Revenue", 700);
	MenuItem screamingParrot = new MenuItem("Screaming Parrot", 130);
	MenuItem foodColouring = new MenuItem("Food Colouring", 200);
	MenuItem ratatouille = new MenuItem("Ratatouille", 173);
	
	IHeap<MenuItem> Menu = new DataHeap<MenuItem>(pizza, new MtHeap<MenuItem>(),
			new MtHeap<MenuItem>());
	
	boolean testGenericHeap(Tester t){
		// Add menu items to heap
		Menu = Menu.addElt(squirrelFry).addElt(bicycleStir).addElt(chickenRevenue);
		Menu = Menu.addElt(screamingParrot).addElt(foodColouring).addElt(ratatouille);
		
		return
				// Test find minimum
				t.checkExpect(Menu.findMinElt(), squirrelFry) &&
				// Test Has Element
				t.checkExpect(Menu.hasElt(pizza), true) &&
				// Test remMinElt
				t.checkExpect(Menu.remMinElt().hasElt(squirrelFry), false) &&
				// Test is bigger
				t.checkExpect(Menu.isBigger(chickenRevenue), false) &&
				// Test Merging
				t.checkExpect(Menu.merge(new DataHeap<MenuItem>(squirrelFry, new MtHeap<MenuItem>(), new MtHeap<MenuItem>())).hasElt(squirrelFry), true);
				
				
				
	}
	
	
}