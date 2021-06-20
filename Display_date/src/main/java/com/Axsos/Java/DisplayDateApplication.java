package com.Axsos.Java;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	@RequestMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Index.jsp";
    }
	@RequestMapping("/time")
    // 3. Method that maps to the request route above
    public String time(Model model) { // 3
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:a");  
		LocalDateTime now = LocalDateTime.now();  
		String i = dtf.format(now);
		System.out.println(i);
		model.addAttribute("dojoName", i);
            return "Time.jsp";
    }
	@RequestMapping("/date")
    // 3. Method that maps to the request route above
    public String date(Model model) { // 3
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, 'the' dd 'of' MM, yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		String i = dtf.format(now);
		System.out.println(i);
		model.addAttribute("dojoName", i);
            return "Date.jsp";
    }
	
}
