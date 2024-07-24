package SpringBoot.PaymentMicroservice.Repository;

import SpringBoot.PaymentMicroservice.DTO.PaymentRequest;
import SpringBoot.PaymentMicroservice.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class  PaymentRepository {
    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel=executeQuery(request);
        return paymentModel;
    }

    private PaymentEntity executeQuery(PaymentRequest request) {

        PaymentEntity payment=new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(1000.00);
        return payment;
    }
}