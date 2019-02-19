package swftwer;
import java.util.*;
public class myshc {
	private int price;
private List <addp>list=new ArrayList<>();

public int getcount1() {
	// TODO Auto-generated method stub
	return list.size();
}

public void add(addp b) {
	// TODO Auto-generated method stub
	
		list.add(b);
	
	
}

public Object gettotalprice() {
	// TODO Auto-generated method stub
	
		if(list .size()>0) {
			for(addp h:list) {
				price=price+h.getprice();
			}
	}
		return price;
}


}
