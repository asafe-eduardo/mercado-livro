package com.mercadolivro.repository

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CustomerModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookModel, Int> {

    fun findByNameContaining(name:String): List<BookModel>
    fun findByStatus(ativo: BookStatus): List<BookModel>
    fun findByCustomer(customer: CustomerModel): List<BookModel>

    fun findAll(pageable: Pageable): Page<BookModel>

    fun findByStatus(ativo: BookStatus, pageable: Pageable): Page<BookModel>


}