# java11-default-methods-conflicts
Overview of default methods conflicts.

# project description
* super class with interface conflict
    * base class
        ```
        class CustomClass extends SuperClass implements Interface1 {}
        ```
    * super class
        ```
        class SuperClass {
            public String get() {
                return "SuperClass";
            }
        }
        ```
    * interface
        ```
        interface Interface1 {
            default String get() {
                return "Interface1";
            }
        }
        ```
    then if you call method `get()` on an instance
    of `CustomClass` it will be called method from
    `SuperClass` (`CustomClassTest`):
    ```
    assertThat(new CustomClass().get(), is("SuperClass"));
    ```
* interface with interface conflict - compile time error