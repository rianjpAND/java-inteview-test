package Services.Revisions;

import java.util.Map;
import DomainObjects.Revision;
import Repository.Revisions.IRevisionRepository;

public class RevisionService
  implements IRevisionService {
  private final IRevisionRepository repository;

  public RevisionService(IRevisionRepository repository) {
    this.repository = repository;
  }

  public Map<Integer, Revision> allRevisions() {
    return repository.allRevisions();
  }

  public Revision revisionById(Integer id) {
    return repository.revisionById(id);
  }
}