/*
*    THIS IS A TEST DATA CLASS - YOU DO NOT NEED TO CHANGE ANYTHING
*/
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
    
    // revisions.put(1, new Revision(1, "D3 NI/DAILY/ETOPS - MMK", LocalDate.now().PlusDays(-1), "G-MMK", new Integer[]{1,2}));
    notifications.put(1, new Notification(1, "AFT CARGO NO 2 RUB STRIP PULLEY", LocalDate.now().plusDays(2), NotificationCode.D3));
    notifications.put(2, new Notification(2, "LAV-GALLEY FAN R STATUS MESSAGE", LocalDate.now().plusDays(3), NotificationCode.D3));
    
    // revisions.put(2, new Revision(2, "D7/D3/DAILY/ETOPS - TBB", LocalDate.now().PlusDays(-7), "G-TBB", new Integer[]{3,4,5}));
    notifications.put(3, new Notification(3, "SMOKE HOOD TIME EX AT D2R FWD", LocalDate.now().plusDays(60), NotificationCode.D7));
    notifications.put(4, new Notification(4, "RC TOILET CEILING LIGHT NOT WORKING", LocalDate.now().plusDays(-2), NotificationCode.D3));
    notifications.put(5, new Notification(5, "NO.3 BRAKE UNIT HYDRAULIC WEEP", LocalDate.now().plusDays(-7), NotificationCode.D3));
    
    // revisions.put(3, new Revision(3, "D3/D7/DAILY/ETOPS - IIG", LocalDate.now().PlusDays(-4), "G-IIG", new Integer[]{6,7}));
    notifications.put(6, new Notification(6, "TRAY TABLE HINGE U/S GRUB SCREW", LocalDate.now().plusDays(40), NotificationCode.D3));
    notifications.put(7, new Notification(7, "R+L PRE BOXES ARE CRACKED", LocalDate.now().plusDays(20), NotificationCode.D3));
    
    // revisions.put(4, new Revision(4, "D3/DAILY/ETOPS - IIW", LocalDate.now().PlusDays(-1), "G-IIW", new Integer[]{8,9,10,11}));
    notifications.put(8, new Notification(8, "D4R - BUMP STRIP TO LEFT OF AT", LocalDate.now().plusDays(50), NotificationCode.D3));
    notifications.put(9, new Notification(9, "SEAT 23A CUSHION SEAT AND BACKREST", LocalDate.now().plusDays(52), NotificationCode.D3));
    notifications.put(10, new Notification(10, "REPORTED BY LOADING TEAM ON AR", LocalDate.now().plusDays(-1), NotificationCode.D3));
    notifications.put(11, new Notification(11, "SEAT 11J MAKING GRINDING NOISE", LocalDate.now().plusDays(52), NotificationCode.D3));
    
    // revisions.put(5, new Revision(5, "D3/D7 GOGO/DAILY/ETOPS - TBA", LocalDate.now().PlusDays(-3), "G-TBA", new Integer[]{12,13,14,15}));
    notifications.put(12, new Notification(12, "NO. 5 WHEEL TYRE PRESSURE BLANK", LocalDate.now(), NotificationCode.D3));
    notifications.put(13, new Notification(13, "IFE SCREEN 14A IN FLIGHT BRACKET", LocalDate.now().plusDays(34), NotificationCode.D3));
    notifications.put(14, new Notification(14, "L FLIGHT CREW BUNK SEAT FOOTST", LocalDate.now().plusDays(30), NotificationCode.D3));
    notifications.put(15, new Notification(15, "WREQ - GOGO KRFU REPLACEMENT - TBA", LocalDate.now().plusDays(-1), NotificationCode.D7));
    
    // revisions.put(6, new Revision(6, "TX WEEKLY/D7/D3/DAILY/ETOPS - IIA", LocalDate.now().PlusDays(-4), "G-II", new Integer[]{16,17,18,19,20}));
    notifications.put(16, new Notification(16, "12A ELECTRICS DONT WORK", LocalDate.now().plusDays(14), NotificationCode.D3));
    notifications.put(17, new Notification(17, "TRANSFERRED FROM CABIN LOG HI", LocalDate.now().plusDays(-1), NotificationCode.D3));
    notifications.put(18, new Notification(18, "ERX-LIFE ITEM SMOKEHOOD CX NP", LocalDate.now().plusDays(5), NotificationCode.D7));
    notifications.put(19, new Notification(19, "CREW REPORT VIBRATING NOISE UNDER SEAT", LocalDate.now().plusDays(4), NotificationCode.D3));
    notifications.put(20, new Notification(20, "WEEKLY CHECK", LocalDate.now().plusDays(-4), NotificationCode.B7));
    
    // revisions.put(7, new Revision(7, "TX D3/DAILY/ETOPS - IIB", LocalDate.now().PlusDays(-1), "G-IIB", new Integer[]{21,22,23}));
    notifications.put(21, new Notification(21, "STATUS MESG'S FUEL JETT PUMP L", LocalDate.now(), NotificationCode.D3));
    notifications.put(22, new Notification(22, "STATUS MESG'S FUEL JETT PUMP R", LocalDate.now().plusDays(-1), NotificationCode.D3));
    notifications.put(23, new Notification(23, "FUEL SCAV SENSOR", LocalDate.now().plusDays(-1), NotificationCode.D3));
    
    // revisions.put(8, new Revision(8, "OVERHEAD LOCKER CATCH - IIB", LocalDate.now().plusDays(-2), "G-IIB", new Integer[]{24}));
    notifications.put(24, new Notification(24, "OVERHEAD LOCKER CATCH ROW 12 L", LocalDate.now().plusDays(-2), NotificationCode.D3));
    
    // revisions.put(9, new Revision(9, "TX WEEKLY/D3/DAILY/ETOPS - TBL", LocalDate.now().plusDays(-1), "G-TBL", new Integer[]{25}));
    notifications.put(25, new Notification(25, "WEEKLY CHECK", LocalDate.now().plusDays(2), NotificationCode.B7));
    
    return notifications;
  }

  public Notification notificationById(Integer id) {
    Map<Integer, Notification> map = allNotifications();
    return map.get(id);
  }

}