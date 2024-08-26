### 项目地址

[创建型模式-单例](https://www.wangguangwu.com/archives/3d9d49aa-a5d2-4232-a4d6-04f2e7346611)

# 1. 简介

单例模式（Singleton Pattern）是一种创建型设计模式，其**目的是确保一个类只有一个实例，并提供全局访问点**。单例模式可以通过限制类的实例化次数，并将实例化后的对象存储起来，供后续使用。这个模式**在需要频繁创建和销毁对象的场景下，能够有效节省资源，提高系统的性能**。

# 2. 核心思想

单例模式的**核心思想是控制类的实例化过程，确保类在整个程序运行期间只能有一个实例存在，并且提供一个全局的访问点**。通过私有化构造函数，防止外部直接实例化对象，而通过一个静态方法或属性来获取唯一的实例。

# 3. 主要组成部分

1. **私有构造函数（Private Constructor）**：确保外部不能直接实例化类。
2. **唯一实例（Singleton Instance）**：通过类的静态成员变量存储唯一实例。
3. **全局访问点（Global Access Point）**：提供一个静态方法，用于返回唯一实例的引用，通常是 `getInstance()` 方法。

# 4. 适应场景

单例模式适用于以下场景：

1. **需要唯一实例的场景**：例如配置类、线程池、缓存、日志管理器等，全局使用同一个对象实例以保证状态的一致性。
2. **需要控制资源消耗的场景**：避免频繁创建和销毁对象带来的性能开销，特别是在创建成本高或需要共享资源的对象时。
3. **需要协调资源或配置管理的场景**：确保整个应用程序中使用相同的资源或配置对象，以防止配置不一致。

# 5. 优缺点

## 5.1 优点

1. **控制实例数量**：单例模式保证一个类只有一个实例，避免了对象实例的重复创建，节省系统资源。
2. **全局访问**：单例模式提供了全局访问点，方便不同模块之间共享数据或资源。
3. **延迟实例化**：一些单例模式的实现可以延迟实例化对象，直到首次使用时才创建，节省了初始化资源。

## 5.2 缺点

1. **不易扩展**：单例模式通常难以扩展，如果要修改或替换单例类的行为，可能需要较大的改动。
2. **隐藏依赖关系**：单例类可以被全局访问，可能导致代码中隐藏的依赖关系增多，不利于代码的测试和维护。
3. **多线程问题**：在多线程环境下实现单例模式需要注意线程安全问题，可能需要使用同步锁，导致一定的性能开销。

# 6. 实现方式

单例模式有多种实现方式，如懒汉式、饿汉式、双重检查锁（Double-Checked Locking）、静态内部类等。每种方式都有其适用场景和优缺点，需要根据具体需求选择合适的实现。

### 6. 单例模式的几种实现方式

#### 6.1 饿汉式 (Singleton01)

**实现方式**：
饿汉式是在类加载时就完成了实例的创建。因为实例是在类加载的时候就完成的，所以线程安全，但是由于不论使用与否，实例都会被创建，可能会造成不必要的资源浪费。

**代码实现**：

```java
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {}

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
```

**特点**：

- **优点**：实现简单，类加载时即完成实例化，避免了线程同步问题。
- **缺点**：不管是否使用，类加载时就实例化对象，可能会造成资源浪费。

#### 6.2 懒汉式（线程不安全）(Singleton02)

**实现方式**：
懒汉式是在第一次调用 `getInstance()` 方法时才创建实例。因为是在第一次使用时才实例化，所以避免了资源浪费。但这个实现不是线程安全的。

**代码实现**：

```java
public class Singleton02 {

    private static Singleton02 instance;

    private Singleton02() {}

    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}
```

**特点**：

- **优点**：延迟加载，只有在使用时才创建实例，避免了资源浪费。
- **缺点**：线程不安全，在多线程环境下可能会出现多个实例。

#### 6.3 懒汉式（线程安全）(Singleton03)

**实现方式**：
通过在 `getInstance()` 方法上加锁（synchronized）来保证线程安全。虽然这样做解决了线程不安全的问题，但同步锁会导致每次获取实例时都需要进行线程同步，开销较大。

**代码实现**：

```java
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {}

    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
```

**特点**：

- **优点**：线程安全，保证每次调用 `getInstance()` 时都只能获取一个实例。
- **缺点**：由于在 `getInstance()` 方法上加锁，性能较差。

#### 6.4 双重检查锁 (Singleton04)

**实现方式**：
双重检查锁（Double-Check Locking）优化了懒汉式的线程安全问题。它只在第一次实例化时加锁，以后获取实例时不需要加锁，因此性能较高。

**代码实现**：

```java
public class Singleton04 {

    private static volatile Singleton04 instance;

    private Singleton04() {}

    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
```

**特点**：

- **优点**：线程安全，延迟加载，性能较高。
- **缺点**：实现复杂，需要使用 `volatile` 关键字来确保 instance 的可见性。

#### 6.5 静态内部类 (Singleton05)

**实现方式**：
静态内部类实现了一种更优雅的方式。通过使用静态内部类实现延迟加载，且不需要加锁。因为类的静态属性只会在第一次加载类时初始化，所以 JVM 可以确保其线程安全。

**代码实现**：

```java
public class Singleton05 {

    private Singleton05() {}

    private static class Holder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return Holder.INSTANCE;
    }
}
```

**特点**：

- **优点**：线程安全，延迟加载，性能优良。
- **缺点**：实现复杂度稍高，但比双重检查锁简单。

#### 6.6 枚举 (Singleton06)

**实现方式**：
通过使用枚举的方式来实现单例模式。枚举类型是线程安全的，并且其序列化机制可以防止创建新的实例。

**代码实现**：

```java
public enum Singleton06 {

    INSTANCE;

    public void doSomething() {
        // TODO: 实现具体方法
    }
}
```

**特点**：

- **优点**：最简单的单例实现方式，线程安全，防止反序列化生成新对象。
- **缺点**：无法实现懒加载（JVM 在加载枚举类时即创建实例）。

# 7. 总结

单例模式是一种非常实用的设计模式，在需要唯一实例、全局共享资源的场景中具有广泛的应用。然而，在使用单例模式时需要注意可能带来的缺点，尤其是在多线程环境下的实现。选择合适的单例模式实现方式，能够在保证线程安全的同时，提升系统的性能和可维护性。