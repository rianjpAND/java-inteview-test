## Defect Workbench:

The defect workbench is used as part of daily planning meetings to determine what work needs to be done on aircraft that day

Hierearchy of work is:
- Revisions (group of work to be done)
-- Notifications (individual items on a revision)


## Some rules:

We have an existing service 'DefectService' but we need the logic to be completed per the following rules:

- We should select revisions where any notification date falls is 2 days prior to the given date or 3 days after. For example: if today is Tuesday, we would select notifications from Sunday (2 days prior) to Friday (3 days post)

- Results should be ordered by:
- Aircraft registration
- Notification date
- Notification type


## The output:

Finally, we need to provide a basic output to the console of this data. For the purpose of this test utility you can assume today's date and do not need to use any user input values (e.g. reading from the console)

Output should display defect info as follows:

  Notification ID
  Notification Description
  Aircraft registration
  Notification Type
  Notification Date
  Revision ID
  Revision Description
  Revision Date
