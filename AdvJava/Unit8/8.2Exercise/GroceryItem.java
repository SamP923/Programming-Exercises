public class GroceryItem
{
	int shelfLife;
	int itemcode;

	public GroceryItem( int itemcode, int shelfLife )
	{
		this.shelfLife = shelfLife;
		this.itemcode = itemcode;
	}

	public int getCode()
	{
		return itemcode;
	}

	public int getLife()
	{
		return shelfLife;
	}	
}