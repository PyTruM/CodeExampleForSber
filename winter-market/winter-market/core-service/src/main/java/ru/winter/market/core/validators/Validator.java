package ru.winter.market.core.validators;

public interface Validator<E> {
    void validate(E e);
}
