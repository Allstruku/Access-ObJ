// 클래스는 필드와 메소드를 가진다. 보통 캡슐화(관련된 내용을 모아서 가지고 있는 것)을 거친다
// 모아서 ㄱ지고 있는 필드와 메소드 중에는 외부에 노출 시키지 않고 감추고 싶은 속성고 메소드 존재한

public class AccessObj {
	public static void main(String[] args) {
		AccessObjExam a1 = new AccessObjExam();
		System.out.println(a1.p);
		System.out.println(a1.p1);
		System.out.println(a1.p2);
//		System.out.println(a1.p3);
		// 그렇기에 윗 p3 필드 사용하려고 할 때에 에러가 생긴다. private 접근 제한자는 자기 자신 외 다른 클래스에서 접근을 허용 안한다
	}
}
