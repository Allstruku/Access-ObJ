
public class AccessObjExam {
	public int p;
	// public은 어떤 클래스든지 접근할 수 있다를 의미한다. 모든 접근을 허용한다
	protected int p1;
	// protected은 같은 패키지에 있는 경우와 상속(Child Class)인 경우만 접근을 허용한다
	int p2;
	// 접근제한자를 안 쓰는 경우에는 compiler가 자동으로 default 접근제한자를 씌운다
	// default 접근제한자는 같은 패키지인 경우에만 접근을 허용한다
	private int p3;
	// private이 제일 좁은 제한자로 같은 클래스에서만 접근을 허용한다
}
