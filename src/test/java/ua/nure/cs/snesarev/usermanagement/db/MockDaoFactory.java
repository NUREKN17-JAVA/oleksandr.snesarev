package ua.nure.cs.snesariev.usermanagement.db;

import com.mockobjects.dynamic.Mock;

import ua.nure.cs.snesariev.usermanagement.db.Dao;
import ua.nure.cs.snesariev.usermanagement.db.DaoFactory;

public class MockDaoFactory extends DaoFactory {

	private Mock mockUserDao;
	
	public MockDaoFactory() {
		mockUserDao = new Mock(Dao.class);
	}

	public Mock getMockUserDao() {
	       return mockUserDao;
	}
	    
	public Dao getUserDao() {
	       return (Dao) mockUserDao.proxy();
	}

}