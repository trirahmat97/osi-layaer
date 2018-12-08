package com.sti.bootcamp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
	
    public static void main(String[] args) throws Exception {
    	
    	ArrayList<Customer2> data =  new ArrayList<Customer2>();
    	Customer2 hu = new Customer2();
    	CRUD_Test link = new CRUD_Test();
    	
    	Scanner in = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("1 : mymenu");
		System.out.println("0 : exit");
		System.out.println("-------------------");
		
		System.out.println("choose menu bang : ");
		int a = in.nextInt();
		try {
			switch(a) {
			case 1 :
				menu();
				break;
			case 0 :
				System.exit(0);
				break;
			default:
				System.out.println("not number this Choose menu");
				break;
			}
		}catch(Exception e){
			System.out.println("gak ada choy...");
		}
		
		
	}
    
    public static void menu() {
    	Scanner in = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("1 : Input Data");
		System.out.println("2 : VIew Data");
		System.out.println("3 : Inquiry Data");
		System.out.println("0 : Back To Main Menu");
		System.out.println("-------------------");
		
		System.out.println("choose menu bang : ");
		int a = in.nextInt();		
    	try {
			switch(a) {
			case 1 :
				add();
				menu();
				break;
			case 2 :
				select();
				menu();
				break;
			case 3 :
//				data.Seacrh();
//				menu();
				break;
			case 0 :
//				mainmenu.menu();
				break;
			default:
				System.out.println("not number this Choose menu");
//				menu();
				break;
			}
		}catch(Exception e){
			System.out.println("gak ada choy...");
//			this.menu();
		}
    }
    
    
    public static List<Customer2> select(){
    	CRUD_Test data2 = new CRUD_Test();
		List<Customer2> list = data2.select();
		for(Customer2 customer : list) {
			System.out.println("NOREK : "+customer.getNorek());
			System.out.println("NAMA  : "+customer.getNama());
			System.out.println("ALAMAT: "+customer.getAlamat());
		}
		return list;
    }
    
    public static String add() {
    	Scanner in = new Scanner(System.in);
    	
    	CRUD_Test pro = new CRUD_Test();
    	
    	System.out.print("norek :");
		String norek = in.nextLine();
		System.out.print("nama :");
		String nama = in.nextLine();
		System.out.print("alamat :");
		String alamat = in.nextLine();
		
		Customer2 data = new Customer2();
		
		String data2 = pro.create_data(data);
		System.out.println(data2);
		return data2;
    }   
}
