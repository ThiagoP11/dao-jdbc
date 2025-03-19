package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentTeste {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        Department department = new Department(null, "Video Game");
        departmentDao.insert(department);
        System.out.println("\nDepartamento criada id: " + department.getId());


        Department dp = new Department(7, "TESTE");
        departmentDao.update(dp);
        System.out.println("\nDepartamento atualizado: " + dp.getName());

        /*departmentDao.deleteById(8);
        System.out.println("\nDeletado o id: " + 8);*/

        System.out.println("--------------------------------------------------");

        Department dp2 = departmentDao.findById(2);
        System.out.println(dp2);


        System.out.println("--------------------------------------------------");


        System.out.println(departmentDao.findAll());




    }
}
