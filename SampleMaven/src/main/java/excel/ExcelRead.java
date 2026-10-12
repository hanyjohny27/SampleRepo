package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	//java inbuilt classes fileinputstream,xssworkbook,xssfsheet 
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;

	public static String getStringData(int a, int b) throws IOException
	{
		f = new FileInputStream("C:\\Users\\tibin\\Desktop\\ExcelRead.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}
	
	public static int getIntegerData(int a, int b) throws IOException
	{
		f = new FileInputStream("C:\\Users\\tibin\\Desktop\\ExcelRead.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		// type casting-conversion of one datatype to another
		int x = (int) c.getNumericCellValue();
		return x;
	}
	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelRead.getStringData(1, 0)+" "+ExcelRead.getIntegerData(1, 1));
		System.out.println();
		
		System.out.println(ExcelRead.getStringData(2, 0)+" "+ExcelRead.getIntegerData(2, 1));
		System.out.println();
		
		System.out.println(ExcelRead.getStringData(3, 0)+" "+ExcelRead.getIntegerData(3, 1));
		System.out.println();
		
		System.out.println(ExcelRead.getStringData(4, 0)+" "+ExcelRead.getIntegerData(4, 1));
		System.out.println();
	}

}
