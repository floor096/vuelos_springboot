package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Usuario;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional
    public List<Usuario> findAll() throws Exception {
        try {
            return usuarioRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<Usuario> findAll(Pageable pageable) throws Exception {
        try {
            return usuarioRepository.findAll(pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Usuario findById(Integer id) throws Exception {
        try {
            Optional<Usuario> entityOptional = usuarioRepository.findById(id);
            return entityOptional.orElse(null);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Usuario save(Usuario entity) throws Exception {
        try {
            return usuarioRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Usuario update(Integer id, Usuario entity) throws Exception {
        try {
            Optional<Usuario> entityOptional = usuarioRepository.findById(id);
            if (entityOptional.isEmpty()) {
                throw new Exception("Usuario no encontrado con ID: " + id);
            }
            return usuarioRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id) throws Exception {
        try {
            if (usuarioRepository.existsById(id)) {
                usuarioRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("Usuario no encontrado con ID: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    // Implementación de métodos específicos para Usuario
//    @Override
//    @Transactional
//    public Usuario findByNumeroUsuario(int numeroUsuario) throws Exception {
//        try {
//            return usuarioRepository.findByNumeroUsuario(numeroUsuario);
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Usuario findByCorreoElectronicoUsuario(String correoElectronicoUsuario) throws Exception {
//        try {
//            return usuarioRepository.findByCorreoElectronicoUsuario(correoElectronicoUsuario);
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public List<Usuario> searchByGeneralFilter(String filtro) throws Exception {
//        try {
//            return usuarioRepository.searchByGeneralFilter(filtro);
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Page<Usuario> searchByGeneralFilter(String filtro, Pageable pageable) throws Exception {
//        try {
//            return usuarioRepository.searchByGeneralFilter(filtro, pageable);
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
}