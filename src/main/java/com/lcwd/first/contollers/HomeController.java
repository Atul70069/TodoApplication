package com.lcwd.first.contollers;

import com.lcwd.first.config.LCWDconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Value("${lcwd.profile.image.path}")
    private String profilepath;
    @Autowired
    private LCWDconfig lcwDconfig;

    @RequestMapping("/todos")
public List<String> justTest()
{
    List<String> todos= Arrays.asList("Learn java","Learn Spring Boot","Java developer","Selected","Google",
            "everythings will be ok trust hanuman ji","https://career.infosys.com/jobdesc?jobReferenceCode=INFSYS-EXTERNAL-179363&sourceId=1",
            "U can do it ");
    return todos;
}

@RequestMapping("/profile-path")
public  String getProfilepath()
{
    return this.profilepath;
}

@RequestMapping("/lcwdconfig")
public LCWDconfig getLcwDconfig()
{
    System.out.println(this.lcwDconfig);
    return  this.lcwDconfig;
}

}
