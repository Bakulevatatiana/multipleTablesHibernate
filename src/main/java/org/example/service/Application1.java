package org.example.service;

import org.example.model.City;
import org.example.service.CityDao;
import org.example.service.CityDaoImpl;
import org.example.service.EmployeeDao;
import org.example.service.EmployeeDaoImpl;

import java.util.List;

public class Application1 {
    public static void main(String[] args){
        EmployeeDao employeeDAO= new EmployeeDaoImpl();
        CityDao cityDAO= new CityDaoImpl();
        //Employee employee= new EmployeeDaoImpl(7, "Anna","Log","f",37,3);
        //employeeDao.getAllEmployee().forEach(System.out::println);
        //Integer employeeId=employeeDao.add(employee);
       // System.out.println(employeeDao.getAllEmployee());
        //System.out.println();
        //employeeDao.updateEmployee(employee,employeeId);
        //employeeDao.deleteEmployee(employeeDao.getById(employeeId));
        //System.out.println(employeeDao.getById(4));//
        CityDao.add(new City("Omsk"));
        List<City> list=CityDao.readAllCity();
        list.forEach(System.out::println);
        City city=new City("Rostov");
        CityDao.add(city);
        CityDao.deleteCity(CityDao.readById(7));
        CityDao.updateCity(new City(6,"Rostov"));
    }
}
