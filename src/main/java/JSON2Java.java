import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class JSON2Java {
    public static void main(String[] args) {
        Gson gson=new Gson();

        try {
            Reader reader=new FileReader("/home/shan/gdpr_project/JSON2Javaconvertion/consent.json");
            Staff staff=gson.fromJson(reader,Staff.class);
            System.out.println(staff.getName());
            System.out.println(staff.getSkills());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
