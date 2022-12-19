package br.com.futurodev.LibraryLabSchool.service.interfaces;

import br.com.futurodev.LibraryLabSchool.model.Client;

import java.util.List;

public interface ClientService {
    Client save(Client _client);
    Client search(Long _id);
    List<Client> clientsList();
    Client refresh(Client _client);
    void delete(Long _id);
}
