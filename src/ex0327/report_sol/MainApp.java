package ex0327.report_sol;

import java.util.ArrayList;
import java.util.List;

import ex0327.report.Audio;
import ex0327.report.Tv;

public class MainApp {

	public static void main(String[] args) {
		// Tv 2대 , Audio 2대 저장하고 그 정보를 출력한다.
//		ElecFunction elec[] = new ElecFunction[5];
//
//		elec[0] = new Tv("A01", 500000, 12);
//		elec[1] = new Tv("A02", 2500, 20);
//		elec[2] = new Tv("A03", 3000, 30);
//
//		elec[3] = new Audio("A04", 8500, 200);
//		elec[4] = new Audio("A05", 700, 100);

		
		List<ElecFunction>  elec = new ArrayList<>();
		
		elec.add( new Tv("A01", 500000, 12));
		elec.add(new Tv("A02", 2500, 20));
		elec.add(new Tv("A03", 3000, 30));

		elec.add(new Audio("A04", 8500, 200));
		elec.add(new Audio("A05", 700, 100));
		
		
		for (ElecFunction e : elec) {
			 e.start();
			//System.out.println(e);
		}

	}
}

