package pe.hamp.eurekaapp.service;

import java.util.List;
import pe.hamp.eurekaapp.dao.espec.EmpleadoDaoCrud;
import pe.hamp.eurekaapp.dao.impl.EmpleadoDaoImpl;
import pe.hamp.eurekaapp.domain.EmpleadoBean;

/**
 *
 * @author GUILLE
 */
public class EmpleadoService {
    private EmpleadoDaoCrud empleadoDao;

    public EmpleadoService() {
        empleadoDao = new EmpleadoDaoImpl();
    }
    public List<EmpleadoBean> traerlista(EmpleadoBean bean){
        return empleadoDao.taerLista(bean);
    }
    
    public void insertar(EmpleadoBean bean){
        empleadoDao.insertar(bean);
    }
     public void actualizar(EmpleadoBean bean){
        empleadoDao.actualizar(bean);
    }
     public void eliminar(String codigo){
        empleadoDao.eliminar(codigo);
    }
    
}
