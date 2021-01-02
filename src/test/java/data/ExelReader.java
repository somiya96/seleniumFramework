package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExelReader
{

	static FileInputStream fis = null;
	
	
	
	public FileInputStream getFileInputStream()
	{
		String filePath = 
				("C:\\Users\\SOMIYA\\Desktop\\tof\\src\\test\\java\\data\\userData.xlsx");
		
		File srcFile = new File (filePath);
		
		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return fis;
	}
	
	public Object [] [] getExcelData()  throws IOException
	{
		
		fis = getFileInputStream();
	   
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int totalRows = (sheet.getLastRowNum()+1);
		int totalCol  = 4 ;
		
		String [] [] arrayExcelData = 
				new String [totalRows][totalCol];
		
		for (int i = 0; i < totalRows; i++) 
		{
			for (int j = 0; j < totalCol; j++)
			{
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString();
				
			}
		}
		
		wb.close();
		return arrayExcelData;
		
	}
	
	
	
	
	
	
	
}
