package Services.Defects;

import java.util.List;
import java.time.LocalDate;
import DomainObjects.Defect;

public interface IDefectService
{
  List<Defect> defectWorkbenchByDate(LocalDate currentDate);
}