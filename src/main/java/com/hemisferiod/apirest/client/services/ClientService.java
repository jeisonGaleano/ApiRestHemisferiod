package com.hemisferiod.apirest.client.services;

import com.hemisferiod.apirest.client.dto.ClientDTO;
import com.hemisferiod.apirest.client.repository.ClientRepository;
import com.hemisferiod.apirest.shared.entity.Client;
import com.hemisferiod.apirest.shared.message.Message;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import com.hemisferiod.apirest.utils.Time;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ResponseModel create(ClientDTO clientDTO) {
        Client client = new Client();
        client = clientRepository.findByDocumentClient(clientDTO.getDocumentClient());
        if (client != null && client.getNameClient() != null){
            return new ResponseModel(Time.getTime(), "", 201, Message.Success.SUCCESS);
        }
        client.setNameClient(clientDTO.getNameClient());
        client.setDocumentClient(clientDTO.getDocumentClient());
        client.setAge(clientDTO.getAge());
        client.setCity(clientDTO.getCity());
        return new ResponseModel(Time.getTime(), clientRepository.save(client), 200, Message.Success.CLIENT_CREATED);
    }

    public ResponseModel update(ClientDTO clientDTO) {
        Client client = new Client();
        client = clientRepository.findByDocumentClient(clientDTO.getDocumentClient());
        if (client != null && client.getNameClient() != null){
            client.setNameClient(clientDTO.getNameClient());
            client.setDocumentClient(clientDTO.getDocumentClient());
            client.setAge(clientDTO.getAge());
            client.setCity(clientDTO.getCity());
            return new ResponseModel(Time.getTime(), clientRepository.save(client), 200, Message.Success.CLIENT_UPDATE);
        }
        return new ResponseModel(Time.getTime(), "", 201, Message.Error.NOT_FOUND);
    }
}
