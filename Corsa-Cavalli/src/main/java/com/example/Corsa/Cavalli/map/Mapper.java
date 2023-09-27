package com.example.Corsa.Cavalli.map;
import com.example.Corsa.Cavalli.model.Cavallo;
import com.example.Corsa.Cavalli.model.Classifica;
import com.example.Corsa.Cavalli.model.dto.ResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Configuration
@Component
public class Mapper {
    private static final ModelMapper mapper = new ModelMapper();

    public List<ResponseDto> ListConverter(List<Cavallo> cv) {
        List<ResponseDto> list = new ArrayList<>();
        for (Cavallo cavallo : cv) {
            ResponseDto dto = mapper.map(cavallo, ResponseDto.class);
            dto.setNomeCavallo(cavallo.getName());
            list.add(dto);
        }
        return list;
    }

    public List<ResponseDto> ListConverterClassifica(List<Classifica> cv) {
        if (cv.size() > 0) {
            List<ResponseDto> list = new ArrayList<>();
            for (Classifica cl : cv) {
                ResponseDto dto = mapper.map(cl, ResponseDto.class);
                dto.setNomeCavallo(cl.getCavallo().getName());
                list.add(dto);
            }
            return list;
        }
        return null;
    }
}