package com.wangguangwu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * @author wangguangwu
 */
class ApiTest {

    @Test
    void testShallowCloning() {
        // 测试浅克隆对基本数据类型、引用数据类型、以及引用数据类型中的不可变类型的作用
        Address address = new Address("安徽省芜湖市");
        Person originalPerson = new Person("wang", 1, 23, address);
        Person clonePerson = originalPerson.clone();

        printHashCode("person", originalPerson, clonePerson);
        printHashCode("id", originalPerson.getId(), clonePerson.getId());
        printHashCode("age", originalPerson.getAge(), clonePerson.getAge());
        printHashCode("name", originalPerson.getName(), clonePerson.getName());
        printHashCode("address", originalPerson.getAddress(), clonePerson.getAddress());

        System.out.println("\n=================change====================\n");

        // 基本数据类型
        clonePerson.setId(2);
        printHashCode("id", originalPerson.getId(), clonePerson.getId());

        // 引用类型中的不可变类型
        clonePerson.setAge(24);
        clonePerson.setName("gary");
        printHashCode("age", originalPerson.getAge(), clonePerson.getAge());
        printHashCode("name", originalPerson.getName(), clonePerson.getName());

        // 引用类型
        clonePerson.getAddress().setLocation("浙江省杭州市");
        printHashCode("address", originalPerson.getAddress(), clonePerson.getAddress());

        printHashCode("person", originalPerson, clonePerson);
    }

    static void printHashCode(String type, Object object1, Object object2) {
        System.out.println("=================" + type + "====================");
        System.out.println("original value: " + object1 + ", location: " + System.identityHashCode(object1));
        System.out.println("cloned value: " + object2 + ", location: " + System.identityHashCode(object2));
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Cloneable {

    private String name;
    private int id;
    private Integer age;
    private Address address;

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Address {

    private String location;

}