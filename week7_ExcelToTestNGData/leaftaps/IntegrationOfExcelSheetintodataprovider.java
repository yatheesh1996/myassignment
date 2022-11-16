package testcase;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationOfExcelSheetintodataprovider {

	public static String[][] readDataFromExcel(String filename,int sheetindex) throws IOException {
		
				XSSFWorkbook book = new  XSSFWorkbook("./InputData/"+filename+".xlsx");
				XSSFSheet sheet = book.getSheetAt(sheetindex);
				int rowCount = sheet.getLastRowNum();
				int colCount = sheet.getRow(0).getLastCellNum();
				//get the values of all the cells
				String[][] data = new String[rowCount][colCount];
				for(int i=1;i<=rowCount;i++) {
					for(int j=0;j<colCount;j++) {
						
						String valuesOfTheCells = sheet.getRow(i).getCell(j).getStringCellValue();
						data[i-1][j]=valuesOfTheCells;
					}
				}
				book.close();
				return data;

		}
		}




