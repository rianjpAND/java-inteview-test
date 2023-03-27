package Repository.Revisions;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import DomainObjects.Revision;

public class RevisionRepository
    implements IRevisionRepository {
      
  public Map<Integer, Revision> allRevisions() {
    Map<Integer, Revision> revisions = new HashMap<Integer, Revision>();
    revisions.put(1, new Revision(1, "first", LocalDate.now(), "G-STBB", new Integer[]{1,2,3}));
    revisions.put(1, new Revision(2, "second", LocalDate.now(), "G-STBB", new Integer[]{1,2,3}));
    revisions.put(1, new Revision(3, "third", LocalDate.now(), "G-STBB", new Integer[]{1,2,3}));
    revisions.put(1, new Revision(4, "fourth", LocalDate.now(), "G-STBB", new Integer[]{1,2,3}));
    return revisions;
  }

  public Revision revisionById(Integer id) {
    Map<Integer, Revision> map = allRevisions();
    return map.get(id);
  }
      
}