package com.project.Meme_Book.utils;

import com.project.Meme_Book.model.Commento;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configuration
public class MethodsUtils {

    public Commento commentoDaModificare(List<Commento> commenti, String didascaliaCommento){

        Commento commentoRecuperato = new Commento();

        for(Commento commento : commenti){

            if(commento.getCommento().equals(didascaliaCommento)){

                commentoRecuperato = commento;

            }
        }

        commenti.remove(commentoRecuperato);

        return commentoRecuperato;
    }
}
