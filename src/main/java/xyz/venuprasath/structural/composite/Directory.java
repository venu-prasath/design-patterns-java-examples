package xyz.venuprasath.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "Directory: " + name);
        for (FileSystemComponent child : children) {
            child.print(prefix + "   ");
        }
    }
}

