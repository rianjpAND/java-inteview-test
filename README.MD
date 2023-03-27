## Defect Workbench:

The defect workbench is used as part of daily planning meetings to determine what work needs to be performed on aircraft that day

Hierearchy of work is:

- Revisions (group of work to be done)
  - Notifications (individual items on a revision)


## Some rules:

We have an existing service 'DefectService' and need the logic to be completed in the 'defectWorkbenchByDate' method, according to the following rules:

- We should select notifications with a date up to 7 days in the future, inclusive

- Results should be ordered by:
1. Aircraft registration
2. Notification date


## The output:

Finally, we need to provide a basic output to the console of this data - you can use the .toString() method on the Defect class for this. For the purpose of this test utility you can assume today's date and do not need to use any user input values (e.g. reading from the console)

Output should display defect info as follows:

  - Notification ID
  - Notification Description
  - Aircraft Registration
  - Notification Type
  - Notification Date
  - Revision ID
  - Revision Description


## After you're done

Like all good development teams, we'll be peer reviewing your work after you're done. We'll be asking a few questions around why you decided on your approach, how you might test it, and so on