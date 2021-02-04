package net.gondr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.gondr.dao.UserDAO;
import net.gondr.domain.UserVO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO dao;
	
	@Override
	public UserVO getUserInfo(String userid) {
		return dao.getUser(userid);
		
	}
	@Override
	public UserVO login(String userid, String password) {
		// TODO Auto-generated method stub
		
		return dao.loginUser(userid, password);
	}
	@Override
	public void register(UserVO user) {
		// TODO Auto-generated method stub
		dao.insertUser(user);
	}
	@Override
	public void ExpUp(String userid) {
		dao.updateEXP(userid);
	}
	
	@Override
	public int ExpForm(int level) {
		return dao.ExpForm(level);
	}
	@Override
	public void levelUp(String userid) {
		int userLevel = dao.getUser(userid).getLevel();
		int goalExp = dao.ExpForm(userLevel);
		int userExp = dao.getUser(userid).getExp();
		if(userExp >= goalExp) {
			dao.levelUP(userid);
		}
		
	}
}
