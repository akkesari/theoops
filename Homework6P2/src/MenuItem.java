class MenuItem implements Comparable<MenuItem>{
	// Attributes
	String name;
	int price; 
	
	// Constructor
    MenuItem(String name, int price) {
      this.name = name;
      this.price = price;
    }
  
    // Less than another item?
    public int compareTo(MenuItem thanItem) {
      if (this.price > thanItem.price)
    	  return 1;
      else
    	  return 0;
    }
    
}
