package lesson25;

enum Teacher  {
    MATH_TEACHER("John Smith"),
    SCIENCE_TEACHER("Emma Johnson"),
    HISTORY_TEACHER("Michael Brown"),
    ENGLISH_TEACHER("Sarah Wilson");

    private final String name;

    Teacher(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

}
