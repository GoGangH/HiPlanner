package localWeb.hiPlan.service;

import localWeb.hiPlan.domain.PlanItem;
import localWeb.hiPlan.dto.PlanDto;
import localWeb.hiPlan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, List<PlanDto>> findItemsForWeek(){
        List<PlanItem> items = findItems();
        Map<String, List<PlanDto>> weekItems = new HashMap<>();

        for(PlanItem item : items){
            PlanDto planDto = new PlanDto(item);
            List<PlanDto> dtoTemp = weekItems.get(item.getWeek());
            if(dtoTemp==null) dtoTemp = new ArrayList<PlanDto>();
            dtoTemp.add(planDto);
            weekItems.put(item.getWeek(), dtoTemp);
        }

        return weekItems;
    }
}
