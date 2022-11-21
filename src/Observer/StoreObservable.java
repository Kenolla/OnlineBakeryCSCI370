import java.util.ArrayList;
import java.util.List;
//import com.sun.tools.javac.util.List;

public class StoreObservable implements Subject {

	private List<Observer> observers = new ArrayList<>();
	//StoreObservable store = new StoreObservable();
	
	int discount;
	
	public int getDiscount() 
	{
		return discount;
	}

	/* Adding customer to newsletter
	 * Removing customer from newsletter
	 * and notifying that a discount is available to customers who are subscribed
	*/
	@Override
	public void addSubscriber(Observer o) 
	{
	
		observers.add(o);
	}

	@Override
	public void removeSubscriber(Observer o) 
	{
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifySubscriber(int x) 
	{
		// TODO Auto-generated method stub
		for(Observer obs : observers)
		{
			obs.update(discount);
			
		}
	}

	public void setDiscount(int discount) 
	{
		this.discount = discount;
		notifySubscriber(discount);
	}
	
	
}