package localWeb.hiPlan.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Getter @Setter
@Entity
@Table(name = "plan_item")
public class PlanItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private String week;
    private String situation;

    private LocalDate startDate;
    private LocalDate endDate;

    private Integer percentage;

    public PlanItem(){}
}

