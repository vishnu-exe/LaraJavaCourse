 class Publisher
{
	String name;
	String publisherID;
	String city;

	Publisher( String name, String publisherID , String city )
	{
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}
}
class Author
{
	String authorName;
	int age;
	String place;

     Author( String name, int age, String place )
	{
		this.authorName = name;
		this.place= place;
		this.age = age;
	}
}

class Book
{
	String name;
	int price;
	Author auther;
	Publisher publisher;

	Book( String n, int p , Author auther , Publisher publisher )
	{
		this.name = n;
		this.price = p;
		this.auther = auther;
		this.publisher = publisher;
	}
	public static void main(String[] args) 
	{
		Author auther = new Author("john",42,"USA");
		Publisher publisher = new Publisher ( "sun publication", "JDSR-III4","LA");
		Book b = new Book("java for beginners",800,auther,publisher);
		System.out.println("Book name: " + b.name);
		System.out.println("Book price: " + b.price);
		System.out.println("------- Author Details--------");
		System.out.println("Author name: " + b.auther.authorName);
		System.out.println("Author age: " + b.auther.age);
		System.out.println("Author place: " + b.auther.place);
		System.out.println("------- Publisher Details--------");
		System.out.println("Publisher name : " + b.publisher.name);
		System.out.println("Publisher ID : " + b.publisher.publisherID);
		System.out.println("Publisher city : " + b.publisher.city);

	}
		
}


