package pl.semkowski.jdbcpwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentGui {
 @GetMapping("/gui")
 public String get(){
    return "gui";
 }

}
