package Services.Notifications;

import java.util.Map;
import DomainObjects.Notification;

public interface INotificationService {
  Map<Integer, Notification> allNotifications();
  Notification notificationById(Integer id);
}