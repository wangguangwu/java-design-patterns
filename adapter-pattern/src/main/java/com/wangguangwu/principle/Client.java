package com.wangguangwu.principle;

import com.wangguangwu.principle.service.Adapter;
import com.wangguangwu.principle.service.ClientInterface;
import com.wangguangwu.principle.service.Service;

/**
 * @author wangguangwu
 */
public class Client {

    private final ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void performTask(String data) {
        clientInterface.method(data);
    }

    public static void main(String[] args) {
        Service service = new Service();
        Adapter adapter = new Adapter(service);
        Client client = new Client(adapter);

        client.performTask("Some data");
    }
}
