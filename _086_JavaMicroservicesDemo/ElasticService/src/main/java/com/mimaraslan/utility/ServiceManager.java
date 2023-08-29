package com.mimaraslan.utility;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.Optional;

public class ServiceManager<T,ID> implements IService<T,ID>{

    private final ElasticsearchRepository<T,ID> repository;
    public ServiceManager(ElasticsearchRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T t) {
        return repository.save(t);
    }
    @Override
    public Iterable<T> saveAll(Iterable<T> t) {
        return repository.saveAll(t);
    }

    @Override
    public T update(T t) {
        return repository.save(t);
    }

    @Override
    public void delete(T t) {
        repository.delete(t);
    }
    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }
    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }

}
