package com.demo.service;

import com.demo.beans.Person;

public interface PersonService {
 void addperson();
 Person[] displayall();
 
 Person displayByid(int pid);
}
