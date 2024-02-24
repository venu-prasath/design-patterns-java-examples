package xyz.venuprasath.structural.composite;

public class CompositeCliient {

    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        Directory dir1 = new Directory("Dir1");
        Directory dir2 = new Directory("Dir2");
        Directory rootDir = new Directory("Root");

        dir1.add(file1);
        dir2.add(file2);
        dir2.add(file3);
        rootDir.add(dir1);
        rootDir.add(dir2);

        rootDir.print("");
    }
}
