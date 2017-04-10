import java.util.*;
import java.util.stream.Collectors;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] totalStudentsStr = console.nextLine().split(" ");
        int totalStudents = Integer.parseInt(totalStudentsStr[0]);
        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < totalStudents; i++) {

            String[] input = console.nextLine().split(" ");
            String name = input[0];
            Student currentStudent = new Student();
            currentStudent.name = name;
            ArrayList<Double> gradesList = new ArrayList<Double>();

            for (int j = 1; j < input.length; j++) {
                gradesList.add(Double.parseDouble(input[j]));
            }
            double sum = 0;
            for (int k = 0; k < gradesList.size(); k++) {
                sum += gradesList.get(k);
            }
            double avg = sum / gradesList.size();
            currentStudent.setGrades(gradesList);
            currentStudent.setAvgGrade(avg);
            students.add(currentStudent);
        }

        List<Student> result = students.stream()
                .filter(a -> a.avgGrade >= 5.00)
                .sorted(Comparator.comparing(Student::getName)
                        .thenComparing(Student::getAvgGrade, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        String newLine = System.getProperty("line.separator");
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%s -> %.2f%s", result.get(i).name, result.get(i).avgGrade, newLine);
        }
    }

    public static class Student {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Double> getGrades() {
            return Grades;
        }

        public void setGrades(ArrayList<Double> grades) {
            Grades = grades;
        }

        public String name;
        public ArrayList<Double> Grades;


        public double getAvgGrade() {
            return avgGrade;
        }

        public void setAvgGrade(double avgGrade) {
            this.avgGrade = avgGrade;
        }

        public double avgGrade;
    }
}
