package com.example.employeemanager.service;

import com.example.employeemanager.response.Response;
import com.sun.xml.bind.v2.model.core.ID;

public interface SuperService<T, S> {
    Response save(T t);

    Response update(T t);

    Response delete(ID id);

    Response search(String id);

    Response getAll();

    Response createAndSendResponse(int statusCode, String message, Object data);
}
