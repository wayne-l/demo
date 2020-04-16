package com.wayne.controller;

import com.wayne.entity.Kpds;
import com.wayne.service.UserService;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("kpds")
@Slf4j
public class KaopuController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserService userService;

    @RequestMapping("list")
    public String list(HttpServletRequest request, ModelMap model) {
        log.info("request client info:"+request.getRemoteAddr());

        List<Kpds> users = userService.list();


        model.addAllAttributes(users);
        model.addAttribute("title", "wayne");

        return "kaopu";
    }



}
