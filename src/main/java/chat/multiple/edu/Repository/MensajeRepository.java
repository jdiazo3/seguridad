package chat.multiple.edu.Repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import chat.multiple.edu.Entity.Mensaje;

/**
 *
 * @author juand
 */

 //interface en la que se representan las sentencias a la base de datos para la tabla Persona por medio de JpaRepository 

public interface MensajeRepository extends JpaRepository<Mensaje ,Long>{

    @Transactional(readOnly = true)
    @Query(
        value = "select * from mensaje order by id asc",
        nativeQuery = true
        )
        List<Mensaje>findByMensajeOrderBy();

    @Transactional(readOnly = true)
    @Query(
        value = "SELECT * FROM mensaje WHERE fecha >= NOW() - INTERVAL 5 SECOND AND leido = FALSE",
        nativeQuery = true
        )
        List<Mensaje>sensorOn();
}