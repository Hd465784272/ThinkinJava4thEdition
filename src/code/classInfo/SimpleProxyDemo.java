package code.classInfo;

/**
 * 代理：最基本的设计模式之一。他是你为了提供额外的或不同的操作，二插入的用来代替“实际”角色的对象
 */
import static net.mindview.util.Print.*;

interface Interface {
  void doSomething();
  void somethingElse(String arg);
}

//实现接口和方法
class RealObject implements Interface {
  public void doSomething() { print("doSomething"); }
  public void somethingElse(String arg) {
    print("somethingElse " + arg);
  }
}	
//实现接口和方法
class SimpleProxy implements Interface {
  private Interface proxied;
  //构造方法
  public SimpleProxy(Interface proxied) {
    this.proxied = proxied;
  }
  public void doSomething() {
    print("SimpleProxy doSomething");
    proxied.doSomething();
  }
  public void somethingElse(String arg) {
    print("SimpleProxy somethingElse " + arg);
    proxied.somethingElse(arg);
  }
}	

class SimpleProxyDemo {
	/*静态的consumer 接受 Interface，所以他无法知道获取的到底是 RealObject
	还是 SimpleProxy， 因为它们都实现了Interface*/
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
    consumer(new RealObject());
    consumer(new SimpleProxy(new RealObject()));
  }
} 
