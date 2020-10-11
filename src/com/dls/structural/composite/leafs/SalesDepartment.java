package com.dls.structural.composite.leafs;

import com.dls.structural.composite.component.Department;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(int i, String sales_department) {
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}