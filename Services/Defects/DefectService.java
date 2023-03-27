package Services.Defects;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import DomainObjects.*;
import Services.Revisions.IRevisionService;
import Services.Notifications.INotificationService;

public class DefectService
    implements IDefectService {
      
  public List<Defect> defectWorkbenchByDate(LocalDate currentDate) {
    // to do
    return new ArrayList<Defect>();
  }

}