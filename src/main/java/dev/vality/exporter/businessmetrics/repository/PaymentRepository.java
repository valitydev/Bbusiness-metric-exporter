package dev.vality.exporter.businessmetrics.repository;

import dev.vality.exporter.businessmetrics.entity.PaymentEntity;
import dev.vality.exporter.businessmetrics.entity.PaymentPk;
import dev.vality.exporter.businessmetrics.entity.PaymentsMetricDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, PaymentPk> {

    @Query(name = "getPaymentsMetricsByInterval", nativeQuery = true)
    List<PaymentsMetricDto> getPaymentsMetricsByInterval(String intervalTime);

}
