package Repository.Revisions;
  
import java.util.Map;
import DomainObjects.Revision;

public interface IRevisionRepository
{
  Map<Integer, Revision> allRevisions();
  Revision revisionById(Integer id);
}