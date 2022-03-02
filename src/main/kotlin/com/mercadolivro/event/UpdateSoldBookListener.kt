package com.mercadolivro.event

import com.mercadolivro.service.BookService
import com.mercadolivro.service.PurchaseService
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import java.util.*

@Component
class UpdateSoldBookListener(
    private val bookService: BookService
) {

    @Async
    @EventListener
    fun listener(purchaseEvent: PurchaseEvent) {
        println("Atualizando Status dos livros")
        bookService.purchase(purchaseEvent.purchaseModel.books)
    }
}