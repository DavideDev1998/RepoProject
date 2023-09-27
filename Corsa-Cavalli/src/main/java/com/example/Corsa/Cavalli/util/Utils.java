package com.example.Corsa.Cavalli.util;
import com.example.Corsa.Cavalli.model.Cavallo;
import com.example.Corsa.Cavalli.model.Classifica;
import com.example.Corsa.Cavalli.repository.CavalloRepository;
import com.example.Corsa.Cavalli.repository.ClassificaRepository;
import com.example.Corsa.Cavalli.service.impl.CavalloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
public class Utils {
    @Autowired
    ClassificaRepository classificaRepository;

    public List<Cavallo> InizioGara(List<Cavallo> cavalloList) {
        List<Cavallo> randomList = new ArrayList<>(cavalloList);
        if (cavalloList.size() > 0) {
            Collections.shuffle(randomList);
            randomList.add(randomList.remove(0));
            randomList.add(randomList.remove(0));
            randomList.add(randomList.remove(0));

        }
        return randomList;
    }



}

