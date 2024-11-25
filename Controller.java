package com_Controller;

import com_Serivce.Service;

public class Controller {

	public static void main(String[] args) throws Exception {
		Service s = new Service();
		
		s.Create();
		System.out.println("A");
		s.Insert();
		System.out.println("B");
		s.Update();
		System.out.println("C");
		s.FatchDetails();
		System.out.println("D");

	}

}
