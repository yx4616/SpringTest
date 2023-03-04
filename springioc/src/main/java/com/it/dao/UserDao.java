package com.it.dao;

public interface UserDao {
    public boolean login(String name,String password);
    public void addUser();
    public void deleteUser();


}
