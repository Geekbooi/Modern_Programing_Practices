package SIngletonEnum;

/** Threadsafe singleton implementation; eager initialization */
public enum MySingletonEnum {
	INSTANCE; // public static final
	MySingletonEnum(){
		System.out.println("Enum Singleton created");
	}
}
