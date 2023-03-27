package Services.Defects;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import DomainObjects.Defect;
import Services.Revisions.IRevisionService;
import Services.Notifications.INotificationService;

public class DefectService
    implements IDefectService
{
  private final IRevisionService revisionService;
  private final INotificationService notificationService;

  public DefectService(IRevisionService revisionService,
                       INotificationService notificationService) {
    this.revisionService = revisionService;
    this.notificationService = notificationService;
  }
  
  public List<Defect> defectWorkbenchByDate(LocalDate currentDate)
  {
    List<Defect> defects = new ArrayList<Defect>();

    // to do
    
    return defects;
  }

}