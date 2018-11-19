package com.hyp.black.controller;

import com.hyp.black.service.BlackService;
import com.hyp.black.vo.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 13:39 2018/11/17
 */
@Controller
public class BlackController {

    @Autowired
    private BlackService blackService;

    @RequestMapping("/start")
    public String start(ModelMap model){
        model.addAttribute("name","HelloFreeMarker");
        return "test";
    }

    @RequestMapping("/save")
    public  void  save(){

    }


    @RequestMapping("/createTemplete")
    public  String  createTemplete(Params params,ModelMap model){
        String connectionStatus = blackService.createTemplete(params);
        model.addAttribute("params",params);
        return "test";
    }
}