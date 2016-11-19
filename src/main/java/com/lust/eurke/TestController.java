package com.lust.eurke;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2016/11/19.
 */
@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private static ApplicationInfoManager applicationInfoManager;

    @Autowired
    private static EurekaClient eurekaClient;

    @Autowired
    private StudentMapper stuMapper;

    @RequestMapping("/like")
    public List<Student> likeName(@RequestParam String name){
        return stuMapper.likeName(name);
    }

}
