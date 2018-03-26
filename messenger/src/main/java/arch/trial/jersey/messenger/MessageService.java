package arch.trial.jersey.messenger;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
	
	public List<Message> getAllMsg(){
		Message ms1= new Message(1, "Arc", "test");
		Message ms2= new Message(2, "Arc1", "test1");
		List<Message> ls = new ArrayList<Message>();
		ls.add(ms1);
		ls.add(ms2);
		return ls;
	}

}
