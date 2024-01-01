package robledo.junior.picpaysimplificado.service;
import org.springframework.stereotype.Service;

import robledo.junior.picpaysimplificado.domain.user.User;

@Service
public class NotificationService {


    public void sendNotification(User user, String message){
        String email = user.getEmail();

        System.out.println(email + message);
    }
}