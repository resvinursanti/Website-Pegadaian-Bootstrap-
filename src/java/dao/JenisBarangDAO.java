/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.JenisBarang;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tools.HibernateUtil;

/**
 *
 * @author TAMU
 */
public class JenisBarangDAO {
    private  Session session;
    private Transaction transaction;
    private SessionFactory factory;
    public FunctionDAO fdao;
    
    public JenisBarangDAO() {
        this.fdao = new FunctionDAO(HibernateUtil.getSessionFactory());
        this.factory = HibernateUtil.getSessionFactory();
      }
    public boolean insert(Object object){
        return fdao.insert(object);
    }
    
    public boolean delete(Object object){
        return fdao.delete(Object.class,object.toString());
    }
    public List<Object> search(String category, String search) {
        return fdao.getAll("FROM JenisBarang WHERE " + category + " LIKE '%" + search + "%'");
    }

    public Object getById(String Id) {
        return fdao.getById("from JenisBarang where ID_JNS='" + Id + "'");
    }
    public boolean update(Object object) {
        return fdao.insert(object);
    }

    public List<Object> getAll() {
        return fdao.getAll("FROM JenisBarang");
    }
}
