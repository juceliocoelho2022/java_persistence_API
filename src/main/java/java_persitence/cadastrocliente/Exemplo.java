package java_persitence.cadastrocliente;

import java_persitence.cadastrocliente.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory( "Clientes=PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
 //     Cliente cliente = entityManager.find(Cliente.class,  1);
 //       System.out.println(cliente.getNome());

 //       Cliente cliente = new Cliente();
 //       cliente.setNome("Eletronica Silva");

//       entityManager.getTransaction().begin();
//        entityManager.persist(cliente);
 //      entityManager.getTransaction().commit();

//        Cliente cliente = entityManager.find(Cliente.class,2);
//        entityManager.getTransaction().begin();
//        entityManager.remove(cliente);
//        entityManager.getTransaction().commit();

//        Cliente cliente = entityManager.find(Cliente.class,1);
//       Cliente cliente2 = entityManager.find(Cliente.class,1);


 //       Cliente cliente = entityManager.find(Cliente.class,1);
 //       entityManager.getTransaction().begin();
 //       cliente.setNome(cliente.getNome() + " Alterado");
 //       entityManager.getTransaction().commit();

        Cliente cliente = new Cliente();
//        cliente.setId(1);
        cliente.setNome("Construtora Medeiros");

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
