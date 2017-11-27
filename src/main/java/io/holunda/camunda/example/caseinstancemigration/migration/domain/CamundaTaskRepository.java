package io.holunda.camunda.example.caseinstancemigration.migration.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CamundaTaskRepository extends JpaRepository<CamundaTask, Integer> {
    List<CamundaTask> findByCaseInstanceId(String caseInstanceId);
}
