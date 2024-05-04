import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].name = "Kurmanbek";
        students[0].age = 24;
        students[0].group = "Java";

        students[1] = new Student();
        students[1].name = "Tunuk";
        students[1].age = 38;
        students[1].group = "Java";

        students[2] = new Student();
        students[2].name = "Nurkamil";
        students[2].age = 23;
        students[2].group = "Java";

        students[3] = new Student();
        students[3].name = "Ulan";
        students[3].age = 28;
        students[3].group = "JS";

        students[4] = new Student();
        students[4].name = "Sanjar";
        students[4].age = 22;
        students[4].group = "JS";

        int javaStudents = 0;
        int jsStudent = 0;
        for(Student student : students) {
            if(student.group.equals("Java")) {
                javaStudents++;
            } else if (student.group.equals("JS")) {
                jsStudent++;
            }
        }
        System.out.println("Count of students in JAVA group: " + javaStudents);
        System.out.println("Count of student in JS: " + jsStudent);

        int sumOfAge = 0;
        for (Student student : students) {
            sumOfAge += student.age;
        }
        System.out.println(sumOfAge / students.length);




//        Passport passport = new Passport();
//        passport.id = 111091986;
//        passport.firstName = "Tunuk";
//        passport.lastName = "Asanbekova";
//        passport.yearOfBirth = 1986;
//        passport.gender = 'f';
//        passport.countryOfBirth = "Kyrgyzstan";
//
//        System.out.println("ID: " + passport.id + "\n"
//        + "First name: " + passport.firstName + "\n"
//        + "Last name: " + passport.lastName + "\n"
//        + "Year og birth day: " + passport.yearOfBirth + "\n"
//        + "Gender: " + passport.gender + "\n" + "Country of birth: " + passport.countryOfBirth);
//


//        Triangle triangle = new Triangle();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("First number:");
//        triangle.a = scanner.nextInt();
//        System.out.println("Whrite second number:");
//        triangle.b = scanner.nextInt();
//        System.out.println("Whrite thirth number:");
//        triangle.c = scanner.nextInt();
//        triangle.square();


//        Scanner scanner = new Scanner(System.in);
//        University study = new University();
//        System.out.println("Whrite name of University: ");
//        study.name = scanner.nextLine();
//        System.out.println("Whrite of the kafedra: ");
//        study.kafedra = scanner.nextLine();
//        System.out.println("Whrite of the fakultet:");
//        study.fakultet = scanner.nextLine();
//        System.out.println("Spesislizasia:");
//        study.spesializasia = scanner.nextLine();
//        System.out.println("Price: ");
//        study.price = scanner.nextInt();
//        System.out.println("Students: ");
//        study.students = scanner.nextInt();
//
//        System.out.println("Name of University = " + study.name + "\n"
//                + "Name of kafedra = " + study.kafedra + "\n"
//        + "Name of fakultet = " + study.fakultet + "\n"
//        + "Spezalizaziya = " + study.spesializasia + "\n"
//        + "Price for study = " + study.price + "\n"
//        + "Students = " + study.students);

//        Scanner scanner = new Scanner(System.in);
//        Programmer person = new Programmer();
//        System.out.println("Whrite name: ");
//        person.name = scanner.nextLine();
//        System.out.println("Whrite surename: ");
//        person.surname = scanner.nextLine();
//        System.out.println("Whrite age: ");
//        person.age = scanner.nextInt();
//
//        System.out.println("Name: " + person.name + "\n" + "Surname: " + person.surname + "\n" + "Age: " + person.age);
//
//        System.out.println("Get of birth day: ");
//        person.getDateOfBirth();



//
//        Phone phone = new Phone();
//        phone.name = "Iphone";
//        phone.model = "14 Pro Max";
//        phone.price = 126300;
//        phone.color = "Pirple";
//        System.out.println("Name phone: "  + phone.name + "\n" + "Model: " + phone.model + "\n" + "Price: " + phone.price + "\n" + "Color: " + phone.color);
//
//        System.out.print("Telefondun ish araketi: ");
//        Phone.call();

//        System.out.println();
//        Phone redmi = new Phone();
//        redmi.name = "Redni";
//        redmi.model = "MI";
//        redmi.price = 15000;
//        redmi.color = "White";
//        System.out.println("Name: " + redmi.name + "\n" + "Model: " + redmi.model + "\n" + "Price: " + redmi.price + "\n" + "Color: " + redmi.color );
//
//        Car car = new Car();
//        car.name = "Ferrari";
//        car.model = "Ice";
//        car.price = 5000000;
//        car.color = "White";
//        System.out.println("Name: " + car.name + "\n" + "Model: " + car.model + "\n" + "Price: " + car.price + "\n" + "Color: " + car.color) ;
//
//        Person person = new Person();
//        person.nation = "Kyrgyz";
//        person.name = "Tunuk";
//        person.rasa = "Asian";
//        person.age = 38;
//        person.height = 1.64;
//        person.weight = 50;
//        person.familyStatus = "Married";
//        person.gender = 'F';
//        person.profession = "Economist";
//
//        System.out.println("Nation: " + person.nation + "\n" + "Name: " + person.name
//        + "\n" + "Rasa: " + person.rasa + "\n" + "Age: " + person.age
//        + "\n" + "Height: " + person.height + "\n" + "Weight: " + person.weight
//        + "\n" + "Famiily Status: " + person.familyStatus + "\n" + "Gender: " + person.gender
//        + "\n" + "Profession: " + person.profession);


    }
}