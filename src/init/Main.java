package init;

public class Main {
    public static void main(String[] args) {
        Grandchild obj = new Grandchild();
    }
}

class Parent {
    static int id = 1;
    String name = " Parent";

    static {
        System.out.println("1 Parent static block");
    }

    {
        System.out.println("4 Parent non-static block " + id + name);
    }

    Parent() {
        System.out.println("5 Parent constructor");
    }
}

class Child extends Parent {
    static int id = 2;
    String name = " Child";

    static {
        System.out.println("2 Child static block");
    }

    {
        System.out.println("6 Child non-static block " + id + name);
    }

    Child() {
        System.out.println("7 Child constructor");
    }
}

class Grandchild extends Child {
    static int id = 3;
    String name = " Grandchild";

    static {
        System.out.println("3 Grandchild static block");
    }

    {
        System.out.println("8 Grandchild non-static block " + id + name);
    }

    Grandchild() {
        System.out.println("9 Grandchild constructor");
    }
}