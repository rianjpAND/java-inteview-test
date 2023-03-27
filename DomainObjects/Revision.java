package DomainObjects;

import java.time.LocalDate;

public class Revision {
  private Integer id;
  private String description;
  private LocalDate dateRaised;
  private String aircraftRegistration;
  private Integer[] notificationIds;

  public Revision(Integer id,
                  String description,
                  LocalDate dateRaised,
                  String aircraftRegistration,
                  Integer[] notificationIds) {
    this.id = id;
    this.description = description;
    this.dateRaised = dateRaised;
    this.aircraftRegistration = aircraftRegistration;
    this.notificationIds = notificationIds;
  }

  public Integer getId() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }

  public String getAircraftRegistration() {
    return this.aircraftRegistration;
  }

  public LocalDate getDateRaised() {
    return this.dateRaised;
  }

  public Integer[] getNotificationIds() {
    return this.notificationIds;
  }
}