package SIngletonEnum;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {	
		MySingletonLazy lazy = MySingletonLazy.getInstance();	
		MySingletonEnum myEnum = MySingletonEnum.INSTANCE;
		MySingletonEnum myEnum1 = MySingletonEnum.INSTANCE;
	}

}
