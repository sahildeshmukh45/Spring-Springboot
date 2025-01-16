import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.logging.ErrorManager;

public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;


    private final Logger Log= LoggerFactory.getLogger(EmailService.class);

    public void sendMail(String to,String subject,String body){
        try {
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setTo(to);
            mail.setSubject(subject);
            mail.setText(body);
            javaMailSender.send(mail);
        }catch (Exception e){

            Log.error("Exception occured while sending mail" , e);
        }
    }
    static int binarySearch(int [] arr, int target, int start , int end){
        int mid =start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return binarySearch(arr,target,mid+1,end);
        }
        return binarySearch(arr,target,start,mid-1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,5,0,arr.length-1));
    }
    static boolean linear(int [] arr, int target, int start , int end){

    }

}
