package com.project.Meme_Book.map;

import com.project.Meme_Book.model.User;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.model.dto.ResponseData;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ConvertMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public ResponseData convertToDTO(User user) {
        return modelMapper.map(user, ResponseData.class);
    }

    public User convertToEntity(RequestData dataDTO) {
        return modelMapper.map(dataDTO, User.class);
    }
}
