/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.hamp.eurekaapp.controller;

import java.util.List;
import pe.hamp.eurekaapp.domain.EmpleadoBean;
import pe.hamp.eurekaapp.service.EmpleadoService;
import pe.hamp.eurekaapp.util.EurekaUtil;

/**
 *
 * @author GUILLE
 */
public class EmpleadoController {
    private EmpleadoService empleadoservice;

    public EmpleadoController() {
        empleadoservice= new EmpleadoService();
                     
    }
    public List<EmpleadoBean> traerEmpleado(EmpleadoBean bean) {
        return empleadoservice.traerlista(bean);
    }
    public void procesar(String accion, EmpleadoBean bean) {
        switch(accion){
            case EurekaUtil.CRUD_NUEVO:
                empleadoservice.insertar(bean);
                break;
            case EurekaUtil.CRUD_EDITAR:
                empleadoservice.actualizar(bean);
                break;
            case EurekaUtil.CRUD_ELIMINAR:
                empleadoservice.eliminar(bean.getCodigo());
                break;    
        }
    }
    
    
}
