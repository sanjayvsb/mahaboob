package Guvi;
import java.util.*;
public class Books {
	public String title;
	public String author;
	public int year;
	public double price;
	final static int ARRAY_SIZE =10;
	public Books(){}
	public Books(String book,String author, int year,double price) {
	super();
	this.title=title;
	this.author= author;
	this.year = year;
	this.price=price;
	}
	public String gettitle() {
	return title;
	}
	public String getAuthor() {
	return author;
	}
	public int getYear() {
	return year;
	}
	public double getPrice() {
	return price;
	}
	public static void main(String[] args) throws Exception {
	float[] array = new float [ARRAY_SIZE];
	List<Books> list = new ArrayList<Books>();
	list.add(new Books("Gitanjali","Rabindra Nath Tagore",1912,200));
	list.add(new Books("Godan","Munshi Premchand",1936,300));
	list.add(new Books("My Experiments With Truth","Mahatma Gandhi",1927,150));
	list.add(new Books("Macbeth","William Shakespeare",1623,400));
	list.add(new Books("My Truth","Indira Gandhi",1980,145));
	Scanner input=new Scanner(System.in);
	System.out.println("Enter book name:");
	String st=input.nextLine();
	for (Books s : list){
	if(st.equals(s.gettitle())){
	System.out.println(s.gettitle()+" " +s.getAuthor()+" " +s.getYear()+" "+s.getPrice());
	}
	}
	}
	}

