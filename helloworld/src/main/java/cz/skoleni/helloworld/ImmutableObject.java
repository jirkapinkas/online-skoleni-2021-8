package cz.skoleni.helloworld;

import java.util.Arrays;

public final class ImmutableObject {

    private final String string;

    private final int[] pole;

    public ImmutableObject(String string, int[] pole) {
        this.string = string;
        this.pole = Arrays.copyOf(pole, pole.length); // pole automaticky neni immutable, je nutne udelat kopii!!!
    }

    public String getString() {
        return string;
    }

    public int[] getPole() {
        return pole;
    }

    public static void main(String[] args) {
        int[] pole = new int[] {1,2,3};
        ImmutableObject immutableObject = new ImmutableObject("immutable", pole);
        pole[0] = 0;
        System.out.println(Arrays.toString(immutableObject.getPole()));
    }

}
