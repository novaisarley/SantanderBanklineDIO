package com.arley.dio.santanderbankline.domain

data class Movimentacao(
    val id : Int,
    val dataHora : String,
    val descricao : String,
    val valor : Double,
    val tipo : TipoMovimentacao,
    //NA API esta como "idConta"
    val idCorrentista : Int
)
