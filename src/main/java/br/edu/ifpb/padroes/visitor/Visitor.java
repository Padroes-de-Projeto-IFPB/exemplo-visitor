package br.edu.ifpb.padroes.visitor;

import br.edu.ifpb.padroes.Circle;
import br.edu.ifpb.padroes.CompoundShape;
import br.edu.ifpb.padroes.Dot;
import br.edu.ifpb.padroes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}