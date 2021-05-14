package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}