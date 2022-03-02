package com.mercadolivro.controller.response

data class PageResponse<T>(
    var items: List<T>,
    var currentPage: Int,
    var totalPages: Long,
    var totalItems: Int,
)