package com.example.demo.ogrenci;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OgrenciController {

    OgrenciService ogrenciService = new OgrenciService();

    @RequestMapping(value = "/ogrenciler",method = RequestMethod.GET,headers = "Accept=application/json")
    public List<Ogrenci>getOgrenci(){
        List<Ogrenci> ogrenciListesi = ogrenciService.getAllOgrenciler();
        return ogrenciListesi;
    }

    @RequestMapping(value = "/oğrenci/{id}",method = RequestMethod.GET,headers = "Accept=application/json")
    public Ogrenci getOgrenciById(@PathVariable int id){
        return ogrenciService.getOgrenci(id);
    }

    @RequestMapping(value = "/ogrenciler", method = RequestMethod.POST, headers = "Accept=application/json")
    public Ogrenci ekleOgrenci(@RequestBody Ogrenci ogrenci) {
        return ogrenciService.ekleOgrenci(ogrenci);
    }

    @RequestMapping(value = "/ogrenciler", method = RequestMethod.PUT, headers = "Accept=application/json")
    public Ogrenci guncelleOgrenci(@RequestBody Ogrenci ogrenci){
        return ogrenciService.guncelleOgrenci(ogrenci);
    }

    @RequestMapping(value = "/ogrenci/{id}" ,method = RequestMethod.DELETE,headers = "Accept=application/json")
    public void silOgrenci(@PathVariable("id") int id){
        ogrenciService.silOgrenci(id);
    }

}
