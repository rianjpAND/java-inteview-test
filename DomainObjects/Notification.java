package DomainObjects;

import java.time.LocalDate;

public class Notification {
  private Integer id;
  private String description;
  private LocalDate dateRequired;
  private NotificationCode code;
  
  public Notification(Integer id,
                      String description,
                      LocalDate dateRequired,
                      NotificationCode code) {
    this.id = id;
    this.description = description;
    this.dateRequired = dateRequired;
    this.code = code;
  }

  public Integer getId() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }
  
  public LocalDate getDateRequired() {
    return this.dateRequired;
  }

  public NotificationCode getCode() {
    return this.code;
  }
}