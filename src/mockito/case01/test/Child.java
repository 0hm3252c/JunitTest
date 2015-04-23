package mockito.case01.test;

public class Child extends Parent {

    public static int CLASS_FIELD = -1;
    public int instanceField = -1;

    public Child() {
    	this.instanceField = 5000;
	}

    public static int classMethod() {
        return -1;
    }

    public int instanceMethod() {
        return -1;
    }

    public final int finalInstanceMethod() {
        return -1;
    }
}