package Visitor;

import java.util.Date;

public interface IVisitor {
     Date curar(Perro perro);
     Date curar(Gato gato);
     Date curar(Caballo caballo);

}