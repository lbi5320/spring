package com.lib.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lbi.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTest {

	private static final Logger log = LoggerFactory.getLogger(BoardServiceTest.class);

	@Autowired
	private BoardService service;
	
	
	 /*�Խ��� ��ȸ*/
    @Test
    public void testGETPage() {
        
        int bno = 8;
        
        log.info("" + service.getPage(bno));
        
    }
 

	

	/*
	 * �Խ��� ��� �׽�Ʈ
	 * 
	 * @Test public void testGetList() {
	 * 
	 * service.getList().forEach(board -> log.info("" + board));
	 * 
	 * }
	 */

	/*
	 * @Test public void testEnroll() {
	 * 
	 * BoardVO vo = new BoardVO();
	 * 
	 * vo.setTitle("service test"); vo.setContent("service test");
	 * vo.setWriter("service test");
	 * 
	 * service.enroll(vo);
	 * 
	 * }
	 */

}