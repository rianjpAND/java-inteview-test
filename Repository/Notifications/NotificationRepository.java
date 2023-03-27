package Repository.Notifications;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import DomainObjects.Notification;
import DomainObjects.NotificationCode;

public class NotificationRepository
    implements INotificationRepository {
  
  public Map<Integer, Notification> allNotifications() {
    Map<Integer, Notification> notifications = new HashMap<Integer, Notification>();
    notifications.put(1, new Notification(1, "first", LocalDate.now(), NotificationCode.D3));
    notifications.put(2, new Notification(2, "second", LocalDate.now(), NotificationCode.D3));
    notifications.put(3, new Notification(3, "third", LocalDate.now(), NotificationCode.D7));
    notifications.put(4, new Notification(4, "fourth", LocalDate.now(), NotificationCode.D7));
    return notifications;
  }

  public Notification notificationById(Integer id) {
    Map<Integer, Notification> map = allNotifications();
    return map.get(id);
  }

}