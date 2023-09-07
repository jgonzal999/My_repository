package com;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File ff= new File("//home//javiergonzalezv//Desktop//ExercisesTemp_2//");
//		
		String filename = ff.getPath()+"//"+"c.txt";
		System.out.println(filename);
		FileOutputStream fos = new FileOutputStream(filename,true);
		fos.write('A');
		fos.close();
		
		
		System.out.println(ff.getPath());
		System.out.println(ff.isDirectory());
		System.out.println(ff.isFile());
		String allFiles[] = ff.list();
		for (String name:allFiles) {
			System.out.println(name);
		}
		String filename2 = ff.getPath()+"//"+"r.txt";
		ff=new File(filename2);
		ff.createNewFile();
		
		// example of delete and create from console
		File fff= new File("//home//javiergonzalezv//Desktop//ExercisesTemp_2//");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name");
		String fileName =sc.next();
		String newPath = fff.getPath()+"//"+fileName;
		if(fff.exists()) {
			System.out.println("Exists");
			fff.delete();
			System.out.println("deleted");
		}else {
			fff.createNewFile();
			System.out.println("created");
			
		}

	}

}
