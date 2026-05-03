package com._6.preparation2026.basicJavaFeatures.comparableAndComparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example {

    private static final Logger log = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        int a[] = {4, 3, 2, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        Student[] studentArr = new Student[5];
        studentArr[0] = new Student(1, "sagar");
        studentArr[1] = new Student(4, "lion");
        studentArr[2] = new Student(3, "alpha");
        studentArr[3] = new Student(9, "das");
        studentArr[4] = new Student(2, "das");


        for (Student student : studentArr) {
            System.out.println(student.id + " -> " + student.name);
        }

        System.out.println(Arrays.toString(studentArr));

        Arrays.sort(studentArr, Student.studentComparator);
        for (Student student : studentArr) {
            System.out.println(student.id + " -> " + student.name);
        }
        System.out.println("-------");
//        Arrays.stream(studentArr).sorted(
//                Comparator.comparing((Student s)->s.name).reversed()
//                        .thenComparing(Comparator.comparing((Student s) -> s.id))
//        ).forEach(x-> System.out.println(x.id + " -> " + x.name));
//

        Arrays.stream(studentArr).sorted(
                Comparator.comparing((Student s) ->s.name).thenComparing(

                        Comparator.comparing((Student s) ->s.id).reversed()
                )

        ).forEach(x->System.out.println(x.id+" --->>> "+x.name));
    }
}
