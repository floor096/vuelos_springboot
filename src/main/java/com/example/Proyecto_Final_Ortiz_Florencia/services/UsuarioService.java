package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> findAll() throws Exception;
    public Page<Usuario> findAll(Pageable pageable) throws Exception;
    public Usuario findById(Integer id) throws Exception; // ID es Integer
    public Usuario save(Usuario entity) throws Exception;
    public Usuario update(Integer id, Usuario entity) throws Exception; // ID es Integer
    public boolean delete(Integer id) throws Exception; // ID es Integer

//    // Métodos específicos para Usuario (basados en UsuarioRepository)
//    public Usuario findByNumeroUsuario(int numeroUsuario) throws Exception;
//    public Usuario findByCorreoElectronicoUsuario(String correoElectronicoUsuario) throws Exception;
//    public List<Usuario> searchByGeneralFilter(String filtro) throws Exception;
//    public Page<Usuario> searchByGeneralFilter(String filtro, Pageable pageable) throws Exception;
}
