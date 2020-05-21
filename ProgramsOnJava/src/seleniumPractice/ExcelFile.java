package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ExcelFile {
public static void main(String[] args) throws IOException {
	// throws FileNotFoundException
    FileInputStream fs = new FileInputStream("C:\\Users\\PANKAJ\\Desktop\\Test.xlsx");
    //throws IOException
    XSSFWorkbook book = new XSSFWorkbook(fs);
    XSSFCell clt;
    XSSFSheet sheet = book.getSheet("Sheet1");
    //System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
    int row = sheet.getLastRowNum()+1;
    System.out.println(row);
    int col = sheet.getRow(0).getLastCellNum();
    System.out.println(col);
    ArrayList ls = new ArrayList();
    for (int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        	XSSFRow rw = sheet.getRow(i);
             Cell cl = rw.getCell(j);
            // if(cl.getCellType()==clt.) {
          System.out.print(sheet.getRow(i+1).getCell(j).getStringCellValue()+" :");
             //}
        }
        System.out.println();
    }
}
}
