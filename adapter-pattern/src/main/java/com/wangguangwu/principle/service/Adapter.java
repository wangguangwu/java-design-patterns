package com.wangguangwu.principle.service;

/**
 * @author wangguangwu
 */
public class Adapter implements ClientInterface {

    private final Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void method(String data) {
        // Convert the data to a format that the Service can understand
        String specialData = convertToServiceFormat(data);
        // Delegate the call to the service's method
        service.serviceMethod(specialData);
    }

    private String convertToServiceFormat(String data) {
        // Example of a conversion process
        return "Converted(" + data + ")";
    }
}
