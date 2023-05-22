package kz.abcompany.notification;

import kz.abcompany.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
            Notification.builder()
                    .toCustomerId(notificationRequest.toCustomerId())
                    .toCustomerEmail(notificationRequest.toCustomerEmail())
                    .sender("Abcompany")
                    .message(notificationRequest.message())
                    .sentAt(LocalDateTime.now())
                    .build()
        );
    }

}
