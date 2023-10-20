package com.project.Meme_Book.utils;

import com.project.Meme_Book.model.Commento;
import com.project.Meme_Book.model.Content;
import com.project.Meme_Book.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

@Component
@Configuration
public class MethodsUtils {

    public String generateUniqueString() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public void createCommentMap(Content content, String id, Commento commento){

        if(content.getCommento() != null){
            content.getCommento().put(id, commento);

        }else{
            HashMap<String,Commento> commentoMap = new HashMap<>();
            content.setCommento(commentoMap);
            content.getCommento().put(id, commento);
        }
    }

    public void createLikeMap(Content content, String idUser, String username){

        if(content.getLike() != null){

            content.getLike().put(idUser, username);

        }else{
            HashMap<String, String> likeMap = new HashMap<>();
            content.setLike(likeMap);
            content.getLike().put(idUser, username);
        }
    }

    public void createLikeCommentMap(Commento commento, String idUser, String username){

        if(commento.getLike() != null){
            commento.getLike().put(idUser, username);

        }else{
            HashMap<String, String> likeMap = new HashMap<>();
            commento.setLike(likeMap);
            commento.getLike().put(idUser, username);
        }
    }

}
