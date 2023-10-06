package com.project.Meme_Book.map;

import com.project.Meme_Book.model.User;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.model.dto.ResponseData;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapper {

    private final ModelMapper modelMapper;

    public ConvertMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public ResponseData convertToDTO(User user) {
        return modelMapper.map(user, ResponseData.class);
    }

    public User convertToEntity(RequestData dataDTO) {
        return modelMapper.map(dataDTO, User.class);
    }
}
