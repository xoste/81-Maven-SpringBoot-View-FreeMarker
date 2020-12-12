package com.xoste.leon.controller;

import com.xoste.leon.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leon
 */
@Controller
public class UsersController {
    @RequestMapping("/show")
    public String showUsers(Model model) {
        List<Users> list = new ArrayList<>();
        list.add(new Users(1, "张三", "14324"));
        list.add(new Users(2, "李四", "23535235"));
        list.add(new Users(3, "王五", "14343234十多个都是是24"));
        model.addAttribute("usersList", list);
        return "/users_list";
    }
}
