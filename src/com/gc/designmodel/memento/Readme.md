# 备忘录模式
## 定义
#### 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。通俗地说，备忘录模式就是一个对象的备份模式，提供了一种程序数据的备份方法。

## 应用
#### 由于备忘录模式有太多的变形和处理方式，每种方式都有它自己的优点和缺点，标准的备忘录模式很难在项目中遇到，基本上都有一些变换处理方式。因此，我们在使用备忘录模式时主要了解如何应用以及需要注意哪些事项就成了。

## 使用场景
#### （1）需要保存和恢复数据的相关状态场景（2）提供一个可回滚(rollback)的操作。（3）需要监控的副本场景中。（4）数据库连接的事务管理就是用的备忘录模式。

## 注意事项
#### （1）备忘录的生命期：备忘录创建出来就要在“最近”的代码中使用，要主动管理它的生命周期，建立就要使用，不使用就要立刻删除其引用，等待垃圾回收器对它的回收处理。（2）备忘录的性能：不要在频繁建立备份的场景中使用备忘录模式，原因有二：一是控制不了备忘录建立的对象数量，二是大对象的建立是要消耗资源的，系统的性能需要考虑。

## 扩展
#### （1）clone方式的备忘录:clone方式的备忘录模式，在复杂的场景下它会让你的程序逻辑异常混乱，出现错误也很难跟踪，因此Clone方式的备忘录模式适用于较简单的场景。（2）多状态的备忘录模式,使用Hashmap结合实现（3）多备份的备忘录,使用Hashmap结合实现（4）封装得更好一点，将备忘录作为发起人的内部类。
