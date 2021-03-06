# -一、实验目的

掌握Java中抽象类和抽象方法的定义； 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法 了解异常的使用方法，并在程序中根据输入情况做异常处理
# -二、实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。要求
编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。
# -三、实验要求
(1)在博士研究生类中实现各个接口定义的抽象方法;
(2)对年学费和年收入进行统计，用收入减去学费，求得纳税额；
(3)国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。
(4)实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
(5)根据输入情况，要在程序中做异常处理。
# -四.实验过程
SMI接口(学生管理接口)声明缴纳学费(PF)、查询学费(QF)的抽象方法;
TMI接口(教师管理接口)声明发放薪水(PS)、查询薪水(QS)的抽象方法;
Person类下定义三个基本属性（Age、Name、Sex），利用Scanner类交互式输入为属性赋值;
Doctor类继承Person类，获得父类属性，定义类下四个基本属性(fee、term、salary、month)同时将SMI、TMI两接口的所有抽象方法实现;
查询方法(QF、QS)打印feeterm与salarymonth的计算结果，即显示计算的学费金额与薪水金额;
支付方法(PF、PS)计算salarymonth与feeterm的结果，即计算学费金额与薪水金额;
重写toString()方法，将相关属性以既定方式输出显示;
在Test主类中，定义类下的特有属性static final double ratio(纳税系数)以及静态方法WAY(Doctor d)为其下tax赋值,即输出并打印纳税金额;
main方法中构造Scanner类的对象scan，接收从控制台输入的信息，实现交互式输入;
main方法中创建一个Doctor对象D1，实例化第一名博士生,并通过Scanner类运行时交互式输入为其所有属性依次赋值;(有属性提示);
main方法中创建一个Doctor对象D2，实例化第二名博士生,并通过Scanner类运行时交互式输入为其所有属性依次赋值;(有属性提示);
在通过Scanner类交互式输入赋值时，对每位博士生每个属性赋值嵌入while循环和if else条件判断,当输入值的格式有误时进行else异常处理，继续执行循环重新赋值(有错误提示);
调用每位博士生类下重写的toString()方法,输出其各种属性赋值信息以及相关值的计算结果(纳税金额、学费金额、薪水金额);
在每位博士生的基本信息输入后直接通过方法名调用Test类下的税额WAY方法，将形参分别修改为D1、D2（静态）;
异常处理 在交互式输入博士生基本属性时，将可能出现错误赋值的语句用try{}包含，并catch(Exception e){}捕获错误，进行异常处理，输出相应错误提示信息，然后重新赋值;
# -五.运行截图
![](https://github.com/zzfer8/-/blob/main/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20201108213622.png)
# -六.实验感想
这次实验主要体现了抽象类，接口与异常处理的使用，以及当程序完成后，对程序细节的优化，抽象类与接口的使用，可以在接口中去仅仅做函数的声明，在其余抽象类中去实现相关函数的方法，且相同函数声明在不同类 能用不同方法实现。面向对象的异常处理机制，使得我们的程序实现更加快速高效。而且，这次实验实现了Scanner类的交互性输入，让程序设计和运行更加仿真、实用。
