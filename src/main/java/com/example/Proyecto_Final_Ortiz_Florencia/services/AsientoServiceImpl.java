package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Asiento;
import com.example.Proyecto_Final_Ortiz_Florencia.entities.Vuelo;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.AsientoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsientoServiceImpl implements AsientoService {

    @Autowired
    private VueloService vueloService;

    @Autowired
    private AsientoRepository asientoRepository;

    @Override
    @Transactional
    public List<Asiento> findAll() throws Exception {
        try {
            return asientoRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<Asiento> findAll(Pageable pageable) throws Exception {
        try {
            return asientoRepository.findAll(pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Asiento findById(Integer id) throws Exception {
        try {
            Optional<Asiento> entityOptional = asientoRepository.findById(id);
            return entityOptional.orElse(null);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Asiento save(Asiento entity) throws Exception {
        try {
            return asientoRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Asiento update(Integer id, Asiento entity) throws Exception {
        try {
            Optional<Asiento> entityOptional = asientoRepository.findById(id);
            if (entityOptional.isEmpty()) {
                throw new Exception("Asiento no encontrado con ID: " + id);
            }
            entity.setId(id);
            return asientoRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id) throws Exception {
        try {
            if (asientoRepository.existsById(id)) {
                asientoRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("Asiento no encontrado con ID: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<Asiento> findAllByVuelo(Long vueloId) throws Exception {
//        Vuelo vuelo = vueloService.findById(vueloId); // OK ahora
//        Long avionId = vuelo.getAvion().getId();
//        return asientoRepository.findByAvionId(avionId);

        try {
            Vuelo vuelo = vueloService.findById(vueloId);
            Long avionId = vuelo.getAvion().getId();
            return asientoRepository.findByAvionId(avionId);
        } catch (Exception e) {
            throw new Exception("Error al obtener asientos por vuelo: " + e.getMessage());
        }
    }
}
