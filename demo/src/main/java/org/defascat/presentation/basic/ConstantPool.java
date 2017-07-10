package org.defascat.presentation.basic;

/*
javap -c -verbose target/classes/org/defascat/presentation/string/ConstantPool.class
#2 = String             #31            // test
#31 = Utf8               test

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=1
         0: ldc           #2                  // String test
         2: astore_1
         3: ldc           #2                  // String test
         5: astore_2
         6: new           #3                  // class java/lang/String
         9: dup
        10: ldc           #2                  // String test
        12: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V

 */
public class ConstantPool {
    public static void main(String[] args) {
        String a = "test";
        String b = "test";
        String c = new String("test");
        System.out.println(a == b);
        System.out.println(b == c);
    }
}
