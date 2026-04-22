package com.orion.computationalplatform.core.abstraction;

import java.io.Serializable;

public interface Enumeration extends Serializable
{
    String get();


    boolean is(Enumeration other);


    boolean isNot(Enumeration other);
}