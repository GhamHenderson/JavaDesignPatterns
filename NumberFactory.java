//creates the numberlist objects

public class NumberFactory
{
	public NumberList getNumberList(String list) {

		int i = list.indexOf('.');
		if(i!= -1)
		{
		return new DoubleList(list);
		}
		else{
			return new IntList(list);
		}
	}




}