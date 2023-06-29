package localWeb.hiPlan.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PlanDto {
    private Long id;

    private String title;
    private String description;

    private String week;
    private String situation;

    private LocalDate startDate;
    private LocalDate endDate;

    private Integer percentage;
}
