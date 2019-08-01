// import java.util.NoSuchElementException;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class PetHotelService {

//     @Autowired
//     private PetHotelDao petHotelDao;


//     public void addPet(Pet pet) {
//         if (pet == null) {
//             throw new IllegalArgumentException("The passed object cna not be null.");
//         }
//         petHotelDao.addPet(pet);
//     }



//     private Pet requirePetFound(final int id)
//             throws NoSuchElementException {
//         final Pet pet = petHotelDao.read(id);
//         if ( pet == null ) {
//             throw new NoSuchElementException(Pet.class.getName());
//         }
//         return pet;
//     }

// }