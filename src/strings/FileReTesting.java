package strings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class FileReTesting {
	public static void main(String[] args) throws IOException {
//		FileWriter fs = new FileWriter("C:\\Users\\PANKAJ\\Desktop\\te.txt", true);
//		fs.write("str pankaj djhgfkjsdfjvhsdmzvhms" + System.lineSeparator());// System.getProperty("line.separator"));
//		fs.flush();
//		// fs.close();
//		BufferedWriter wr = new BufferedWriter(fs);
//		wr.write("hiosajvbv j,");
//		wr.close();
//		File fl = new File("C:\\Users\\PANKAJ\\Desktop\\te.txt");
	//	System.out.println(fl.hashCode());
	//	Date d = new Date();
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		System.out.println(day);
		 cal.add(Calendar.DAY_OF_YEAR, 3);
		Date nextDate=cal.getTime();
		 String [] a = nextDate.toString().split(" ");
		 System.out.println(Arrays.deepToString(a));
		System.out.println(nextDate);
		System.out.println(nextDate.getDate());
		System.out.println(nextDate.getMonth()+1);
		System.out.println("+ +");
	}
}
