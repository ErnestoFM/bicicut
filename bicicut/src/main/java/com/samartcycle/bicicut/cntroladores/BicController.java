package com.samartcycle.bicicut.cntroladores;

import com.samartcycle.bicicut.Modelo.bici.Bici;
import com.samartcycle.bicicut.Modelo.bici.BicoService;
import com.samartcycle.bicicut.Modelo.bici.DatosBici;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/bicis")

public class BicController {
    private final BicoService bicoService;

    @Autowired
    public BicController(BicoService bicoService){
        this.bicoService = bicoService;
    }

    @GetMapping
    public List<Bici> getBici(){
        return this.bicoService.getBici();
    }

    @PostMapping
    public void registrarBici(@RequestBody DatosBici datosBici, Model model){
        Bici bici = new Bici(datosBici);
        this.bicoService.newBici(bici);
    }
}

