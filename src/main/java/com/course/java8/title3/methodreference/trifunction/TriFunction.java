package com.course.java8.title3.methodreference.trifunction;

public interface TriFunction <T, U, V, R> {
  R apply(T t, U u, V v);
}