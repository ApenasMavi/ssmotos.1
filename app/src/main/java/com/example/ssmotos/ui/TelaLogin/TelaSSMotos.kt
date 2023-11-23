package com.example.ssmotos.ui.TelaLogin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun TelaSSMotos(
    espacoDasBarras: PaddingValues,
    controleNavegacao: NavController
){

    Column(
        modifier = Modifier.padding(espacoDasBarras)
    ) {
        Text(
            text = "Funcionou"
        )

        Button(
            onClick = { controleNavegacao.navigate("Telalogin") }
        ) {

        }
    }
}