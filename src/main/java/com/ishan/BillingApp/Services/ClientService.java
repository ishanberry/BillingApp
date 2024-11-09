package com.ishan.BillingApp.Services;

import com.ishan.BillingApp.Models.Client;
import com.ishan.BillingApp.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService
{
    @Autowired
    private  ClientRepository clientRepository;

    public Client FindClientByEmail(String email){
       if (email.isBlank()){
        throw new IllegalArgumentException("Invaild Email By User");
       }
       else {
           return clientRepository.findByEmail(email);
       }
       }

    public void addClient(Client client){


        clientRepository.save(client);
    }



}
