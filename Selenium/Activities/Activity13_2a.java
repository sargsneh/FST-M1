package Activities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity13_2a {
	    //Create excel
		public void writeExcel(String filePath) throws IOException {
	        // to create blank workbook
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        //to create a blank sheet
	        XSSFSheet sheet = workbook.createSheet("Sheet1");
	        //data needed to be in the sheet
	        List<String[]> data = new ArrayList<String[]>();
	        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
	        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
	        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
	        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};
	        data.add(heading);
	        data.add(row1);
	        data.add(row2);
	        data.add(row3);
		
	        //to add data to the cells in the Excel sheet
	        int rownum = 0;
	        for (String[] rowData : data) {
	            //new row is created
	            Row row = sheet.createRow(rownum++);
	            int cellnum = 0;
	            for (String cellData : rowData) {
	                //new cell in next column		
	                Cell cell = row.createCell(cellnum++);		
	                cell.setCellValue(cellData);		
	            }
		
	        }
		
	        //add FileOutputStream to write the data to the Excel sheet
	        try {		
	            FileOutputStream out = new FileOutputStream(new File(filePath));		
	            workbook.write(out);
	            //close the output stream and the workbook
	            out.close();		
	            workbook.close();		
	        }
		
	        //Add a catch block to handle IOException
	        catch (Exception e) {		
	            e.printStackTrace();		
	        }		
	    }
		
	 //Open a FileInputStream with the filePath to read data from Excel sheet
		public void readExcel(String filePath) {		
	        try {		
	            FileInputStream file = new FileInputStream(filePath);		
	            XSSFWorkbook workbook = new XSSFWorkbook(file);	
	            XSSFSheet sheet = workbook.getSheetAt(0); 
		
	            //Create an iterator that will loop through each row		
	            Iterator<Row> rowIterator = sheet.iterator();		
	            while (rowIterator.hasNext()) {		
	                Row row = rowIterator.next();		
	                Iterator<Cell> cellIterator = row.cellIterator();
	                while (cellIterator.hasNext()) {		
	                    Cell cell = cellIterator.next();
	                    switch (cell.getCellType()) {		
	                    case NUMERIC: 		
	                        System.out.print(cell.getNumericCellValue() + " \t ");		
	                        break;		
	                    case STRING:		
	                        System.out.print(cell.getStringCellValue() + " \t ");		
	                        break;		
	                    default:		
	                        System.out.println("Invalid value");		
	                        break;		
	                    }		
	                }		
	                System.out.println("");		
	            }
	            //close the input stream and the workbook
	            file.close();		
	            workbook.close();		
	        }		
	        catch (Exception e) {		
	            e.printStackTrace();		
	        }		
	    }
				
	    public static void main(String args[]) throws IOException {
		//Create a String variable to save the file path.		
	        String filePath = "src/test/resources/sample.xlsx";
	        Activity13_2a objExcelFile = new Activity13_2a();		
	        objExcelFile.writeExcel(filePath);
	        objExcelFile.readExcel(filePath);
		
	    }
		
	}
