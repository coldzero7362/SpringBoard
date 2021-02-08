package net.gondr.dao;

import java.util.List;

import net.gondr.domain.BoardVO;
import net.gondr.domain.Criteria;

public interface BoardDAO {
	//작성
	public void write(BoardVO data);
	//글 열람
	public BoardVO view(Integer id);
	//리스트 열람
	public List<BoardVO> list(Integer start,Integer cnt);
	public List<BoardVO> list(Criteria c);
	//글삭제
	public void delete(Integer id);
	//글 수정
	public void update(BoardVO data);
	
	public Integer getCnt();
	public Integer getCnt(Criteria c);
}
