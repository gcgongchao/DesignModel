# 组合模式
## 定义
#### 组合模式也叫合成模式，有时又叫做部分-整体模式,主要是用来描述部分与整体的关系。其定义如下：将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。同时对于组合模式要记住的是树形结构是要采用组合模式的。

## 优点
#### （1）高层模块调用简单：一颗树形机构中的所有节点都是Component，局部和整体对调用者来说没有任何区别，也就是说，高层模块不必关心自己处理的是单个对象还是整个组合结构，简化了高层模块的代码。
#### （2）节点自由增加：使用了组合模式后，我们可以看看，如果想增加一个树枝节点，树叶节点是不是都很容易，只要找到它的父节点就成，非常容易扩展，符合开闭原则，对以后的维护非常有利。


## 缺点
#### 组合模式有一个非常明显的缺点，就是与依赖倒置原则冲突。

## 使用场景
#### （1）维护和展示部门-整体关系的场景，如树形菜单，文件和文件夹管理。
#### （2）从一个整体中能够独立出部分模块或功能的场景。

## 注意事项
#### 只要是树形结构，就要考虑使用组合模式，这个一定要记住，只要是要体现局部和整体的关系的时候，而且这种关系还可能比较深，考虑一下组合模式吧。

## 扩展
#### 在例子中我们使用的是安全的组合模式，其实组合模式有两种不同的实现：透明模式和安全模式，透明模式是把用来组合使用的方法放到抽象类中，比如addXXX()方法，但是如果处理不当，会在运行期间出现问题，不是很建议透明的组合模式。
