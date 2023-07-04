package org.example.service;

import org.example.HibernateSessionFactoryUtil;
import org.example.model.City;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public City add(City city) {

        try (
                Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(city);
            transaction.commit();
        }
        return city;
    }

    @Override
    public City readCityById(int id) {
        return null;
    }

    @Override
    public City getById(int id) {
        try (
                Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.get(City.class, id);
        }
    }

    @Override
    public List<City> readAllCity() {
        return null;
    }

    @Override
    public List<City> getAllCity() {
        try (
                Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM City").list();
        }
    }

    @Override
    public void deleteCity(City city) {
        try (
                Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();

        }
    }

    @Override
    public City readById(int i) {
        return null;
    }


    @Override
    public City updateCity(City city) {
        City updated;


        try (
                Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            updated=(City )session.merge(city);
            transaction.commit();
        }

    return updated;
}





}
