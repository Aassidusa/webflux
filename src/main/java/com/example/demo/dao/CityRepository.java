package com.example.demo.dao;

import com.example.demo.domain.City;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

/**
 * @ClassName CityRepository
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/29 16:01
 * Version 1.0
 **/
@Repository
public class CityRepository {
    private ConcurrentMap<Long, City> repository = new ConcurrentHashMap<>();

    private static final LongAdder idGenerator = new LongAdder();

    public Long save(City city){
        idGenerator.increment();
        Long id = idGenerator.longValue();
        city.setId(id);
        repository.put(id, city);
        return id;
    }

    public Collection<City> findAll() {
        return repository.values();
    }


    public City findCityById(Long id) {
        return repository.get(id);
    }

    public Long updateCity(City city) {
        repository.put(city.getId(), city);
        return city.getId();
    }

    public Long deleteCity(Long id) {
        repository.remove(id);
        return id;
    }
}
