package jp.designforlife.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.designforlife.template.dto.MyBatisSampleDto;
import jp.designforlife.template.service.MyBatisSampleService;

@Controller
public class MyBatisSampleControler {

		@Autowired
		private MyBatisSampleService myBatisSampleService;
		
	    @RequestMapping(value = "/MyBatisSample/{id}", method = RequestMethod.GET)
	    public String test(Model model, @PathVariable int id) {
	    	MyBatisSampleDto test = myBatisSampleService.getTest(id);
	        model.addAttribute("message", "MyBatisのサンプルです");
	        model.addAttribute("test", test);
	        return "myBatisSample";
	    }
}
