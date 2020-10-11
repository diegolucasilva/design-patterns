package com.dls.structural.composite;
/*
The composite pattern is meant to allow treating individual objects and compositions of objects, or “composites” in the same way.

It can be viewed as a tree structure made up of types that inherit a base type,
and it can represent a single part or a whole hierarchy of objects.

We can break the pattern down into:
base component – is the base interface for all the objects in the composition. EX: Departament
It should be either an interface or an abstract class with the common methods to manage the child composites.

leaf – implements the default behavior of the base component. It doesn't contain a reference to the other objects.

composite – has leaf elements. It implements the base component methods and defines the child-related operations.

client – has access to the composition elements by using the base component object.

******
Composite and Decorator have similar structure diagrams since both rely on recursive composition
to organize an open-ended number of objects.
A Decorator is like a Composite but only has one child component.
There’s another significant difference: Decorator adds additional responsibilities to the wrapped object,
while Composite just “sums up” its children’s results.
******

EX:
Block 1 ShareHolders
    Block 2 Head department
        SalesDepartment
        FinancialDepartment
            Block 3 Financial Manager ......
 */

import com.dls.structural.composite.component.Department;
import com.dls.structural.composite.composite.HeadDepartment;
import com.dls.structural.composite.leafs.FinancialDepartment;
import com.dls.structural.composite.leafs.SalesDepartment;

public class Main {

    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment shareHolders = new HeadDepartment(1, "ShareHolders");
        HeadDepartment headDepartment= new HeadDepartment(2, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        shareHolders.addDepartment(headDepartment);
        shareHolders.printDepartmentName();
    }
}