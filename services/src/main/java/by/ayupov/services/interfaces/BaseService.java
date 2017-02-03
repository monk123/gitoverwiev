package by.ayupov.services.interfaces;

import by.ayupov.exception.DaoException;

import java.util.List;

public interface BaseService<T> {
    List<T> getAll() throws DaoException;
    T getEntityById(Long id) throws DaoException;
    void add(T entity) throws DaoException;
    void update(T entity) throws DaoException;
    void delete(Long id) throws DaoException;
}