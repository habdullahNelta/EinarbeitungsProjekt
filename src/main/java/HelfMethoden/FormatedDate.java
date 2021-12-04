package HelfMethoden;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatedDate {

    String format="yyyyMMdd_HHmmss";
    Date date=new Date();
    public  String getFormatedDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

}
