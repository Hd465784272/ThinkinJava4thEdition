package code.classInfo;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Method.invoke()将请求转发给被代理对象，并传入必须的参数
 * @author CCC
 *
 */
class MethodSelector implements InvocationHandler{
	private Object proxied;
	public  MethodSelector(Object proxy){
		this.proxied = proxy;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().equals("interesting")){
			System.out.println("Proxy detected the interesting method");
		}
		return method.invoke(proxied, args);
	}
}

interface SomeMethods{
	void boring1();
	void boring2();
	void interesting(String args);
	void boring3();
}
class SomeMethodImplements implements SomeMethods{

	@Override
	public void boring1() {
		// TODO Auto-generated method stub
		System.out.println("boring1");
	}
	@Override
	public void boring2() {
		// TODO Auto-generated method stub
		System.out.println("boring2");
	}
	@Override
	public void interesting(String args) {
		// TODO Auto-generated method stub
		System.out.println("interesting "+args);
	}
	@Override
	public void boring3() {
		// TODO Auto-generated method stub
		System.out.println("boring3");
	}
	
}
public class SelectionMethods {
	public static void main(String[] args) {
		SomeMethods proxy = (SomeMethods)Proxy.newProxyInstance(//创建代理对象
				SomeMethods.class.getClassLoader(),//类加载器
				new Class[]{SomeMethods.class},//希望代理实现的接口列表
				new MethodSelector(new SomeMethodImplements()));//InvocationHandle实现类
		proxy.boring1();
		proxy.boring2();
		proxy.interesting("GitHub");
		proxy.boring3();
	}
}
