package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControlerApi {

    @PostMapping(value = "/api/inscription")
    @ResponseBody
    public Registration getRegistration(@RequestBody Registration registration){
        return registration;
    }

    @GetMapping(value = "/api/travels")
    public List<Travels> travelsList(@RequestParam (value = "userName") String userName){
        Travels getTravels= new Travels("France", 3.4);
        Travels getTravelss= new Travels("Germany", 10.4);
        List<Travels> travels = new ArrayList<>();
        travels.add(getTravels);
        travels.add(getTravelss);
        return travels;
    }
}
