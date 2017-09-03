package com.it18zhang.mybigdata.web;

import com.it18zhang.mybigdata.model.User;
import com.it18zhang.mybigdata.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xiebi on 5/20/2017.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService us;

    @RequestMapping(value = "/findone", method = RequestMethod.GET)
    public String findOne(@RequestParam("id") Integer id) {
        User user = us.getEntity(id);
        System.out.println(user.getName());
        return "home";
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public String findAll(Model model) {
        List<User> list = us.findAll();
        model.addAttribute("userList", list);
        return "userList";
    }

    @RequestMapping(value = "/deleteone", method = RequestMethod.GET)
    public String deleteOne(@RequestParam("id") Integer id, Model model) {
        us.deleteById(id);
        return "redirect:/user/findall";
    }

    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String toReg() {
        return "userReg";
    }

    @RequestMapping(value = "/doreg",method = RequestMethod.POST)
    public String doReg(User user) {
        System.out.println("do Reg");
        us.saveEntity(user);
        System.out.println("password: "+user.getPassword());
        return "redirect:/user/findall";
    }

    @RequestMapping(value = "/viewone",method = RequestMethod.GET)
    public String viewOne(@RequestParam("id")Integer id,Model model) {
        User user = us.getEntity(id);
        model.addAttribute("user",user);
        return "userInfo";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return  "login";
    }

    @RequestMapping(value = "/dologin",method = RequestMethod.POST)
    public String doLogin(User user, HttpSession session,Model model) {
        User u0=us.validateLoginInfo(user.getName(),user.getPassword());

        if (u0==null){//fail
            model.addAttribute("error","name/password is invalid");
            return "login";
        }else{//success
            session.setAttribute("user",u0);
            return "welcome";
        }
    }
}
