public class Main {

    public static void main(String[] args) {
        DataTypesTester.testByte();
        DataTypesTester.testShort();
        DataTypesTester.testChar();
        DataTypesTester.testInt();
        DataTypesTester.testLong();
        DataTypesTester.testDouble();
        DataTypesTester.testFloat();
        DataTypesTester.testBoolean();
        Student st=new Student("ALex", 10);
        String text="Hello";
        DataTypesTester.testReferencesTypes(st, text);
    }
}
