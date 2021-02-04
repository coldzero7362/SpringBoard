package net.gondr.dao;

import net.gondr.domain.UserVO;

public interface UserDAO {
	public UserVO getUser(String userid);
	public UserVO loginUser(String userid, String password);
	public void insertUser(UserVO user);
	public void updateEXP(String userid);//EXP증가
	
	public void levelUP(String userid);
	
	public int ExpForm(int level);
	
}
