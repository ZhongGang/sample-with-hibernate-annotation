package com.icode.web.controller;

import com.icode.core.dto.ShopFormDTO;
import com.icode.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:15
 */
@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("shopForm", "shop", new ShopFormDTO());
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String submitForm(ShopFormDTO shop) {
        shopService.saveOrUpdateShop(shop);
        return "redirect:/";
    }
}
