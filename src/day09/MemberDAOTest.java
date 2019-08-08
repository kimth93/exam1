package day09;

import java.util.List;

public class MemberDAOTest {
	
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		Member member = new Member();
	
//		member.setId("ttt");
//		member.setName("test");
//		member.setPassword("1234");
//		member.setEmail("test@test.com");
//	
//		if(dao.addMember(member)) {
//			System.out.println("입력성공");
//		
//		}else
//			System.out.println("입력실패");	
		
		member.setId("ttt");
		member.setName("test2");
		member.setPassword("1234");
		member.setEmail("test@test.com");
		
		//System.out.println(dao.updateMember(member));
		//System.out.println(dao.deleteMember("ttt"));
		
		//Member resultMember = dao.getMember("carami");
		//System.out.println(resultMember);
		
		List<Member> memberList = dao.getMemberList();
		for(Member resultmember : memberList) {
			System.out.println(resultmember);
		}
//	
	}
}