// import javax.sql.DataSource;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.support.JdbcDaoSupport;
// import org.springframework.stereotype.Repository;

// @Repository
// public class PetHotelDao 
//     extends JdbcDaoSupport 
//     implements IPetHotelDao {

//     @Autowired
//     public PetHotelDao(
//         final JdbcTemplate jdbcTemplate
//     ) {
//         setJdbcTemplate(jdbcTemplate);
//     }

//     @Override
//     public void addPet(Pet pet){
//         String sql = "INSERT INTO pets (p_name, p_breed, p_color) VALUES (?, ?, ?)";
//         Object[] args = new Object[] {pet.getName(), pet.getBreed(), pet.getColor()};
//         getJdbcTemplate().update(sql, args);
//     }

// }
