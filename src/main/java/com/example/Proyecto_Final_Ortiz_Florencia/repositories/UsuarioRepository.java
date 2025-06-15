package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
//    // Aquí puedes añadir métodos de consulta personalizados para Usuario, por ejemplo:
//    // Buscar un usuario por su número de usuario único
//    Usuario findByNumeroUsuario(int numeroUsuario);
//
//    // Buscar un usuario por su correo electrónico único
//    Usuario findByCorreoElectronicoUsuario(String correoElectronicoUsuario);
//
//    // Buscar usuarios por nombre o apellido (heredado de Persona)
//    List<Usuario> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
//    Page<Usuario> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
//
//    // Ejemplo de consulta JPQL para buscar usuarios por nombre, apellido o correo electrónico
//    @Query("SELECT u FROM Usuario u WHERE u.nombrePersona LIKE %:filtro% OR u.apellidoPersona LIKE %:filtro% OR u.correoElectronicoUsuario LIKE %:filtro%")
//    List<Usuario> searchByGeneralFilter(@Param("filtro") String filtro);
//
//    @Query("SELECT u FROM Usuario u WHERE u.nombrePersona LIKE %:filtro% OR u.apellidoPersona LIKE %:filtro% OR u.correoElectronicoUsuario LIKE %:filtro%")
//    Page<Usuario> searchByGeneralFilter(@Param("filtro") String filtro, Pageable pageable);
//
//    // Puedes añadir consultas nativas si lo prefieres, similares a las de PersonaRepository
}
