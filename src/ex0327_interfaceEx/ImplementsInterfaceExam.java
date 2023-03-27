package ex0327_interfaceEx;



//이 소스를 컴파일이 되도록 수정/추가/주석처리 하세요.
interface InterfaceExam00{
	abstract void interfaceExam00();
}


interface InterfaceExam01 extends InterfaceExam00{
	final int i = 767;
	/*protected*/ int k = 999;
	
	void interfaceExam01(int i, int k);
}



interface InterfaceExam02{
	int j =747;
	public static final int privateInt = 8; 
	public void interfaceExam02(int j); 	
}



class SuperClassExam{
	String superString = "Super";

	String superMethod(){
		System.out.println("SuperClassExam.SuperMethod()가 호출되었습니다.");
		return "returnString";
	}
}

class SubClassExam01 extends SuperClassExam implements InterfaceExam01{

	@Override
	public void interfaceExam00() { //부모보다는 modifier가 작을 순 없기 때문에 public 아니면 오류 
	// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceExam01(int i, int k) {
		// TODO Auto-generated method stub
		
	}} 



class SubClassExam02 extends SuperClassExam 
				implements InterfaceExam01, InterfaceExam02{

	@Override
	public void interfaceExam00() {

	}

	@Override
	public void interfaceExam02(int j) {
	
	}

	@Override
	public void interfaceExam01(int i, int k) {
	
	}
				

}


abstract class SubClassExam03 extends SuperClassExam //abstract class므로 재정의 없어도 가능 
			implements InterfaceExam01, InterfaceExam02{}
			

class SubClassExam04 extends SubClassExam02{
	//여기에 필요한 것들을 추가하여 문제를 해결하세요..
	public void interfaceExam00(){}
	public void interfaceExam01(int i, int k){}
	public void interfaceExam02(int j){}

	SubClassExam04(){
		System.out.println("subClassExam04() 객체 생성");
		System.out.println(" i = "+i);
		System.out.println(" j = "+j);
	}
	SubClassExam04(String s1, String s2){
		System.out.println(s1+" 타입 "+"subClassExam04("+s2+") 객체 생성");
		
	}
	void printSuperString(){
		//InterfaceExam01 ie01 = new InterfaceExam01(); 타입선언은 되나 생성 불가
		InterfaceExam01 ie01;
		System.out.println(" superString = "+superString);
	}
}

//여기서부터는 하나도 고치지 마시고 그대로 쓰면 됩니다.
public class ImplementsInterfaceExam{ 
	public static void main(String args[]){		
		SubClassExam02 sub02sub04 = new SubClassExam04("SubClassExam02", "sub02sub04");
		SuperClassExam  superSub04 = new SubClassExam04("SuperClassExam", "superSub04");
		InterfaceExam01 ifc01Sub04 = new SubClassExam04("InterfaceExam01", "ifc01Sub04");
		SubClassExam04 sub04 = new SubClassExam04();
		sub04.interfaceExam00();
		sub04.interfaceExam01(1,7);
		sub04.superMethod();
		
		
		
		
	}
}

