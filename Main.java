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

    // set-up some services
    IRevisionRepository revisionRepository = new RevisionRepository();
    IRevisionService revisionService = new RevisionService(revisionRepository);
    INotificationRepository notificationRepository = new NotificationRepository();
    INotificationService notificationService = new NotificationService(notificationRepository);

    // create the defect service and fetch the defect workbench data
    IDefectService defectService = new DefectService();
    List<Defect> defects = defectService.defectWorkbenchByDate(LocalDate.now());

    // display our temp view
    System.out.println("Today's defect workbench");
    defects.forEach(d -> System.out.println(String.format("%s", d.toString())));
  }
      
}