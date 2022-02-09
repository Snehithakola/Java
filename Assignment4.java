import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
class Kyc_formdate
{
    Date signUpDate,currentDate;
    String stringStartDate,stringEndDate;
    Date startDate,endDate;
    public void rangeKyc(String inputSignUpDate,String inputCurrentDate)
    {
        try{
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyy");
            signUpDate=dateFormatter.parse(inputSignUpDate);
            currentDate=dateFormatter.parse(inputCurrentDate);
        }
    }
}
public class Assignment4{
    public static void main(String args[])
    {

    }
}

