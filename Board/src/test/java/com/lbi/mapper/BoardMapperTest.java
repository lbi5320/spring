package com.lbi.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lbi.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	private static final Logger log = LoggerFactory.getLogger(BoardMapperTest.class);
	@Autowired
	private BoardMapper mapper;
	
    /* �Խ��� ���(����¡ ����)�׽�Ʈ */
    @Test
    public void testGetListPaging() {
        
        Criteria cri = new Criteria();
        
        cri.setPageNum(2);
                         
        List list = mapper.getListPaging(cri);
        
        list.forEach(board -> log.info("" + board));
    }
	
	/*
	 * @Test public void testDelete() {
	 * 
	 * int result = mapper.delete(23); log.info("result : " + result);
	 * 
	 * }
	 * 
	 */
	/*
	 * �Խ��� ����
	 * 
	 * @Test public void testModify() {
	 * 
	 * BoardVO board = new BoardVO(); board.setBno(48); board.setTitle("���� ����");
	 * board.setContent("���� ����");
	 * 
	 * int result = mapper.modify(board); log.info("result : " +result);
	 * 
	 * }
	 */

	/* �Խ��� ��ȸ */
	/*
	 * @Test public void testGetPage() {
	 * 
	 * ���� �����ϴ� ������ int bno = 8;
	 * 
	 * log.info("" + mapper.getPage(bno));
	 * 
	 * }
	 */

	/*
	 * @Test public void testEnroll() { BoardVO vo = new BoardVO();
	 * vo.setTitle("mapper test"); vo.setContent("mapper test");
	 * vo.setWriter("mapper test"); mapper.enroll(vo); }
	 */

	/* �Խ��� ��� �׽�Ʈ */
	/*
	 * @Test public void testGetList() {
	 * 
	 * 
	 * List list = mapper.getList(); /* �Ϲ��� for��
	 */
	/*
	 * for(int i = 0; i < list.size();i++) { log.info("" + list.get(i)); }
	 */

	/* foreach��(���� for��) */
	/*
	 * for(Object a : list) { log.info("" + a); }
	 */

	/* foreach�� & ���ٽ� */
	/*
	 * list.forEach(board -> log.info("" + board));
	 * 
	 * }
	 */

}