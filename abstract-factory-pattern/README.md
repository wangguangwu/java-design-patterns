### 项目地址

[创建型模式-抽象工厂](https://www.wangguangwu.com/archives/5a82762e-d59b-4546-99c2-e762ed417427)

# 1. 简介

抽象工厂（Abstract Factory）是一种创建型设计模式，它提供一个接口，用于创建相关或依赖对象的家族，而无需明确指定它们的具体类。抽象工厂模式通过定义一个工厂接口，使得创建一组相关或相互依赖的对象成为可能，同时确保客户端仅通过接口与对象家族交互。

这一模式的**主要目的是允许客户端代码在不需要知道具体产品实现的情况下创建对象，从而提高代码的可扩展性和灵活性**。通过使用抽象工厂模式，产品的具体实现细节被隐藏在工厂接口的背后，客户端只需与工厂接口打交道即可。

# 2. 核心思想

抽象工厂模式的核心思想是**将对象的创建过程封装在不同的工厂类中，通过抽象工厂接口来提供一系列相关对象的创建方法**。这种方法确保了客户端可以使用一组互相兼容的产品，而不必依赖具体的产品实现。

通过这种方式，**客户端代码可以在不修改其结构的情况下，轻松更换整个产品家族**。这一点在需要支持多个产品变体或产品家族的系统中尤为重要。

# 3. 主要组成部分

1. **产品接口**（ProductA, ProductB）：定义了产品的共同行为，具体产品类将实现这些接口。
2. **具体产品类**（ConcreteProductA1/A2, ConcreteProductB1/B2）：实现了产品接口，代表不同的产品实现。
3. **抽象工厂接口**（AbstractFactory）：定义了创建产品的方法，每个方法负责创建一个产品。
4. **具体工厂类**（ConcreteFactory1/2）：实现了抽象工厂接口，负责创建具体的产品实例。
5. **客户端代码**（Client）：通过抽象工厂接口获取产品对象，并执行相关操作。

# 4. 适应场景

抽象工厂模式特别适用于以下场景：

1. **系统需要独立于其产品创建的方式进行工作**：当系统中的对象的创建过程非常复杂，并且这些对象通常是相关的或互相依赖的，抽象工厂可以有效地将对象的创建逻辑与系统的其他部分分离。

2. **需要一组相关的对象一起使用**：如果系统中的某些对象总是一起使用，并且需要确保它们彼此兼容，抽象工厂模式可以确保这一点。

3. **系统需要支持多种产品变体**：当系统需要支持多种产品变体（例如多个操作系统的不同 UI 组件），抽象工厂可以帮助轻松切换整个产品家族，而无需更改系统的核心逻辑。

### 举例

例如，在 GUI 开发中，可能需要支持不同操作系统的窗口、按钮和文本框等 UI 组件。通过抽象工厂模式，可以定义一个抽象工厂接口，提供创建窗口、按钮和文本框的方法。然后，可以为每种操作系统实现具体的工厂类，这些类将创建相应操作系统风格的 UI 组件。客户端代码只需与抽象工厂接口交互，而无需关心底层具体产品的实现。

# 5. 优缺点

## 5.1 优点

1. **确保产品的一致性**：抽象工厂模式保证了同一个工厂创建的产品是相互兼容的，从而确保了产品家族之间的一致性。

2. **隔离具体产品类**：客户端代码仅通过工厂接口与产品进行交互，而无需直接引用具体产品类。这减少了客户端与具体产品实现之间的耦合。

3. **遵循开闭原则**：通过引入新的具体工厂类，可以轻松扩展新的产品家族，而无需修改现有的代码结构。

4. **提高代码的可维护性**：抽象工厂将对象的创建集中在一处，使得代码更易于理解和维护。

## 5.2 缺点

1. **增加代码复杂度**：由于引入了多个产品类和工厂类，抽象工厂模式会增加系统的整体复杂性。这在产品种类较多的情况下尤其明显。

2. **难以支持新产品类型**：如果产品家族中新增了一种产品类型，则需要修改抽象工厂接口及其所有子类，可能影响到现有代码的稳定性。

# 6. 代码实现

## 6.1 类图

![类图](https://www.wangguangwu.com/upload/Pasted%20image%2020240822113248.png)

## 6.2 类结构

```java
.
└── com
    └── wangguangwu
        ├── Client.java
        ├── factory
        │   ├── AbstractFactory.java
        │   └── impl
        │       ├── ConcreteFactory1.java
        │       └── ConcreteFactory2.java
        └── product
            ├── ProductA.java
            ├── ProductB.java
            └── impl
                ├── ConcreteProductA1.java
                ├── ConcreteProductA2.java
                ├── ConcreteProductB1.java
                └── ConcreteProductB2.java
```

## 6.3 代码解析

这是一个基于抽象工厂设计模式的 Java 代码结构。下面是对每个类的解释：

### 6.3.1 **Client.java**

- **位置**: `com.wangguangwu.Client`
- **角色**: 客户端代码。
- **说明**: 这是抽象工厂模式的客户端类，负责使用抽象工厂接口来创建一组相关的产品对象。客户端通过依赖抽象工厂接口与具体的产品家族解耦，因此可以在不修改客户端代码的情况下切换不同的产品家族。

### 6.3.2 **factory 包**

这个包内的类负责定义和实现创建一组相关产品的工厂类。

- **AbstractFactory.java**

  - **位置**: `com.wangguangwu.factory.AbstractFactory`
  - **角色**: 抽象工厂接口。
  - **说明**: 定义了一组创建相关产品对象的方法（如 `createProductA()` 和 `createProductB()`）。具体的工厂类会实现这些方法以生成不同的产品家族。

- **impl 包**

  - **位置**: `com.wangguangwu.factory.impl`
  - 这个子包内的类是 `AbstractFactory` 接口的具体实现类。

  - **ConcreteFactory1.java**

    - **位置**: `com.wangguangwu.factory.impl.ConcreteFactory1`
    - **角色**: 具体工厂类 1。
    - **说明**: 实现了 `AbstractFactory` 接口，负责创建第一组相关的产品对象（如 `ConcreteProductA1` 和 `ConcreteProductB1`）。

  - **ConcreteFactory2.java**

    - **位置**: `com.wangguangwu.factory.impl.ConcreteFactory2`
    - **角色**: 具体工厂类 2。
    - **说明**: 实现了 `AbstractFactory` 接口，负责创建第二组相关的产品对象（如 `ConcreteProductA2` 和 `ConcreteProductB2`）。

### 6.3.3 **product 包**

这个包内的类负责定义产品的接口及其具体实现。

- **ProductA.java**

  - **位置**: `com.wangguangwu.product.ProductA`
  - **角色**: 产品 A 的抽象定义。
  - **说明**: 定义了产品 A 的接口，具体的产品类将实现这个接口。

- **ProductB.java**

  - **位置**: `com.wangguangwu.product.ProductB`
  - **角色**: 产品 B 的抽象定义。
  - **说明**: 定义了产品 B 的接口，具体的产品类将实现这个接口。

- **impl 包**

  - **位置**: `com.wangguangwu.product.impl`
  - 这个子包内的类是 `ProductA` 和 `ProductB` 接口的具体实现类。

  - **ConcreteProductA1.java**

    - **位置**: `com.wangguangwu.product.impl.ConcreteProductA1`
    - **角色**: 具体产品 A1。
    - **说明**: 实现了 `ProductA` 接口，定义了产品 A1 的具体逻辑，与 `ConcreteFactory1` 相关联。

  - **ConcreteProductA2.java**

    - **位置**: `com.wangguangwu.product.impl.ConcreteProductA2`
    - **角色**: 具体产品 A2。
    - **说明**: 实现了 `ProductA` 接口，定义了产品 A2 的具体逻辑，与 `ConcreteFactory2` 相关联。

  - **ConcreteProductB1.java**

    - **位置**: `com.wangguangwu.product.impl.ConcreteProductB1`
    - **角色**: 具体产品 B1。
    - **说明**: 实现了 `ProductB` 接口，定义了产品 B1 的具体逻辑，与 `ConcreteFactory1` 相关联。

  - **ConcreteProductB2.java**

    - **位置**: `com.wangguangwu.product.impl.ConcreteProductB2`
    - **角色**: 具体产品 B2。
    - **说明**: 实现了 `ProductB` 接口，定义了产品 B2 的具体逻辑，与 `ConcreteFactory2` 相关联。

**总结：**

- **`Client.java`**: 客户端代码，使用抽象工厂接口来创建和使用一组相关的产品对象。
- **`AbstractFactory.java`**: 抽象工厂接口，定义了创建一组相关产品对象的方法。
- **`ConcreteFactory1.java` 和 `ConcreteFactory2.java`**: 具体工厂类，实现了抽象工厂接口，负责创建具体的产品家族对象。
- **`ProductA.java` 和 `ProductB.java`**: 产品接口，定义了不同产品的行为和属性。
- **`ConcreteProductA1.java`, `ConcreteProductA2.java`, `ConcreteProductB1.java`, `ConcreteProductB2.java`**: 具体产品类，实现了产品接口，提供了产品的具体行为和实现。

# 7. 总结

抽象工厂模式是一种强大的创建型设计模式，它通过将产品创建逻辑封装在工厂类中，使系统能够独立于产品创建进行工作，并确保产品家族之间的兼容性。尽管抽象工厂模式增加了代码的复杂性，但它带来的灵活性和可扩展性使得它在复杂系统中尤其有用。