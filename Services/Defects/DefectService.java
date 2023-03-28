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

    List<Defect> defects = new ArrayList<Defect>();

    // to do - some dummy data
    Defect d = new Defect();
    d.setNotificationId(1);
    d.setNotificationDescription("description");
    d.setAircraftRegistration("G-REG");
    d.setNotificationCode(NotificationCode.D3);
    d.setNotificationDateRequired(LocalDate.now());
    d.setRevisionId(1);
    d.setRevisionDescription("description");
    defects.add(d);
    
    return defects;
  }

}