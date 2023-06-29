package localWeb.hiPlan.repository;

import localWeb.hiPlan.domain.PlanItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<PlanItem, Long> {
}
