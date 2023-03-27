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
  private LocalDate revisionDate;

  public Defect(
    Integer notificationId,
    String notificationDescription,
    String aircraftRegistration,
    NotificationCode notificationCode,
    LocalDate notificationDateRequired,
    Integer revisionId,
    String revisionDescription,
    LocalDate revisionDate
  ) {
    this.notificationId = notificationId;
    this.notificationDescription = notificationDescription;
    this.aircraftRegistration = aircraftRegistration;
    this.notificationCode = notificationCode;
    this.notificationDateRequired = notificationDateRequired;
    this.revisionId = revisionId;
    this.revisionDescription = revisionDescription;
    this.revisionDate = revisionDate;
  }

  public Integer getNotificationId() {
    return this.notificationId;
  }
  
  public String getNotificationDescription() {
    return this.notificationDescription;
  }
  
  public String getAircraftRegistration() {
    return this.aircraftRegistration;
  }
  
  public NotificationCode getNotificationCode() {
    return this.notificationCode;
  }
  
  public LocalDate getNotificationDateRequired() {
    return this.notificationDateRequired;
  }
  
  public Integer getRevisionId() {
    return this.revisionId;
  }
  
  public String getRevisionDescription() {
    return this.revisionDescription;
  }
  
  public LocalDate getRevisionDate() {
    return this.revisionDate;
  }
  
}