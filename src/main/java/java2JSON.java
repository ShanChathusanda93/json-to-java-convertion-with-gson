import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class java2JSON {
    public static void main(String[] args) {
        Staff staff=createStaff();
        Gson gson=new Gson();
        String json=gson.toJson(staff);

        try(FileWriter fileWriter=new FileWriter("/home/shan/gdpr_project/JSON2Javaconvertion/consent.json")){
            gson.toJson(staff,fileWriter);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Staff createStaff(){
        Staff staff=new Staff();

        staff.setName("mkyong");
        staff.setAge(35);
        staff.setPosition("Founder");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<String>();
        skills.add("java");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        return staff;
    }
}
