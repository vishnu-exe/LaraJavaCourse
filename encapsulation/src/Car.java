class Car
{
	private String make;
	private String model;
	private int year;
      
    public String getMake()
	{
		return make;
	}
    public String getModel()
	{
		return model;
	}
    public int getYear()
	{
		return year;
	}

	public void setMake(String setMake)
	{
          this.make = setMake;
	}
	public void setModel(String setModel)
	{
          this.model = setModel;
	}
	public void setYear(int setYear)
	{
          this.year = setYear;
	}

}

class CarDriver

{
	public static void main(String[] args) 
	{
		Car car = new Car();
		car.setMake("Toyota");
		car.setModel("camry");
		car.setYear(2020);
		String make = car.getMake();
		String model = car.getModel();
		int year = car.getYear();
		System.out.println("make: " + make );
		System.out.println("model: " + model );
		System.out.println("year: " + year );
		
	}
}
