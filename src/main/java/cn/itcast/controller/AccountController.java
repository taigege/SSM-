package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层:查询所有用户的信息");
        //调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletResponse response, HttpServletRequest request) throws Exception{
        System.out.println("表现层:保存用户的信息");
        //调用service的方法
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"findAll");
        return ;
    }
}
