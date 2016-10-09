##  Class 类的使用

1. Class  class1=Foo.class;  ------->实际在告诉我们，任何一个类都有一个隐含的静态成员变量

2. Class  class2=foo1.getClass()---->已知该类的对象，通过该类的对象通过getClass方法

   class1和class2表示Foo类的类 类型（class type）  Foo这个类本身就是一个对象，Foo类的对象：

3. Class class3=null;  class3=Class.forName();

   class1==class2==class3


## 动态加载类

