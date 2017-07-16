package thesis.scxmlidltoapi.utils;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void createFolder(String name) {

		File theDir = new File(name);

		// if the directory does not exist, create it
		if (!theDir.exists()) {
//			System.out.println("creating directory: " + theDir.getName());
			boolean result = false;

			try {
				theDir.mkdir();
				result = true;
			} catch (SecurityException se) {
				// handle it
			}
			if (result) {
//				System.out.println("DIR created");
			}
		}
	}

	public void createFile(String name) {

		try {
			System.setOut(new PrintStream(new File("Generated API/" + name)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> listFilesForFolder(final File folder) {
		ArrayList<String> webIDL = new ArrayList<String>();
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				Path currentRelativePath = Paths.get("");
				String s = folder.getAbsolutePath();
//				System.out.println("currently looking"+folder.getAbsolutePath());
//				System.out.println(s);
//				System.out.println("1" + s + "/" + fileEntry.getName());
				webIDL.add(s+"/"+fileEntry.getName());
			}
		}
		return webIDL;
	}
	
	public String getLuaBoiler(){
		StringBuilder temp = new StringBuilder();
		temp.append("--Meta class\n");
		temp.append("\nInterpreter = {name=0}");
		temp.append("\nlocal currentstate");
		temp.append("\nlocal CANCELLED, FINISHED, FAULTED, IDLE, INSTANTIATED,  READY = -2, -1, 0, 1, 2, 3");
		temp.append("\n-- Base class method new\n\n");
		temp.append("\nfunction Interpreter:fromURL (o,nam)");
		temp.append("\n o = o or {}");
		temp.append("\n setmetatable(o,self)");
		temp.append("\n self.__index = self");
		temp.append("\n nam = nam or 0");
		temp.append("\n local scxml   = io.open(nam):read('*all')");
		temp.append("\n machine = LXSC:parse(scxml)");
		temp.append("\n self.name = machine");
		temp.append("\n currentstate=IDLE");
		temp.append("\n return o");
		temp.append("\n end\n");
		
		
		
		
		return temp.toString();
		
	}
}
