/*import com.sun.jdi.InterfaceType;
import java.io.File;
import java.io.FileWriter;
import java.lang.classfile.Interfaces;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

 */

/*Single
interface A{
    void C();
    void D();
}
class B implements A{
    public void C(){
        System.out.println("Add");
    }
public void D(){
    System.out.println("Sub");
    }
}

public class Interface {
    public static void main(String[] args) {
        B obj=new B();
        obj.C();
        obj.D();
    }
}
 */
/*Multiple
interface Animal {
    void bbyanimal();
}
interface Animal1 {
    void bbyanimal1();
}
class Biganimal implements Animal,Animal1 {
    public void bbyanimal(){
        System.out.println("bby");
    }
    public void bbyanimal1(){
        System.out.println("bby1");
    }
}

public class Interface {
    public static void main(String[] args) {
        Biganimal obj = new Biganimal();
        obj.bbyanimal();
        obj.bbyanimal1();
    }
}
 */
/*Multilevel
interface Animal{
    void dog();
}
interface Animal1 extends Animal{
    void lion();
}
class Animal2 implements Animal1{
    public void dog(){
        System.out.println("Bow Bow");
    }
    public void lion(){
        System.out.println("heyyyyyyyyy");
}
}
public class Interface {
    public static void main(String[] args) {
        Animal2 obj = new Animal2();
        obj.dog();
        obj.lion();
    }
}
 */
/*Hirerchy
interface Animal{
    void dog();
    void lion();
}
class Animal2 implements Animal {
    public void dog() {
        System.out.println("Bow Bow");
    }
    public void lion() {

    }
    class Animal3 implements Animal {
        public void lion() {
            System.out.println("heyyyyyyyyy");
        }
            public void dog() {
            }
        }
    }

    public class Interface {
        public static void main(String[] args) {
            Animal2 obj = new Animal2();
            obj.dog();
            Animal2.Animal3 obj2 =obj.new Animal3();
            obj2.lion();
        }
    }*/
/*
    public class Interface {
        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5, 6};
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            System.out.println(a[3]);
            System.out.println(a[4]);
            System.out.println(a[5]);
        }
    }
 */
/*
public class Interface {
    public static void main(String[] args) {
        int[] a = {'H', 'e', 'l', 'l'};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
 */
/*arrary
public class Interface {
    public static void main(String[] args) {
        double[] a = {1.0, 1.1, 1.2, 1.4};
        for (int i = 0; i < a.length; i++){
    }
    double sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum:"+sum);
        }
    }
 */
/*
public class Interface {
    public static void main(String[] args) {
        int[] a = {22, 23, 24, 25, 26};
        int max = a[0]; // Initialize max with the first element of the array

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) { // Check if the current element is greater than max
                max = a[i];
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}
*/

/*
public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the matrices:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] result = new int[row][col];

        // Input first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

           }
}*/
/*2D
public class Interface {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

                // Input dimensions
                System.out.println("Enter the number of rows and columns for the first matrix:");
                int row1 = sc.nextInt();
                int col1 = sc.nextInt();
                System.out.println("Enter the number of rows and columns for the second matrix:");
                int row2 = sc.nextInt();
                int col2 = sc.nextInt();

                // Check for valid dimensions for multiplication
                if (col1 != row2) {
                    System.out.println("Matrix multiplication is not possible with these dimensions.");
                    return;
                }

                // Declare matrices
                int[][] a = new int[row1][col1];
                int[][] b = new int[row2][col2];
                int[][] result = new int[row1][col2];

                // Input elements for the first matrix
                System.out.println("Enter the elements of the first matrix:");
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col1; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }

                // Input elements for the second matrix
                System.out.println("Enter the elements of the second matrix:");
                for (int i = 0; i < row2; i++) {
                    for (int j = 0; j < col2; j++) {
                        b[i][j] = sc.nextInt();
                    }
                }

                // Perform matrix multiplication
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col2; j++) {
                        result[i][j] = 0; // Initialize the result matrix element
                        for (int k = 0; k < col1; k++) {
                            result[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }

                // Print the result matrix
                System.out.println("Result of matrix multiplication:");
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col2; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
 /*Exception
public class Interface {
    public static void main(String[] args) {
        int a = 11, b = 0;
        try {
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }
 */
/*
public class Interface {
    public static void main(String[] args) {
        int[] array = new int[4];
        int a = 11, b = 110;
        try {
            System.out.println(a / b);
            for (int i = 0; i <= 4; i++) {
            }
            }
        catch(ArithmeticException e){
                    System.out.println("Any number divied by zero is exception" + e);
                }
        catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Check the array memory" + e);
                }
        catch(Exception e){
                    System.out.println(e);
                }
            }
        }
 */
/*
import java.io.File;
import java.io.FileReader;
public class Interface {
    public static void main(String[] args)   throws Exception{
        File fi = new File("C://file.txt");
        FileReader fr = new FileReader(fi);
        }
    }
 */
/*
class hai {
    public void show1() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Tata");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class hello {
    public void show1() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Strive");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
public class Interface {
            public static void main(String[] args) {
                hai obj = new hai();
                hello obj1 = new hello();
                obj.show1();
                obj1.show1();
            }
        }
 */
/*
class hai extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Tata");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class hello extends Thread{
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Strive");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
public class Interface {
    public static void main(String[] args) {
        hai obj = new hai();
        hello obj1 = new hello();
        obj.run();
        obj1.run();
    }
}
 */
/*
class School extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Tata");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class Puc extends Thread{
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Strive");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class Degree extends Thread{
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Skills Development");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
public class Interface {
    public static void main(String[] args) {
        School obj = new School();
        Puc obj1 = new Puc();
        Degree obj2 = new Degree();
        obj.run();
        obj1.run();
        obj2.run();
    }
}
 */
/*
class hai implements Runnable {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Tata");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class hello implements Runnable {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Strive");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
public class Interface {
    public static void main(String[] args) {
        hai obj = new hai();
        hello obj1 = new hello();
        Thread thread=new Thread(obj);
        Thread thread1=new Thread(obj1);

        thread.run();
        thread1.run();
    }
} */
/*Collection Framework
public class Interface {
    public static void main(String[] args) {
        Collection obj = new ArrayList();
        obj.add(10);
        obj.add(11);
        obj.add(11);
        obj.add("Prathap");
        obj.remove(11);
        System.out.println(obj);
    }
}
 */
/*using String generic(<>)
public class Interface {
    public static void main(String[] args) {
        Collection<String> obj = new ArrayList();
        obj.add("Prathap");
        obj.add("Jayanth");
        obj.add("Dhanu");
        obj.add("Akshi");
        obj.remove("Prathap");
        System.out.println("Names:"+obj);
    }
}
 */
/*
        public class Interface {
    public static void main(String[] args) {
        List obj = new ArrayList();
        obj.add("Prathap");
        obj.add("Kolar");
        obj.add("FOOD");
        obj.add("VEERANNAPALAYA");
        obj.add(2,"Masjestic");
        obj.add(22);
        System.out.println("Names:" + obj);
        obj.remove(2);
        System.out.println("Removed the masjastic elements Successfully:" +obj);
    }
}
/*ArrayList class Example
public class Interface {
    public static void main(String[] args) {
        List obj = new ArrayList();
        obj.add("Prathap");
        obj.add("Kolar");
        obj.add("FOOD");
        obj.add("VEERANNAPALAYA");
        obj.add(2,"Masjestic");
        obj.add(22);
        System.out.println("Names:" + obj);
        obj.remove(2);
        System.out.println("Removed the masjastic elements Successfully:" +obj);
    }
}
 */
/*LinkedList class Example
public class Interface {
    public static void main(String[] args) {
        List obj = new LinkedList();
        obj.add("First name:Prathap");
        obj.add("Last name:Gowda");
        obj.add("10th:Gnana Deepa");
        obj.add("12th:SDC");
        obj.add("UG:SDC");
        obj.add("Roll no:1122");
        System.out.println("Student Education Details:" + obj);
        obj.add("Branch:MCA");
        System.out.println("Branch:" + obj);
        obj.add("Address:Kolar");
        System.out.println("Address:" + obj);
        obj.remove("10th:Gnana Deepa");
        System.out.println("Heyy 10th School is removed Successfully:" + obj);
        obj.remove(2);
        System.out.println("Heyy using Index School name is removed Successfully:" + obj);
    }
}
 */
/*SET
import java.util.HashSet;
import java.util.Set;
public class Interface{
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("BAnana");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);
    }
}
 */
/*Hashset(Randem order)
import java.util.HashSet;
import java.util.Set;
import java.util. TreeSet;
import java.util.HashSet;
public class Interface{
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
        numbers.add(11);
        numbers.add(15);
        numbers.add(31);
        numbers.add(23);
        System.out.println(numbers);

    }
}
 */
/*
import java.util.HashSet;
import java.util.Set;
import java.util. TreeSet;
import java.util.HashSet;
public class Interface{
    public static void main(String[] args) {
        Set<String> numbers=new HashSet<>();
        numbers.add("Prathap");
        numbers.add("Ganesh");
        numbers.add("Anoop");
        numbers.add("Moni");
        System.out.println(numbers);

    }
}
 */
/*LinkedHashSet
import java.util.HashSet;
import java.util.Set;
import java.util. TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Interface{
    public static void main(String[] args) {
        Set<String> numbers=new LinkedHashSet<>();
        numbers.add("Prathap");
        numbers.add("Ganesh");
        numbers.add("Anoop");
        numbers.add("Moni");
        System.out.println(numbers);

    }
}
 */
/*Stack
import java.util.HashSet;
import java.util.Set;
import java.util. TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
public class Interface{
    public static void main(String[] args) {
        Stack<Integer> numbers=new Stack<>();
        numbers.add(11);
        numbers.add(13);
        numbers.add(44);
        numbers.add(55);
        numbers.push(59);
        numbers.pop();
        System.out.println(numbers);

    }
}
 */
/*
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.ArrayDeque;
public class Interface {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(11);
        numbers.offer(13);
        numbers.offer(44);
        numbers.offer(55);
        System.out.println("Remove the elements using this method:"+numbers.poll());
        System.out.println("Front elements using this method:"+numbers.peek());
    }
}
 */
/*File handling(Create) in first way of creating
import java.io.File;
import java.io.IOException;
public class Interface {
    public static void main(String[] args) throws IOException {
        String fileName="Example.txt";
        File file=new File(fileName);
        if(file.createNewFile()) {
            System.out.println("file created Successfully");
        }
        else{
            System.out.println("File already exists or filed to create!");

        }
    }

    }
 */
/*Syntax:FileOutputStream fos=new FileOutputStream("example.txt");
import java.io.FileOutputStream;
import java.io.IOException;
public class Interface {
    public static void main(String[] args){
        String fileName="Example11";
        try(FileOutputStream fos=new FileOutputStream(fileName)) {
            System.out.println("File create Successfully!");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
 */
/*Insert the data
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class Interface {
    public static void main(String[] args) {
        String fileName = "Example11";
        try {
            Files.write(Paths.get(fileName), "Hey Prathap,How are you,how it's going.Heyy TATA Strive how the full stack class is going, is it ok.My name is Prathap Gowda i panning join ghe TATA Strive could you please help with how class in the TATA Strive. ".getBytes());
            System.out.println("File create Successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */
/*Create the file and write the content in that file.
import java.nio.file.Files;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Interface {
    public static void main(String[] args) {
        String fileName = "Example13";
        File file=new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File create Successfully");
            } else {
                System.out.println("File is already exists");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("To TATA Strive");
            System.out.println("Content written to file successfully");
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */
/*
import java.nio.file.Files;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
public class Interface {
    public static void main(String[] args) {
        String fileName = "Example13";
        String content="HEllo TATA Strive";
        try(FileOutputStream fos=new FileOutputStream(fileName)) {
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            Sys n  tem.out.println("Content written to file successfully");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */
/*read the file
import java.io.FileReader;
import java.io.IOException;
public class Interface {
    public static void main(String[] args) {
        String fileName = "Example13";
        try(FileReader reader=new FileReader("Example13.txt")){
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        }
    }
 */
/*FileInputStream
import java.io.FileInputStream;
import java.io.IOException;
public class Interface {
    public static void main(String[] args) {
        String fileName = "Example13";
        try(FileInputStream reader=new FileInputStream("Example13")){
            int byteValue;
            while ((byteValue = reader.read()) != -1) {
                System.out.print((char) byteValue);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
 */
/*
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.nio.file.Path;
import java.io.IOException;
public class Interface {
    public static void main(String[] args) {
        String fileName = "Example13";
        try{
            List<String> Lines= Files.readAllLines(Path.of(fileName));
            for(String Line:Lines){
                System.out.print(Line);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
 */
/*delete the file
import java.io.File;
public class Interface {
    public static void main(String[] args) {
        File file=new File("example13");
        if(file.exists()){
            if(file.delete()) {
                System.out.println("file deleted Successfully");
            }
            else{
                System.out.println("failed to delete the file");
            }
            }else{
            System.out.println("file does not exit");
        }
        }
        }

 */
/*
static variables
class Movitickets {
    static int price1;
    static String moviname1;
    static int seatnumber1;

    public void ugram() {
        System.out.println("price1: " + price1 + ", moviname1: " + moviname1 + ", seatnumber1: " + seatnumber1);

    }
}
        public class Interface {
            public static void main(String[] args) {
                Movitickets name = new Movitickets();
                name.price1 = 100;
                name.moviname1 = "KGF";
                name.seatnumber1 = 31;
                Movitickets.moviname1="moti";
                Movitickets name1 = new Movitickets();
                name1.price1 = 101;
                name1.moviname1 = "KGF part1";
                name1.seatnumber1 = 34;
                Movitickets.moviname1="moti";
                name1.ugram();
                name.ugram();
            }
        }
 */
/*static method
class Movitickets {
    int price1;
    String moviname1;
    static int seatnumber1;

    public void ugram() {
        System.out.println("price1: " + price1 + ", moviname1: " + moviname1 + ", seatnumber1: " + seatnumber1);

    }
    public static void ugram1(Movitickets name1){
        System.out.println("price1: " +name1.price1 + ", moviname1: " + name1.moviname1 + ", seatnumber1: " + seatnumber1);
    }
}
public class Interface {
    public static void main(String[] args) {
        Movitickets name = new Movitickets();
        name.price1 = 100;
        name.moviname1 = "KGF";
        name.seatnumber1 = 31;
        Movitickets.ugram1(name);
        Movitickets name1 = new Movitickets();
        name1.price1 = 101;
        name1.moviname1 = "KGF part1";
        name1.seatnumber1 = 34;
        Movitickets.ugram1(name1);

    }
}
 */
/*
class Prathap {
    int a = 33;
    static String name = "hh";

    public void priya() {
        System.out.println("a:" + a);
        System.out.println("String:" + name);
    }

    static void priya1() {
        System.out.println("String:" + name);
    }
}

    public class Interface {
        public static void main(String[] args) {
            Prathap p = new Prathap();
            p.priya();
            Prathap.priya1();

        }
    }
 */
/*edit configuration and pass the arguments in the commandline
public class Interface {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
 */
/*
public class Interface {
    public static void main(String[] args) {
        //int a=Integer.parseInt(args[0]);
        //int b=Integer.parseInt(args[1]);
        String fname=args[0];
        String lname=args[1];
        System.out.println(fname+lname);

    }
}
 */

/*
 interface I {
    default void phone() {
        System.out.println("phone1");
    }

    interface J {
        default void phone() {
            System.out.println("phone2");
        }
    }

    class A {
        public void phone() {
            System.out.println("phone3");
        }
    }

    public class Interface implements J {
        public static void main(String[] args) {
            Interface i = new Interface();
            i.phone();
        }
    }
}
 */
class carshowroom{
    static String cars="hyundai";
    public static void Cars(String i20,String creta){
        System.out.println("i20 CRDI:"+i20+","+creta);
    }
}
public class Interface {
    public static void main(String[] args) {
        carshowroom.Cars("DISEL","PETROL");
    }
}