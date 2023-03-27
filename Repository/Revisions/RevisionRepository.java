/*
*    THIS IS A TEST DATA CLASS - YOU DO NOT NEED TO CHANGE ANYTHING
*/
package Repository.Revisions;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import DomainObjects.Revision;

public class RevisionRepository
    implements IRevisionRepository {
      
  public Map<Integer, Revision> allRevisions() {
    Map<Integer, Revision> revisions = new HashMap<Integer, Revision>();
    revisions.put(1, new Revision(1, "D3 NI/DAILY/ETOPS - MMK", "G-MMK", List.of(1,2)));
    revisions.put(2, new Revision(2, "D7/D3/DAILY/ETOPS - TBB", "G-TBB", List.of(3,4,5)));
    revisions.put(3, new Revision(3, "D3/D7/DAILY/ETOPS - IIG", "G-IIG", List.of(6,7)));
    revisions.put(4, new Revision(4, "D3/DAILY/ETOPS - IIW", "G-IIW", List.of(8,9,10,11)));
    revisions.put(5, new Revision(5, "D3/D7 GOGO/DAILY/ETOPS - TBA", "G-TBA", List.of(12,13,14,15)));
    revisions.put(6, new Revision(6, "TX WEEKLY/D7/D3/DAILY/ETOPS - IIA", "G-II", List.of(16,17,18,19,20)));    
    
    revisions.put(7, new Revision(7, "TX D3/DAILY/ETOPS - IIB", "G-IIB", List.of(21,22,23)));
    revisions.put(8, new Revision(8, "OVERHEAD LOCKER CATCH - IIB", "G-IIB", List.of(24)));
    revisions.put(9, new Revision(9, "TX WEEKLY/D3/DAILY/ETOPS - TBL", "G-TBL", List.of(25)));
    return revisions;
  }

  public Revision revisionById(Integer id) {
    Map<Integer, Revision> map = allRevisions();
    return map.get(id);
  }
      
}