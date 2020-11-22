/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mycompany.jpa.Department;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author miltonlq
 */
public class main {

    private static EntityManager manager;
    private static EntityManagerFactory emf;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("percistensia");
        manager = emf.createEntityManager();
        findAllEntidades();
    }

    //imprime todas las entidades(No funciona)
    public static void findAllEntidades() {
        List<Department> departamento = manager.createNativeQuery("SELECT id, namee FROM Department").getResultList();
        System.out.println("Tiene: "+departamento.size()+" registros");//imprime el numero de registros(tamaño de la lista)

        for (Department depar : departamento) {//no funciona 
            System.out.println(depar);
        }
    }

    public static void findEntidades() {
        Query q = manager.createNativeQuery("SELECT id, namee FROM Department", Department.class);
        List<Department[]> departamento = q.getResultList();
        System.out.println("Tiene: "+departamento.size()+" registros");//imprime el numero de registros(tamaño de la lista)

        for (Department depar[] : departamento) {//no funciona 
            System.out.println(depar);
        }
    }
}
