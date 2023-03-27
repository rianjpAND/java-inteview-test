package Repository.Notifications;

import java.util.Map;
import DomainObjects.Notification;

public interface INotificationRepository
{
  Map<Integer, Notification> allNotifications();
  Notification notificationById(Integer id);
}