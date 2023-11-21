/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.minam.sistema.dao.impl;

import java.io.Serializable;
import org.springframework.stereotype.Repository;
import pe.gob.minam.common.dao.impl.DaoImpl;
import pe.gob.minam.sistema.dao.IDAOCriterios;
import pe.gob.minam.sistema.entidades.Criterios;

/**
 *
 * @author jmarinc
 */
@SuppressWarnings({ "unchecked", "serial","rawtypes","deprecation"})
@Repository("daoCriterios")
public class DAOCriterios extends DaoImpl<Criterios, Integer> implements IDAOCriterios,Serializable{
    
    
}
