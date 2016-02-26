package pe.hamp.eurekaapp.controller;

import pe.hamp.eurekaapp.domain.EmpleadoBean;
import pe.hamp.eurekaapp.service.LogonService;
import pe.hamp.eurekaapp.util.Memoria;

/**
 *
 * @author Upao
 */
public class LogonController {
    
    public void validar(String usuario, String clave){
        LogonService logonService=new LogonService();
        EmpleadoBean beanq=logonService.validar(usuario, clave);
        Memoria.put("usuario",beanq); //App Web ==> SESIONES       
    }
}
