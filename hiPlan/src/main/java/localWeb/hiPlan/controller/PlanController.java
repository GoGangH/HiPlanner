package localWeb.hiPlan.controller;

import localWeb.hiPlan.domain.PlanItem;
import localWeb.hiPlan.dto.PlanDto;
import localWeb.hiPlan.service.PlanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PlanController {
    private final PlanService planService;

    @GetMapping("/")
    public String list(Model model){
        List<PlanItem> items = planService.findItems();
        model.addAttribute("items", items);
        return "index";
    }
}
