package com.neo.web;

import com.neo.model.MobileFoodFacilityPermit;
import com.neo.service.MobileFoodFacilityPermitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MobileFoodFacilityPermitController {

    @Resource
    MobileFoodFacilityPermitService mobileFoodFacilityPermitService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/mobileFoodFacilityPermitslist";
    }

    @RequestMapping("/mobileFoodFacilityPermitslist")
    public String list(Model model) {
        List<MobileFoodFacilityPermit> mobileFoodFacilityPermits=mobileFoodFacilityPermitService.getMobileFoodFacilityPermitList();
        System.out.println("mobileFoodFacilityPermits");
        System.out.println(mobileFoodFacilityPermits);

        model.addAttribute("mobileFoodFacilityPermits", mobileFoodFacilityPermits);
        return "mobilefoodfacilitypermit/list";
    }

    @RequestMapping("/tomobileFoodFacilityPermitAdd")
    public String toAdd() {
        return "mobilefoodfacilitypermit/mobilefoodfacilitypermitAdd";
    }

    @RequestMapping(value="/mobilefoodfacilitypermitadd",method = RequestMethod.POST)
    public String add(MobileFoodFacilityPermit mobileFoodFacilityPermit) {
        mobileFoodFacilityPermitService.save(mobileFoodFacilityPermit);
        return "redirect:/mobileFoodFacilityPermitslist";
    }
    @RequestMapping("/mobileFoodFacilityPermittoEdit")
    public String toEdit(Model model,Long id) {
        MobileFoodFacilityPermit mobileFoodFacilityPermit=mobileFoodFacilityPermitService.findMobileFoodFacilityPermitById(id);
        model.addAttribute("mobileFoodFacilityPermit", mobileFoodFacilityPermit);
        return "mobilefoodfacilitypermit/mobilefoodfacilitypermitEdit";
    }

    @RequestMapping("/mobileFoodFacilityPermitedit")
    public String edit(MobileFoodFacilityPermit mobileFoodFacilityPermit) {
        mobileFoodFacilityPermitService.edit(mobileFoodFacilityPermit);
        return "redirect:/mobileFoodFacilityPermitslist";
    }


    @RequestMapping("/mobileFoodFacilityPermitdelete")
    public String delete(Long id) {
        mobileFoodFacilityPermitService.delete(id);
        return "redirect:/list";
    }
}
