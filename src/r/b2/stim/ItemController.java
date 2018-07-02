package r.b2.stim;

import java.util.HashMap;
import java.util.Map;

public class ItemController {

	private Map<String, Item> items;

	public ItemController() {
		this.items = new HashMap<>();
	}
	
	public void cadastraItem(String id, int valor) {
		this.items.put(id, new Item(id, valor));
	}

	public Item getItem(String idItem) {
		return this.items.get(idItem);
	}
	
}
