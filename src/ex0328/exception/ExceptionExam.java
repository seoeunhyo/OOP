package ex0328.exception;

public class ExceptionExam {

	public void aa(String [] args) throws Exception {
		System.out.println("aa 메소드 시작.....");
		try {
			String str = args[0];
			System.out.println("전달된 값 = "+args[0]);
			
			int no = Integer.parseInt(str);
			System.out.println("변환된 값 = "+no);
			
			this.bb(no);
			
			int result = 100/no;
			System.out.println("나눈 결과 : "+result);
			
			
			//System.out.println("e = " + e);//이 밑에까지 실행이 안 되기 때문에 무조건 try에 넣지 마라 
			
			//catch 작성할 때 반드시 서브 클래스부터 작성한다. 
		}catch(ArrayIndexOutOfBoundsException e) { //예외 없으면 catch에 들리지 않는다
			//예발생했을 때 해야할 일!
			System.out.println("e = " + e);// e.toString() -> 예외 클래스: 예외 메시지
			
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요 = " +e.getMessage());
//		}catch(Exception e) {
//			//Exception으로 크게 예외처리(감싸기) 
//		
//			//개발할 때 예외가 발생하면 예외대한 정보를 정확하게 추적할 수 있는 정보를 제공한다.
//			//배포할 때는(운영 모드 - production) 반드시 제거해야한다. 
//			e.printStackTrace();//예외 메시지를 stack에 저장하고 stack에 저장된 메시지를 꺼내서 출력해준다.
//			System.out.println("예외가 발생했어요~~~~ ");
//		}
	
		System.out.println("aa 메소드 끝......");
		
	}
	
	public void bb(int i) throws Exception { //catch가 없으면 error 발생 
		
		try{System.out.println("bb 메소드 시작 .....");
		if(i >10) {
			
			//throw new Exception("\n10보다 작아야 해요"); -> 예외처리가 필요하다 
			//throw new RuntimeException("\n10보다 작아야 해요");
		}
		int re = 200 / i;
		System.out.println("bb안에서 나눈 결과 : "+ re );
		
		}finally{
			System.out.println("bb 메소드 끝 ..... - 예외 발생 여부 상관 없이 무조건 실행 ");
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("****메인 시작합니다.*****");
		
		ExceptionExam exam = new ExceptionExam();
		exam.aa(args);
		
		
		System.out.println("****메인 끝입니다.*****");
		
	}

}
