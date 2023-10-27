package chat.multiple.edu.Controller;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chat.multiple.edu.Entity.Mensaje;
import chat.multiple.edu.Service.MensajeServiceImpl;
import chat.multiple.edu.Service.UsuarioService;

/**
 *
 * @author juand
 */
 /**
 */
@CrossOrigin(origins ="http://localhost:4200/",maxAge = 3600)
@RestController
@RequestMapping("/sensores")
public class MensajeController {
    
    @Autowired
    private MensajeServiceImpl mensajeService;
    @Autowired
    private UsuarioService usuarioService;
    
    /** 
     * @return ResponseEntity<?>
     */
    @GetMapping(value = "/1")
    public ResponseEntity<?> insertarSenal1() {
        Mensaje mensaje1 = new Mensaje();
        mensaje1.setMensaje(1L);
        mensaje1.setSensor(1);
        mensaje1.setFecha(LocalDateTime.now());
        mensaje1.setLeido(false);
        Mensaje oMensaje = mensajeService.save(mensaje1);
        return ResponseEntity.ok(oMensaje);
    }
     @GetMapping(value = "/2")
    public ResponseEntity<?> insertarSenal2() {
        Mensaje mensaje1 = new Mensaje();
        mensaje1.setMensaje(1L);
        mensaje1.setSensor(2);
        mensaje1.setFecha(LocalDateTime.now());
        mensaje1.setLeido(false);
        Mensaje oMensaje = mensajeService.save(mensaje1);
        return ResponseEntity.ok(oMensaje);
    }
     @GetMapping(value = "/3")
    public ResponseEntity<?> insertarSenal() {
        Mensaje mensaje1 = new Mensaje();
        mensaje1.setMensaje(1L);
        mensaje1.setSensor(3);
        mensaje1.setFecha(LocalDateTime.now());
        mensaje1.setLeido(false);
        Mensaje oMensaje = mensajeService.save(mensaje1);
        return ResponseEntity.ok(oMensaje);
    }
    @GetMapping(value = "/historial")
    public ResponseEntity<?> historialMovimientos() {
        List<Mensaje> oMensaje = mensajeService.findByMensajeOrderBy();
        return ResponseEntity.ok(oMensaje);
    }
    @GetMapping(value = "/sensorOn")
    public ResponseEntity<?> sensorOn() {
        List<Mensaje> oMensaje = mensajeService.sensorOn();
        for(Mensaje m : oMensaje){
            m.setLeido(true);
            mensajeService.save(m);
        }
        return ResponseEntity.ok(oMensaje);
    }


}
