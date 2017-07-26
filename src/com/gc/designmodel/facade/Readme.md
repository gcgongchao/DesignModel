# 门面模式

#### 门面模式也叫做外观模式，是一种比较常用的封装模式，其定义如下：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。门面模式注重"统一的对象"，也就是提供一个访问子系统的接口，除了这个接口不允许有任何访问子系统的行为发生。简单的说，门面对象是外界访问子系统内部的唯一通道，不管子系统内部是多么杂乱无章，只要有门面对象在，就可以做到“金玉其外，败絮其中”。
		
## 优点
#### （1）减少系统的相互依赖：使用门面模式，所有的依赖都是对门面对象的依赖，与子系统无关（2）提高了灵活性：依赖减少了，灵活性自然提高了。不管子系统内部如何变化，只要不影响到门面对象，任你自由活动。（3）提高安全性：想让你访问子系统的哪些业务就开通哪些逻辑，不在门面上开通的方法，你休想访问到。
## 缺点
#### 门面模式最大的缺点就是不符合开闭原则。
## 使用场景
#### （1）为一个复杂的模块或子系统提供一个供外界访问的接口（2）子系统相对独立——外界对子系统的访问只要黑箱操作即可（3）预防低水平人员带来的风险扩散。
## 注意事项
#### （1）一个子系统可以有多个门面（2）门面不参与子系统内的业务逻辑。	 