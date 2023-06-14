class Product {
    private String name;
    private double price;
    private int quantity;

     public String getName()
	{
		return name; 
	}
	
    public int getQuantity()
	{
		return quantity; 
	}

	public double getPrice()
	{
		return price; 
	}
	
	public void setPrice (double price)
	{
          this.price = price;
	}
	public void setQuantity(int quantity)
	{
          this.quantity = quantity;
	}
	public void setName(String name)
	{
          this.name = name;
	}
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Phone");
        product.setPrice(500.0);
        product.setQuantity(10);
        String name = product.getName();
        double price = product.getPrice();
        int quantity = product.getQuantity();
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}