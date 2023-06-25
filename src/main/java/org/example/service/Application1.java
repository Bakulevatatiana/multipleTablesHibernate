package org.example.service;

import org.example.model.City;

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
        cityDAO.add(new City("Omsk"));
        List<City> list=cityDAO.readAllCity();
        list.forEach(System.out::println);
        City city=new City("Rostov");
        cityDAO.add(city);
        cityDAO.deleteCity(cityDAO.readById(7));
        cityDAO.updateCity(new City("Rostov",6));
    }
}
