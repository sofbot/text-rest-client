package nl.edia.text.repository;

import nl.edia.text.Text;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TextRepository extends CrudRepository<Text, String> {

    List<Text> findByContentContainingOrTitleContaining(String contentSearchQuery, String titleSearchQuery);
}
