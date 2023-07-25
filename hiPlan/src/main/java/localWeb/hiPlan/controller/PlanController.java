package localWeb.hiPlan.controller;

import localWeb.hiPlan.dto.PlanDto;
import localWeb.hiPlan.service.PlanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PlanController {
    private final PlanService planService;

    @GetMapping("/")
    public String list(Model model){
        Map<String, List<PlanDto>> items = planService.findItemsForWeek();
        model.addAttribute("mon_items", items.get("mon"));
        model.addAttribute("tus_items", items.get("tus"));
        model.addAttribute("wne_items", items.get("wen"));
        model.addAttribute("ths_items", items.get("ths"));
        model.addAttribute("fri_items", items.get("fri"));
        model.addAttribute("sat_items", items.get("sat"));
        model.addAttribute("sun_items", items.get("sun"));
        return "index";
    }
}
