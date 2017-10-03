//POJO CLASS

package dao;

public class product_dao 
{
	private int Product_id, Price;
	private String Company, Category, Type, Description;
	
	//CONSTRUCTOR USING FIELDS
	public product_dao(int product_id, int price, String company, String category, String type, String description) 
	{
		super();
		this.Product_id = product_id;
		this.Price = price;
		this.Company = company;
		this.Category = category;
		this.Type = type;
		this.Description = description;
	}
	
	//GETTER & SETTER METHODS 
	public int getProduct_id() 
	{
		return Product_id;
	}
	public void setProduct_id(int product_id) 
	{
		Product_id = product_id;
	}
	public int getPrice() 
	{
		return Price;
	}
	public void setPrice(int price) 
	{
		Price = price;
	}
	public String getCompany() 
	{
		return Company;
	}
	public void setCompany(String company) 
	{
		Company = company;
	}
	public String getCategory() 
	{
		return Category;
	}
	public void setCategory(String category) 
	{
		Category = category;
	}
	public String getType() 
	{
		return Type;
	}
	public void setType(String type) 
	{
		Type = type;
	}
	public String getDescription() 
	{
		return Description;
	}
	public void setDescription(String description) 
	{
		Description = description;
	}
	
	
}