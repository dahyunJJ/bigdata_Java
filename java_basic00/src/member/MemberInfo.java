package member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		Member member = new Member();
		
		member.setMemberId("dhjeong");
		member.setMemberName("정다현");
		member.setMemberEmail("jeongdh1212@gmail.com");
		member.setMemberGender("f");
		member.setMemberPhone("010-1234-1234");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberGender());
		System.out.println(member.getMemberPhone());
		
		member.setMemberId("dhjeong111");
		System.out.println(member.getMemberId());		
		

		// MemberDrama.java 파일로부터 드라마 오징어 게임 시즌 1 출연자 정보 호출
		MemberDrama.dramaMemberInfo();
		
		
		// 오징어 게임 시즌 2 출연진
		
		

		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)


	}

}