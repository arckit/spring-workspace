package demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestBean
 */
@Stateless
@LocalBean
public class TestBean implements ITestBean {

    /**
     * Default constructor. 
     */
    public TestBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "Hi There";
	}

}
