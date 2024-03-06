package xyz.venuprasath.behavioral.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}