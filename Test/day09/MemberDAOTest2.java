package day09;

import junit.framework.TestCase;

public class MemberDAOTest2 extends TestCase {

	MemberDAO memberDao;
	
	
	@Override
	protected void setUp() throws Exception {
		memberDao = new MemberDAO();
		
	}

	@Override
	protected void tearDown() throws Exception {
		memberDao = null;
	}
	
	public void testAddMember() throws Exception {
		Member member = new Member();
		member.setId("tttttt");
		member.setName("ttt");
		member.setPassword("123");
		member.setEmail("qqq@ggg.com");
		
		assertTrue(memberDao.addMember(member));
		assertEquals("ttt",memberDao.getMember("tttttt").getName());
	}

}
