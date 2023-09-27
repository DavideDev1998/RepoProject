package com.example.Corsa.Cavalli.service.impl;

import com.example.Corsa.Cavalli.model.Classifica;
import com.example.Corsa.Cavalli.repository.CavalloRepository;
import com.example.Corsa.Cavalli.repository.ClassificaRepository;
import com.example.Corsa.Cavalli.service.GenericService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ClassificaServiceImpl implements GenericService {

    private final EntityManager entityManager;
    @Autowired
    ClassificaRepository repository;

    @Override
    public <T> void save(T p) {
        repository.save((Classifica) p);
    }

    @Override
    public <T> List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public <T> Object findById(Integer id) {
        return null;
    }

    public List<Classifica> classificaByDesc() {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Classifica> criteriaQuery = criteriaBuilder.createQuery(Classifica.class);

        Root<Classifica> root = criteriaQuery.from(Classifica.class);

        criteriaQuery.select(root);

        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("punteggio")));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
    public Classifica addPoints(Classifica cl, Integer add) {
        for (Classifica classifica :repository.findAll()) {
            if (Objects.equals(classifica.getCavallo().getId(), cl.getCavallo().getId())) {
                classifica.setPunteggio(classifica.getPunteggio() + add);
                return repository.save(classifica);
            }
        }

        cl.setPunteggio(cl.getPunteggio() + add);
        return repository.save(cl);
    }

}
