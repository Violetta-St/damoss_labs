package Lab1.Individual;

import Models.Faculty;
import Models.HeadOf;

public class IndividualTaskAnonymous {
    public static void main(String[] args){
        Faculty faculty1 = new Faculty(1, 3, "Компьютерных технологий и информационной безопасности",
                "КТиИБ", "+79899898998",
                new Faculty.facultyHead("Тищенко", "Евгений", "Николаевич", HeadOf.academicDegree.professor));
        getAddress(faculty1);
        Faculty faculty2 = new Faculty(2, 1, "Факультет Менеджмента и предпринимательства",
                "МиП", "+79899898998",
                new Faculty.facultyHead("Суржиков", "Михаил", "Андреевич", HeadOf.academicDegree.professor));
        getAddress(faculty2);
    }
    public static void getAddress(Faculty faculty){

        GetAddress turgenevskaya = new GetAddress() {
            @Override
            public void getFacultyAddress(Faculty faculty) {
                System.out.println("Факультет "+ faculty.getFacultyName()
                        + " находится в учебном корпусе по адресу  г. Ростов-на-Дону, ул. Тургеневская, 49");
            }
        };
        GetAddress sadovaya = new GetAddress() {
            @Override
            public void getFacultyAddress(Faculty faculty) {
                System.out.println("Факультет "+ faculty.getFacultyName()
                        + " находится в учебном корпусе по адресу  г. Ростов-на-Дону, ул. Большая Садовая, 69/47");
            }
        };
        GetAddress ostrovskogo = new GetAddress() {
            @Override
            public void getFacultyAddress(Faculty faculty) {
                System.out.println("Факультет "+ faculty.getFacultyName()
                        + " находится в учебном корпусе по адресу  г. Ростов-на-Дону, пер. Островского, 62");
            }
        };
        GetAddress gorkogo = new GetAddress() {
            @Override
            public void getFacultyAddress(Faculty faculty) {
                System.out.println("Факультет "+ faculty.getFacultyName()
                        + " находится в учебном корпусе по адресу  г. Ростов-на-Дону, ул. Максима Горького, 166");
            }
        };
        switch (faculty.getFacultyNumber()) {
            case 1 -> ostrovskogo.getFacultyAddress(faculty);
            case 6 -> gorkogo.getFacultyAddress(faculty);
            case 7 -> turgenevskaya.getFacultyAddress(faculty);
            default -> sadovaya.getFacultyAddress(faculty);
        }
    }
}
