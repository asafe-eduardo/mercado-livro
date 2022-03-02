package com.mercadolivro.controller.response

data class ErrorReponse(
    var httpCode: Int,
    var message: String,
    var internalCode: String,
    var errors: List<FieldErrorResponse>?
)