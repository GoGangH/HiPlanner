package localWeb.hiPlan.dto;

import localWeb.hiPlan.domain.PlanItem;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PlanDto {
    private String title;
    private String description;

    private String week;
    private String situation;

    private LocalDate startDate;
    private LocalDate endDate;

    private Integer percentage;

    public PlanDto(PlanItem planItem){
        this.title = planItem.getTitle();
        this.description = planItem.getDescription();
        this.week = planItem.getWeek();
        this.situation = planItem.getSituation();
        this.startDate = planItem.getStartDate();
        this.endDate = planItem.getEndDate();
        this.percentage = planItem.getPercentage();
    }
}
