package localWeb.hiPlan.service;

import localWeb.hiPlan.domain.PlanItem;
import localWeb.hiPlan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlanService {
    @Autowired
    private PlanRepository planRepository;

    @Transactional
    public List<PlanItem> findItems(){
        List<PlanItem> items = planRepository.findAll();
        if(items.isEmpty()) System.out.println("null");
        return items;
    }
}
