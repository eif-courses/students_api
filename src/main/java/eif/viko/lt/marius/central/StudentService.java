package eif.viko.lt.marius.central;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class StudentService {

  @Inject
  StudentRepository repository;

  public void createStudent(Student student){
    repository.persist(student);
  }

  public List<Student> getAllStudents(){
    return repository.listAll();
  }


}
