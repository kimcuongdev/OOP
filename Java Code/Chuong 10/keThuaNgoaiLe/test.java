package keThuaNgoaiLe;

import java.io.EOFException;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        Disk disk = new Disk();
        FloppyDisk fDisk = new FloppyDisk();
        try {
            disk.readFile();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        try {
            fDisk.readFile();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        // disk.readFile();
    }

}
