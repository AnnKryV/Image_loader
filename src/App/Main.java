package App;

import App.Adapters.FileReader;

import java.util.Scanner;

public class Main {
    /*1) В папке проектов создайте проект ImageLoader.
2) При помощи шаблона Адаптер (Adapter) реализуйте функционал
универсального инструмента для просмотра файлов изображений различного
формата (jpg, png).
3) На вывод: название формата файла, название (с расширением) самого файла.*/
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type of the image: ");
        String type = scanner.nextLine();
        System.out.print("Enter name with this type: ");
        String name = scanner.nextLine();
        fileReader.read(type,name);
        scanner.close();

    }
}
