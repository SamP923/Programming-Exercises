import java.io.*;

public class Product implements Serializable
{
	int productNumber;
	String productName;
	int quantity;
	double cost;

	public Product( int pd, String pn, int q, double c )
	{
		productNumber = pd;
		productName = pn;
		quantity = q;
		cost = c;
	}


	public int getProductCode()
	{
		return productNumber;
	}

	public String getProductDescription()
	{
		return productName;
	}

	public int getProductQuantity()
	{
		return quantity;
	}

	public double getProductCost()
	{
		return cost;
	}

}