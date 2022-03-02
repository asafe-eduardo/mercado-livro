package com.mercadolivro.controller.response

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.CustomerModel
import java.math.BigDecimal

data class BookResponse (
    var id: Int? = null,
    var name: String,
    var price: BigDecimal,
    var status: BookStatus? = null,
    var customer: CustomerModel? = null
)
