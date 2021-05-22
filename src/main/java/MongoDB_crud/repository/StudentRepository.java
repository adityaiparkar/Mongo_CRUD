package MongoDB_crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import MongoDB_crud.model.Student;


@Repository
public interface StudentRepository extends MongoRepository<Student, Long> 
{

}
