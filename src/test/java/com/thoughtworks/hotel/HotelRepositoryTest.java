package com.thoughtworks.hotel;

import com.thoughtworks.hotel.model.Hotel;
import com.thoughtworks.hotel.repository.HotelRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class HotelRepositoryTest {

    @Autowired
    private HotelRepository hotelRepository;
    @Test
    public void createShouldPersistData() {
        Hotel hotel = new Hotel("Hotel de Teste");
        this.hotelRepository.save(hotel);
        Assertions.assertThat(hotel.getId()).isNotNull();
        Assertions.assertThat(hotel.getTitle()).isEqualTo("Hotel de Teste");
    }

    @Test
    public void deleteShouldRemoveData() {
        Hotel hotel = new Hotel("Hotel de Teste");
        this.hotelRepository.save(hotel);
        hotelRepository.delete(hotel);
        Assertions.assertThat(hotelRepository.findById(hotel.getId())).isEmpty();
    }

    @Test
    public void updateShouldChangeAndPersistData() {
        Hotel hotel = new Hotel("Hotel de Teste");
        this.hotelRepository.save(hotel);
        hotel.setTitle("Hotel de Teste Editado");
        this.hotelRepository.save(hotel);
        Assertions.assertThat(hotel.getTitle()).isEqualTo("Hotel de Teste Editado");
    }
}
