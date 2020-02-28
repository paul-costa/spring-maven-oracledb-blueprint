package at.paulcosta.springmavenstarter.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import at.paulcosta.springmavenstarter.dao.OracleDbDao;

@Service
public class OracleDbServiceImpl implements OracleDbService {
	@Autowired
	private OracleDbDao oracleDbDAO;
	
	
	@Override
	@Transactional
	public List<String> GetAllTexts() {
		return oracleDbDAO.GetAllTexts();
	}
}
