package dao;
import java.util.*;

public interface interface_dao 
{
	public List<product_dao> get_fashion();
	public void addfashion(product_dao pro);
	public void deletefashion(product_dao pro);
	public void updatefashion(product_dao pro);
}