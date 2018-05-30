package code.classInfo;

import java.lang.reflect.*;

//InvocationHandler 是代理实例的调用处理程序 实现的接口。 
//对代理实例调用方法时，将对方法调用进行编码并将其指派到它的调用处理程序的 invoke 方法。 
class DynamicProxyHandler implements InvocationHandler {
  private Object proxied;
  public DynamicProxyHandler(Object proxied) {
    this.proxied = proxied;
  }
  //invoke :在代理实例上处理方法调用并返回结果。
  //proxy - 在其上调用方法的代理实例
  //method - 对应于在代理实例上调用的接口方法的 Method 实例。
  //args - 包含传入代理实例上方法调用的参数值的对象数组，
  public Object invoke(Object proxy, Method method, Object[] args)
  throws Throwable {
    System.out.println("**** proxy: " + proxy.getClass().getSimpleName() +
      ", method: " + method.getName() + ", args: " + args);
    if(args != null)
      for(Object arg : args)
        System.out.println("  " + arg);
    return method.invoke(proxied, args);
  }
}	

class SimpleDynamicProxy {
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
    RealObject real = new RealObject();
    consumer(real);
//	Insert a proxy and call again:
//	Proxy.newProxyInstance: 返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。
//	loader - 定义代理类的类加载器
//	interfaces - 代理类要实现的接口列表
//	h - 指派方法调用的调用处理程序 
		Interface proxy = (Interface) Proxy.newProxyInstance(
			Interface.class.getClassLoader(),//类加载器
			new Class[] { Interface.class }, //希望代理实现的接口列表
			new DynamicProxyHandler(real));//InvocationHandle接口的实现
    consumer(proxy);
  }
} 
