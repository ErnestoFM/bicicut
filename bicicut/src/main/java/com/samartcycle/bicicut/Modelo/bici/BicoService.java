package com.samartcycle.bicicut.Modelo.bici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class BicoService {
    private final BicisRepository bicisRepository;

    @Autowired
    public BicoService(BicisRepository bicisRepository){
        this.bicisRepository = bicisRepository;
    }
    public List<Bici> getBici(){
        return this.bicisRepository.findAll();
    }

    public void newBici(@ModelAttribute Bici bici) {
        bicisRepository.save(bici);
    }

    //private String newID(){
      //  return java.util.UUID.randomUUID().toString();
    ///}
}
