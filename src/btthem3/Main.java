package btthem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        int a = Integer.parseInt(scanner.nextLine());  // đàu tiên  khai báo kiểu chuỗi là scannẻr.nẽxtline. sau đó chuyển nó sang dạng dữ liệu số nguyên intergẻr.parseint rồi gán cho a
        System.out.println("input b");
        int b = Integer.parseInt(scanner.nextLine());
//        scanner.nextLine(); loại bỏ kí tự trắng
        System.out.println("nhap vao phep tinh");
        char phepTinh = scanner.nextLine().charAt(0);
        switch (phepTinh){
            case '+':
                System.out.println("tong hai so la" + (a+b));
                break;
            case '-':
                System.out.println("hieu cua hai so la" + (a-b));
                break;
            case '*':
                System.out.println("tich cua hai so la: " + (a*b));
                break;
            case '/':
                System.out.println("thuong cua hai so la"+ (a/b));
            default:
                System.out.println("nhap lai");
        }
    }
}

//int %d Interger.paseInt
// float %f Float
//double %f Double
// char %c Char
// string %s string
// boolean % Boolean
