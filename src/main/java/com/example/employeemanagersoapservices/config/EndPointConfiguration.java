package com.example.employeemanagersoapservices.config;

import com.goodboyz.employeemanager.GetEmployeeRequest;
import com.goodboyz.employeemanager.GetEmployeeResponse;
import com.goodboyz.employeemanager.ObjectFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;


@Endpoint
public class EndPointConfiguration {

    @PayloadRoot(namespace = "http://com.goodboyz/employeemanager", localPart = "GetEmployeeRequest")
    @ResponsePayload
    public JAXBElement<GetEmployeeResponse> getEmployee(@RequestPayload GetEmployeeRequest request){

        GetEmployeeResponse response = new GetEmployeeResponse();
        response.setEmployeeId(request.getEmployeeId());
        response.setEmployeeName("hoody");
        response.setLocation("Nigeria");
        response.setZipcode(1000001);
        return new ObjectFactory().createGetEmployeeResponse(response);
    }
}
