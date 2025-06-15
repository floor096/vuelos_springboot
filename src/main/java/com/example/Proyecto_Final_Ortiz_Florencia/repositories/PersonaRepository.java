package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
//    // Métodos derivados de nombre (query methods)
//    // Busca personas cuyo nombre o apellido contenga la cadena proporcionada.
//    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
//    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
//
//    // Consulta JPQL (@Query)
//    // Busca personas utilizando un filtro en nombre o apellido.
//    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
//    List<Persona> search(@Param("filtro") String filtro);
//
//    // Consulta JPQL con paginación
//    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
//    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);
//
//    // Consultas Nativas (@Query con nativeQuery = true)
//    // Busca personas utilizando una consulta SQL nativa.
//    @Query(
//            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
//            nativeQuery = true
//    )
//    List<Persona> searchNativo(@Param("filtro") String filtro);
//
//    // Consulta Nativa con paginación
//    @Query(
//            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
//            countQuery = "SELECT count(*) FROM persona", // Necesario para paginación con nativeQuery
//            nativeQuery = true
//    )
//    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
//
//    // Ejemplo de método personalizado para buscar por DNI, si lo necesitaras
//    // (aunque findById(int) ya haría esto)
//    // boolean existsByDniPersona(int dniPersona);
}
