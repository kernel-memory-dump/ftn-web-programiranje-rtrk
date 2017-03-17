package rs.ac.uns.ftn.rtrk.controller;

import java.util.ArrayList;
import java.util.List;

import rs.ac.uns.ftn.rtrk.model.Ispisivo;
import rs.ac.uns.ftn.rtrk.model.PolniOrgan;

public class Main {

	public static void f1(PolniOrgan p1){
		System.out.println(p1.getDuzina());
	}
	
	public static void main(String[] args) {
		PolniOrgan p1 = new PolniOrgan();
		PolniOrgan p2 = new PolniOrgan();
		
		System.out.println("p1 == p2 " + (p1 == p2));
		System.out.println("p1 == p1 " + (p1 == p1));
		System.out.println("p1.equals(p2) " + (p1.equals(p2)));
		
		List<PolniOrgan> polniOrgani = new ArrayList<>();
		
		polniOrgani.add(p1);
		//polniOrgani.add(p2);
		
		System.out.println("DA LI SADRZI P2? " + polniOrgani.contains(p2));
		
		Ispisivo i = new Ispisivo() {
			
			@Override
			public void ispisiSe() {
				// TODO Auto-generated method stub
				
			}
		};
		
		f1(p1);

	}

}
