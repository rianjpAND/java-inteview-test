import java.util.List;
import java.time.LocalDate;
import DomainObjects.Defect;
import Services.Defects.DefectService;
import Services.Defects.IDefectService;
import Services.Revisions.RevisionService;
import Services.Revisions.IRevisionService;
import Services.Notifications.NotificationService;
import Services.Notifications.INotificationService;
import Repository.Revisions.IRevisionRepository;
import Repository.Revisions.RevisionRepository;
import Repository.Notifications.NotificationRepository;
import Repository.Notifications.INotificationRepository;


class Main {
  
  public static void main(String[] args) {

    IRevisionRepository revisionRepo = new RevisionRepository();
    INotificationRepository notificationRepo = new NotificationRepository();
    
    IRevisionService revisionService = new RevisionService(revisionRepo);
    INotificationService notificationService = new NotificationService(notificationRepo);
    
    IDefectService service = new DefectService(revisionService, notificationService);
    List<Defect> defects = service.defectWorkbenchByDate(LocalDate.now());

    for (Defect defect : defects) {
        System.out.println(defect.getNotificationId());
    };
  }
  
}