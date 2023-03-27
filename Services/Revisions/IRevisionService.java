package Services.Revisions;
  
import java.util.Map;
import DomainObjects.Revision;

public interface IRevisionService
{
  Map<Integer, Revision> allRevisions();
  Revision revisionById(Integer id);
}