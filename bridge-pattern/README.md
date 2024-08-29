桥接模式是一种结构型设计模式，它将一个大类或一系列紧密相关的类拆分为抽象和实现两个独立的层次结构，从而能够在开发时独立地进行扩展和使用。

### 项目地址

[结构型模式-桥接](https://www.wangguangwu.com/archives/0ab95258-dab9-4fb8-857d-d1fa042025e4)

# 1. 简介

桥接模式（Bridge Pattern）是结构型设计模式之一，用于**将抽象部分与其实现部分分离，使它们可以独立地变化**。通过这种模式，抽象和实现可以解耦，从而实现更灵活的代码结构。**桥接模式通常用于避免类爆炸式增长的情况，通过组合的方式代替继承来扩展功能**。

# 2. 核心思想

桥接模式的**核心思想是将抽象部分和实现部分通过一个桥接接口进行连接**。这样，抽象部分和实现部分可以独立进行扩展，而不会相互影响。通过这种方式，系统可以更灵活地适应变化，同时保持结构的清晰性和可维护性。

# 3. 主要组成部分

桥接模式通常由以下几个部分组成：

- **抽象类（Abstraction）**：定义高层抽象接口，并持有实现部分的引用。
- **扩展抽象类（Refined Abstraction）**：在抽象类的基础上进一步扩展，增加新的功能或特性。
- **实现接口（Implementor）**：定义实现类的接口，该接口可以是抽象类或接口。
- **具体实现类（Concrete Implementor）**：实现 Implementor 接口中的具体方法。
- **桥接（Bridge）**：通过组合的方式将 Abstraction 与 Implementor 关联起来，实现二者的解耦。

# 4. 适应场景

桥接模式适用于以下场景：

- **当系统需要在多个维度上进行扩展时**：例如，当一个类存在多个变化的维度时，使用桥接模式可以避免使用多层继承导致的复杂性。
- **希望将抽象与实现解耦时**：这可以使二者独立变化，增加系统的灵活性。
- **希望提高代码的可扩展性和维护性时**：通过桥接模式，可以轻松地添加新功能或改进现有功能，而不需要修改原有代码。

# 5. 优缺点

## 5.1 优点

- **抽象和实现分离**：桥接模式通过分离抽象和实现，使得它们可以独立变化，增强了系统的灵活性。
- **提高系统的可扩展性**：可以很容易地扩展抽象层和实现层，而不会影响其他部分。
- **符合开闭原则**：可以在不修改已有代码的情况下，增加新的实现方式或扩展抽象层次。

## 5.2 缺点

- **增加系统的复杂性**：桥接模式引入了多个类和接口，可能会增加系统的复杂性，尤其是在系统结构已经很复杂的情况下。
- **需要明确的设计规划**：在实际应用中，需要对抽象和实现的层次有清晰的规划，否则可能会导致设计混乱。

### **6. 代码实现**

在这一节中，我们将详细介绍桥接模式的各个组成部分，分别展示每个类的代码，并说明其作用。



**类图：**

![UML图](https://wangguangwu.github.io/picx-images-hosting/20240829/image.1vyl7tch09.jpg)



## **6.1 Abstraction 类**

`Abstraction` 类是抽象部分的基础类，它定义了核心功能的接口，并持有 `Implementation` 接口的引用。在桥接模式中，`Abstraction` 不直接实现这些功能，而是将具体的实现委托给 `Implementation`。

```java
public class Abstraction {

    protected final Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void feature1() {
        implementation.method1();
    }

    public void feature2() {
        implementation.method2();
    }
}
```

**作用**：`Abstraction` 类定义了抽象层的基本功能接口，并通过 `Implementation` 接口的引用来执行这些功能。`feature1` 和 `feature2` 方法依赖于 `Implementation` 的实现，以此实现具体的功能。

## **6.2 Implementation 接口**

`Implementation` 是实现部分的接口，它定义了实现的基本操作方法。在桥接模式中，具体的实现类将实现这个接口。

```java
public interface Implementation {

    void method1();
    void method2();
    void method3();

}
```

**作用**：`Implementation` 接口定义了实现层的基本操作接口。具体的实现类将会实现这些方法，提供实际的功能。

## **6.3 ConcreteImplementations 类**

`ConcreteImplementations` 类是实现 `Implementation` 接口的具体类。它提供了具体的实现逻辑，并将这些实现暴露给 `Abstraction`。

ConcreteImplementationA：

```java
public class ConcreteImplementationA implements Implementation {

    @Override
    public void method1() {
        System.out.println("ConcreteImplementationA: Executing Method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteImplementationA: Executing Method2");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteImplementationA: Executing Method3");
    }
}
```

ConcreteImplementationB：

```java
public class ConcreteImplementationB implements Implementation {

    @Override
    public void method1() {
        System.out.println("ConcreteImplementationB: Executing Method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteImplementationB: Executing Method2");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteImplementationB: Executing Method3");
    }
}
```

**作用**：这些 `ConcreteImplementation` 类是实现接口的具体实现。每个实现类都提供了实际的业务逻辑，`ConcreteImplementationA` 和 `ConcreteImplementationB` 分别代表了不同的实现方式。

## **6.4 RefinedAbstraction 类**

`RefinedAbstraction` 类是 `Abstraction` 的扩展类，它可以增加或修改抽象层的行为。

```java
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    public void featureN() {
        implementation.method3();
    }
}
```

**作用**：`RefinedAbstraction` 类扩展了 `Abstraction` 的功能，增加了对 `Implementation` 的新方法调用，例如 `featureN` 方法，利用了 `method3` 来实现新的功能。

## **6.5 Client 类**

`Client` 类是客户端，通过 `Abstraction` 与实现类进行交互，而不直接依赖具体的 `Implementation`。

```java
public class Client {

    public static void main(String[] args) {
        Implementation implementationA = new ConcreteImplementationA();
        RefinedAbstraction abstractionA = new RefinedAbstraction(implementationA);

        abstractionA.feature1();
        abstractionA.feature2();
        abstractionA.featureN();

        Implementation implementationB = new ConcreteImplementationB();
        RefinedAbstraction abstractionB = new RefinedAbstraction(implementationB);

        abstractionB.feature1();
        abstractionB.feature2();
        abstractionB.featureN();
    }
}
```

**作用**：`Client` 类是桥接模式的使用者，通过 `Abstraction` 类调用具体的实现类功能。`Client` 不直接依赖 `ConcreteImplementation` 类，而是通过 `Abstraction` 和 `Implementation` 接口间接使用，实现了抽象与实现的解耦。

这套代码展示了桥接模式的完整实现。通过这种方式，`Abstraction` 和 `Implementation` 可以独立扩展，而不会相互影响，从而提高了系统的灵活性和可维护性。

# 7. 总结

桥接模式是一种有效的设计模式，尤其适用于需要跨多个维度进行扩展的系统。通过将抽象部分和实现部分分离，桥接模式可以有效减少系统的复杂性，提高系统的灵活性和可扩展性。然而，使用桥接模式也需要仔细设计，确保系统结构的清晰和维护的便利性。在复杂系统中，桥接模式是一种非常有用的工具，可以帮助开发者更好地组织代码，减少类间耦合，提升系统的模块化程度。