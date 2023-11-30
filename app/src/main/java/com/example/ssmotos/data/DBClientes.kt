package com.example.ssmotos.data

import com.example.ssmotos.model.Clientes
import com.example.ssmotos.ui.TelaLogin.ListaServicos

class DBClientes {
    fun carregaListaServicos(): List<Clientes>{
        return listOf<Clientes>(
            Clientes("Victor Hugo", "CB300T", imagem =  )
        )
    }
}