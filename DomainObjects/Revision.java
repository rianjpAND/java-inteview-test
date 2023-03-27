package DomainObjects;

import java.util.List;

public class Revision {
  private Integer id;
  private String description;
  private String aircraftRegistration;
  private List<Integer> notificationIds;

  public Revision(Integer id,
                  String description,
                  String aircraftRegistration,
                  List<Integer> notificationIds) {
    this.id = id;
    this.description = description;
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

  public List<Integer> getNotificationIds() {
    return this.notificationIds;
  }
}