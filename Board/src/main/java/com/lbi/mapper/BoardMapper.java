package com.lbi.mapper;

import java.util.List;

import com.lbi.model.BoardVO;

public interface BoardMapper {
	/*�Խ��� ��� */
	public void enroll(BoardVO board);
	
	/* �Խ��� ��� */
    public List<BoardVO> getList();
    
    /* �Խ��� ��ȸ */
    public BoardVO getPage(int bno);

}
