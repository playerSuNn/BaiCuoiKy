package project_cuoiky;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        
        DateDemo date = new DateDemo();
        System.out.println("Ngày tháng  : ");
        System.out.println(date.toString());

        //Calendar
        Calendar c = Calendar.getInstance();
        // displaying the  time and date using getTime()
        //hãy hiển thị giờ bằng getTime()
        System.out.println("The current date and time is: ");
        System.out.println(c.getTime());
        //DateFormat
        //SimpleDate
        //getting current date and time using Date class
        //nhận ngày và giwof hiện tại bằng cách suwrr dụng lớp Date
        System.out.println("Using Date class:");
        System.out.println("The formatted date and time is:");
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        //getting current date time using calendar class
        //nhận ngày và giờ hiện tại bằng cách sử dụng lớp Calendar 
        System.out.println("\nUsing Calendar class:");
        System.out.println("The formatted date and time is:");
        Calendar calobj = Calendar.getInstance();
        System.out.println(df.format(calobj.getTime()));

    }
    
}
