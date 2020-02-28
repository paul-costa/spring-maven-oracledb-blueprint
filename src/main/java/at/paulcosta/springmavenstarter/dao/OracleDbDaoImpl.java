package at.paulcosta.springmavenstarter.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import at.paulcosta.springmavenstarter.entity.SpringMavenTest;

@Repository
public class OracleDbDaoImpl implements OracleDbDao {

	@Autowired
	private EntityManager entityManager;
	
	// get session from entity manager
	private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	public List<String> GetAllTexts() {
		Session session = getSession();
		
		List<String> allTexts = new ArrayList<String>();
		List<SpringMavenTest> springMavenTestTextList = new ArrayList<SpringMavenTest>();
		
		String sqlQuery = "from SpringMavenTest smt";
		
		springMavenTestTextList = session.createQuery(sqlQuery).getResultList();
		
		for(int i=0; i<springMavenTestTextList.size(); i++) {
			allTexts.add(
				springMavenTestTextList.get((Integer)i).getId()+"|v|"+
				springMavenTestTextList.get((Integer)i).getText()+"|l|"
			);
		}
		
		return allTexts;
	}
}
