package SpringBoot.PaymentMicroservice.Service;

import SpringBoot.PaymentMicroservice.DTO.PaymentRequest;
import SpringBoot.PaymentMicroservice.DTO.PaymentResponse;
import SpringBoot.PaymentMicroservice.Entity.PaymentEntity;
import SpringBoot.PaymentMicroservice.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj){
        PaymentEntity paymentModel=paymentRepository.getPaymentById(internalRequestObj);
        PaymentResponse paymentResponse=mapModelToResponseDTO(paymentModel);
        return  paymentResponse;
    }

    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity) {

        PaymentResponse response=new PaymentResponse();
        response.setPaymentId(paymentEntity.getId());
        response.setAmount(paymentEntity.getPaymentAmount());
        response.setCurrency(paymentEntity.getPaymentCurrency());
        return  response;
    }
}

