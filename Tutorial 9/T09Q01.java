// 1a. Compare method - checks if two objects are from same class
public static boolean compare(Student s, Teacher t) {
    return s.getClass().equals(t.getClass());
}

// 1b. isClass method - checks if Student is descendant of Person
public static boolean isClass(Student s) {
    return s instanceof Person;
}
