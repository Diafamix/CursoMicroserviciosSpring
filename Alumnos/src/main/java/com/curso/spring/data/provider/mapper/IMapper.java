package com.curso.spring.data.provider.mapper;

public interface IMapper<T,R> {

    R mapToDto (T t);

    T mapToEntity (R r);
}
