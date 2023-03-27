package Services.Notifications;

import java.util.Map;
import DomainObjects.Notification;
import Repository.Notifications.INotificationRepository;

public class NotificationService
  implements INotificationService {
  private final INotificationRepository repository;

  public NotificationService(INotificationRepository repository) {
    this.repository = repository;
  }

  public Map<Integer, Notification> allNotifications() {
    return repository.allNotifications();
  }

  public Notification notificationById(Integer id) {
    return repository.notificationById(id);
  }
}