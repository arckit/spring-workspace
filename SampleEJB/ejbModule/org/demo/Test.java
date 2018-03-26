package org.demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Test
 */
@Stateless
@LocalBean
public class Test implements TestRemote, TestLocal {

    /**
     * Default constructor. 
     */
    public Test() {
        // TODO Auto-generated constructor stub
    }

}
