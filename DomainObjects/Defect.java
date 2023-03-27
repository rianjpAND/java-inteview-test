package DomainObjects;

import java.time.LocalDate;

public class Defect
{
  private Integer notificationId;
  private String notificationDescription;
  private String aircraftRegistration;
  private NotificationCode notificationCode;
  private LocalDate notificationDateRequired;
  private Integer revisionId;
  private String revisionDescription;

  public Defect() {}
  
  public Defect(
    Integer notificationId,
    String notificationDescription,
    String aircraftRegistration,
    NotificationCode notificationCode,
    LocalDate notificationDateRequired,
    Integer revisionId,
    String revisionDescription
  ) {
    this.notificationId = notificationId;
    this.notificationDescription = notificationDescription;
    this.aircraftRegistration = aircraftRegistration;
    this.notificationCode = notificationCode;
    this.notificationDateRequired = notificationDateRequired;
    this.revisionId = revisionId;
    this.revisionDescription = revisionDescription;
  }

  public Integer getNotificationId() {
    return this.notificationId;
  }

  public void setNotificationId(Integer val) {
    this.notificationId = val;
  }
  
  public String getNotificationDescription() {
    return this.notificationDescription;
  }

  public void setNotificationDescription(String val) {
    this.notificationDescription = val;
  }
  
  public String getAircraftRegistration() {
    return this.aircraftRegistration;
  }

  public void setAircraftRegistration(String val) {
    this.aircraftRegistration = val;
  }
  
  public NotificationCode getNotificationCode() {
    return this.notificationCode;
  }

  public void setNotificationCode(NotificationCode val) {
    this.notificationCode = val;
  }
  
  public LocalDate getNotificationDateRequired() {
    return this.notificationDateRequired;
  }

  public void setNotificationDateRequired(LocalDate val) {
    this.notificationDateRequired = val;
  }
  
  public Integer getRevisionId() {
    return this.revisionId;
  }

  public void setRevisionId(Integer val) {
    this.revisionId = val;
  }
  
  public String getRevisionDescription() {
    return this.revisionDescription;
  }

  public void setRevisionDescription(String val) {
    this.revisionDescription = val;
  }

  @Override
  public String toString() {
    return String.format("%3s %-40s %-5s %4s %s %3s %-40s",
                         this.notificationId,
                         this.notificationDescription,
                         this.aircraftRegistration,
                         this.notificationCode,
                         this.notificationDateRequired,
                         this.revisionId,
                         this.revisionDescription);
  }
  
}