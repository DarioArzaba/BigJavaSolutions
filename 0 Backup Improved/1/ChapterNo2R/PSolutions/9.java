/* 

9.- Suppose you received a loyalty promotion that lets you purchase one item, valued up to $100, from an online catalog. You want to make the best of the offer. You have a list of all items for sale, some of which are less than $100, some more. Write an algorithm to produce the item that is closest to $100. If there is more than one such item, list them all.

A.

	Start by getting the List of Items.
	Define an empty list of Best Offers
	Repeat for Each Item on the List of Items:
		If the price of the item is more than 100, drop it from the list.
		Else, starting from the Second Item, compare the Current Item with Each Iten in the list:
			If the current Item price is greater then the compared Item, swap their places.
	Add the First Item to the Best Offers List.
	Repeat for Each Item on the List of Items:
		If the price of the First Item is equal to the Current Item:
			Add the Current Item to the Best Offers List.
	End by returning the Best Offers list.
	
*/

import java.util.HashMap;

public class SearchBestItem {
		
	public static void main(String[] args){
		
		double maxPrice = 100.0;
		
		HashMap<String, Double> listItems = new HashMap<String, Double>();
		HashMap<String, Double> bestOffers = new HashMap<String,Double>();
		
		listItems.put("Banana", 95.0);
		listItems.put("Pear", 83.89);
		listItems.put("Orange", 98.5);
		listItems.put("Pineapple", 114.0);
		listItems.put("Watermelon", 103.0);
		listItems.put("Peach", 200.0);
		listItems.put("Apple", 98.5);
		
		listItems.entrySet().removeIf(entry -> (entry.getValue() > maxPrice) );
		double highestPrice = listItems.entrySet().stream().max( (e1, e2) -> ( (e1.getValue()>e2.getValue()) ? 1 : -1 ) ).get().getValue();
		listItems.forEach( (k,v) -> {
			if (v == highestPrice){
				bestOffers.put(k, v);
			}
		});
		System.out.println("Best Offers: \n");
		bestOffers.forEach( (k,v) -> {
			System.out.println("Product: " + k + "  Price: " + v);
		});
		System.exit(0);
		
	}
	
}

