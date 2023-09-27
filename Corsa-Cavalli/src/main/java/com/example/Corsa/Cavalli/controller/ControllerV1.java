package com.example.Corsa.Cavalli.controller;

import com.example.Corsa.Cavalli.map.Mapper;
import com.example.Corsa.Cavalli.model.Cavallo;
import com.example.Corsa.Cavalli.model.Classifica;
import com.example.Corsa.Cavalli.model.dto.ResponseDto;
import com.example.Corsa.Cavalli.repository.ClassificaRepository;
import com.example.Corsa.Cavalli.service.impl.CavalloServiceImpl;
import com.example.Corsa.Cavalli.service.impl.ClassificaServiceImpl;
import com.example.Corsa.Cavalli.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ControllerV1 {
    @Autowired
    Mapper mapper;
    @Autowired
    Utils utils;

    @Autowired
    ClassificaServiceImpl classificaService;
    @Autowired
    CavalloServiceImpl cavalloService;


    @GetMapping("/")
    public List<ResponseDto> findAllCavalli() {

        return mapper.ListConverter(cavalloService.findAll());

    }

    @GetMapping("/classifica")
    public List<ResponseDto> classifica() {

        return mapper.ListConverterClassifica(classificaService.classificaByDesc());

    }

    @GetMapping("/gara")
    public Map<String, ResponseDto> inizioGara() {
        Map<String, ResponseDto> map = new HashMap<>();
        List<Cavallo> cavalloList = utils.InizioGara(cavalloService.findAll());
        classificaService.addPoints(new Classifica(cavalloList.get(0), 3), 3);
        classificaService.addPoints(new Classifica(cavalloList.get(1), 2), 2);
        classificaService.addPoints(new Classifica(cavalloList.get(2), 1), 1);
        for (int i = 0; i <= 2; i++) {

            map.put("La posizione numero " + i, new ResponseDto(cavalloList.get(i).getId(), cavalloList.get(i).getName(), cavalloList.get(i).getSesso()));
        }
        return map;

    }


}
