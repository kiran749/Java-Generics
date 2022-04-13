package assignment6Q1;
import java.util.HashSet;
public class Assignment6Q1<N> {

	private N id;
	private N name;
	private N dept;
	public Assignment6Q1(N id,N name,N dept) 
	
	{
		this.id=id;
		this.name=name;
		this.dept=dept;	
	}
	
	public void display()
	{
		HashSet<N> hs=new HashSet<>();
		hs.add(id);
		hs.add(name);
		hs.add(dept);
		//hs.add(1);
		for(N e:hs)
			
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Assignment6Q1<String> str=new Assignment6Q1<String>("11810726", "G Kiran Reddy", "Computer Science & Engineering");
		str.display();

	}

}