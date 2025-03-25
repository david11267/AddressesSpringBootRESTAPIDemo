package com.example.addressApi;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;
@CrossOrigin(origins = "http://localhost:5500") // Allow requests from Live Server
@RestController
@RequestMapping("/addresses")
public class AddressController {
    private ArrayList<Address> addresses = new ArrayList<>();
    private int size=0;
    // saving in memory for simplicity

    public AddressController(){
        addresses.add(new Address("Sweden","Stockholm","Skärholmen","Odd fellowvägen 12","https://cdn.lansfast-cdn.se/api/image/eyJpbWFnZVVybCI6Imh0dHBzOi8vc3RsYW5zZmFzdG1laWxpc2RldjAwMS5ibG9iLmNvcmUud2luZG93cy5uZXQvZm9yc2FsZWltYWdlcy9DTUJPTEdINUlHQlBFVjBGQ0U4VUQwTi9jYmlsZDVpbGJwc2kxdXYxODBlcjkuanBnIiwiZWRpdHMiOnsicmVzaXplIjp7ImZpdCI6ImNvdmVyIiwiaGVpZ2h0Ijo0MDAsIndpZHRoIjo3MDB9LCJqcGVnIjp7Im1vempwZWciOnRydWUsInF1YWxpdHkiOjgwfX19?signature=5e86daeeac3752e13a6656cced10c30afecfc8e10dea33f3780be22fc29e593e"));
        System.out.println("testID:"+addresses.getFirst().getId());
    }

    @GetMapping("/{id}")
    public Address Read(@PathVariable UUID id){
        Address ret =addresses.stream().filter(address -> address.getId().equals(id)).findFirst().orElse(null);
        return ret;
    }
    @GetMapping
    public ArrayList<Address> Read(){
        return addresses;
    }


}
