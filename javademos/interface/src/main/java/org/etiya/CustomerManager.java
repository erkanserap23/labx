package org.etiya;

public class CustomerManager {
    //iş kodları yazılı

    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;

    }

    public void added( ICustomerDal iCustomerDal){
        iCustomerDal.add();
    }

}
