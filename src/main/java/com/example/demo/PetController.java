package com.example.demo;

import java.util.List;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet")
public class PetController<NewPet, AddPet> {

    @Autowired
    JdbcTemplate jdbcTemplate;
    

    @GetMapping
    public List<Pet> list(){
		return jdbcTemplate.query( "SELECT * FROM pets", new PetRowMapper());
    }


    // @PostMapping("/api/pet")
    // public ResponseEntity <Pet> create(@RequestBody Pet pet ){
    //     // String sqlText = "INSERT INTO pets (p_name, p_breed, p_color) VALUES (?, ?, ?)";
    //     PreparedStatement st = conn.prepareStatement("INSERT INTO pets (p_name, p_breed, p_color) VALUES (?, ?, ?)");
    //     st.setName(1, pet.name);
    //     st.setBreed(2, pet.breed);
    //     st.setColor(3, pet.color);
    //     st.executeUpdate();
    //     st.close();
    //     return new ResponseEntity<Pet>(HttpStatus.OK);
    // }


    // @PostMapping
    // public ResponseEntity <Void> addPet(@RequestBody Pet pet){
    //     try {
    //         petHotelService.addPet(pet);
    //         return ResponseEntity.status(HttpStatus.OK).build();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    //     }
    // }

    @PostMapping
    public int create(@RequestBody Pet pet) {
        // String sql = "INSERT INTO pets (p_name, p_breed, p_color) VALUES (?, ?, ?)";
        // Object[] args = new Object[] {pet.getName(), pet.getBreed(), pet.getColor()};
        // return jdbcTemplate.update(String sql, Object[] args);
        System.out.println(pet);

        return jdbcTemplate.update("INSERT INTO pets (p_name, p_breed, p_color) VALUES (?, ?, ?)", new Object[] {pet.getName(), pet.getBreed(), pet.getColor()});
    }

}



    // @RequestMapping( value = "/api/plants/{id}", method = RequestMethod.GET )
    // public List<Plant> list(@PathVariable long id){
    //     return jdbcTemplate.query( "SELECT * FROM plant WHERE id=?", new Object[] {id}, new PlantRowMapper());
    // }