## Defect Workbench:

The defect workbench is used as part of daily planning meetings to determine what work needs to be performed on aircraft that day. Maintenance work is structured as follows:
  
  Revisions (header level work items to be done - e.g. change a wheel)
    Notifications (break down of individual items on a revision - e.g. jack up aircraft, undo bolts, etc)


## What you need to do:

An existing developer has moved team without completing their sprint tasks! They left a service 'DefectService' and a stub method called 'defectWorkbenchByDate'. We need this method to be completed, according to the following rules:

- We should select notifications with a date up to 7 days in the future (inclusive)

- Results should be ordered by:
1. Aircraft registration
2. Notification date


## The output:

Finally, we need to provide a basic output to the console of this data - you can use the .toString() method on the Defect class for this. For the purpose of this test utility you can assume today's date and do not need to use any user provided values (e.g. reading from the console)

Output should display defect info as follows:

  - Notification ID
  - Notification Description
  - Aircraft Registration
  - Notification Type
  - Notification Date
  - Revision ID
  - Revision Description


## After you're done

Like all good development teams, we'll be peer reviewing your work after you're done. We'll be asking a few questions around why you decided on your approach, how you might test it, what things you might change in the code you were left with, and so on
