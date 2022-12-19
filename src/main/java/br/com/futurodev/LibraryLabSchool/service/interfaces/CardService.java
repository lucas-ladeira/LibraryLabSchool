package br.com.futurodev.LibraryLabSchool.service.interfaces;

import br.com.futurodev.LibraryLabSchool.model.Card;

import java.util.List;

public interface CardService {
    Card save(Card _card);
    Card search(Long _id);
    List<Card> cardsList();
    Card refresh(Card _card);
    void delete(Long _id);
}
