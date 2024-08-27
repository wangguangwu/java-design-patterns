适配器是一种结构型设计模式，它**能使接口不兼容的对象能够相互合作**。

### 项目地址

[结构型模式-适配器](https://www.wangguangwu.com/archives/b1a7bf14-784c-486f-9604-17961486f90d)

# 1. 简介

适配器模式（Adapter Pattern）是一种结构型设计模式，它**允许将一个类的接口转换成客户端期望的另一个接口，使得原本不兼容的类能够一起工作**。适配器模式常**用于希望复用一些现有的类，但接口不兼容的情况**。

# 2. 核心思想

适配器模式的**核心思想是引入一个适配器类，通过包装或继承，将现有类的接口转换成客户端所需要的接口**。这样，客户端可以通过适配器类使用现有类的功能，而无需修改现有类的代码。

# 3. 主要组成部分

适配器模式通常由以下几个部分组成：

- **目标接口（Target Interface）**：客户端期望的接口，即客户端需要的标准接口。
- **适配器（Adapter）**：实现目标接口，同时持有被适配对象（Adaptee）的实例，将被适配对象的接口转换为目标接口。
- **被适配者（Adaptee）**：现有的接口，但不兼容目标接口。
- **客户端（Client）**：通过目标接口与适配器进行交互，实际上调用的是被适配者的接口。

# 4. 适应场景

适配器模式适用于以下场景：

- 当需要使用一个已经存在的类，但其接口与客户端的需求不兼容时。
- 希望创建一个可以复用的类库，该类库中的类可以和不相关的或不可预见的类一起工作。
- 需要在类之间进行一些转换，使得原本不兼容的接口可以共同工作。

# 5. 优缺点

## 5.1 优点

- **提高了类的复用性**：可以让原本不兼容的类一起工作，从而提升代码的复用性。
- **灵活性高**：适配器可以在不修改现有类的情况下引入新的功能，保持现有代码的稳定性。
- **遵循开闭原则**：通过添加新的适配器类，可以对现有代码进行扩展，而无需修改原有代码。

## 5.2 缺点

- **增加系统复杂性**：由于引入了适配器类，系统的整体复杂度可能会增加，导致代码难以理解和维护。
- **性能开销**：在某些情况下，适配器模式可能会引入额外的性能开销，因为调用需要经过适配器的转换。

# **6. 代码示例**

**类图：**

![uml.jpg](https://www.wangguangwu.com/upload/Pasted%20image%2020240827103045.png)

在这一节中，我们将详细介绍适配器模式的各个组成部分，分别展示每个类的代码，并说明其作用。

## **6.1 Client 类**

`Client` 类是客户端，它希望通过 `ClientInterface` 接口来调用某些方法。在适配器模式中，客户端不直接与实际的服务类 `Service` 交互，而是通过适配器 `Adapter` 进行间接调用。

```java
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
```

**作用**：`Client` 类通过 `ClientInterface` 与外界交互。`performTask` 方法用于执行某项任务，而具体的任务实现由 `ClientInterface` 的实现类（在这里是 `Adapter`）来完成。

## **6.2 ClientInterface 接口**

`ClientInterface` 是客户端期望的接口，它定义了客户端需要的方法。这是适配器模式中的目标接口，适配器会实现这个接口。

```java
public interface ClientInterface {

    void method(String data);

}
```

**作用**：`ClientInterface` 定义了客户端使用的标准接口。`Adapter` 类将会实现这个接口，并将其转换为 `Service` 类能够理解的方法。

## **6.3 Service 类**

`Service` 类是现有的服务类，但它的接口（`serviceMethod`）与客户端期望的接口 `ClientInterface` 不兼容，因此需要通过适配器进行转换。

```java
public class Service {

    public void serviceMethod(String specialData) {
        System.out.println("Processing special data: " + specialData);
    }
}
```

**作用**：`Service` 是实际提供功能的类，它的方法 `serviceMethod` 能够处理特定格式的数据。适配器的作用就是将客户端的数据转换为 `Service` 能理解的格式。

## **6.4 Adapter 类**

`Adapter` 类实现了 `ClientInterface`，并持有 `Service` 类的实例。它的作用是将客户端调用的 `method` 方法转换为 `Service` 类的 `serviceMethod` 方法。

```java
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
```

**作用**：`Adapter` 类是连接 `Client` 和 `Service` 的桥梁。它将 `Client` 提供的数据进行转换，使其适配 `Service` 的接口。`Adapter` 使得 `Client` 可以在不修改 `Service` 代码的情况下使用它的功能。

通过这几个部分的代码示例，清晰地展示了适配器模式中每个类的职责和作用。`Client` 通过 `Adapter` 使用 `Service`，而 `Adapter` 实现了 `ClientInterface`，并处理了数据格式的转换。

# 7. 总结

适配器模式是一种有效的设计模式，特别适用于在现有代码无法直接修改的情况下使不兼容的接口协同工作。尽管它可能会增加一定的复杂性，但其优点在于提高了系统的可复用性和灵活性。因此，在面对接口不兼容的情况下，适配器模式是一个值得考虑的解决方案。
