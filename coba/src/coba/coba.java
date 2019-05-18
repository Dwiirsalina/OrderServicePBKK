package coba;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class coba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
    	System.out.println(dateFormat.format(date)); 

	}

}
