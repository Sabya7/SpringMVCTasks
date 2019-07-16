package main.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    @GetMapping("/")
    public ModelAndView user()
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(User.class);
        User user=annotationConfigApplicationContext.getBean(User.class);
       ModelAndView mv=new ModelAndView("index");
       mv.addObject("name",user.getName());
       return mv;
    }

    @RequestMapping("/task2")
    public String login()
    {

        return "log";
    }
    @RequestMapping("/display")
    public ModelAndView display(HttpServletRequest request)
    {    ModelAndView mv =new ModelAndView("index");
        // String name=request.getParameter("name");
         User user=new User(new StringBuilder(request.getParameter("usr_name")));
         mv.addObject("user",user);
        return mv;
    }
}
