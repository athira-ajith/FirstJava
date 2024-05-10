package gitlearning;

public class Demo {

		private String name;
		private String model;
		private int year;

		public Demo(String name, String model, int year)
		{
		 this.name=name;
		 this.model=model;
		 this.year=year;
		}
		public String displayName()
		{
		return name;
		}
		public String displayModel()
		{
		return model;
		}
		public int displayYear()
		{
		return year;
		}
		public static void main(String[]args)
		{
		Demo d= new Demo("Breeza","maruti Suzuki",2021);
		System.out.println("name=" +d. displayName());
		System.out.println("model=" +d. displayName());
		System.out.println("year=" +d. displayName());
		}
		}



