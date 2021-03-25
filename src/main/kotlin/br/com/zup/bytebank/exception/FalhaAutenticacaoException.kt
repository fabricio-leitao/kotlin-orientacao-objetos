package br.com.zup.bytebank.exception

import java.lang.Exception

class FalhaAutenticacaoException(mensagem: String = "Falha na autenticação") : Exception(mensagem)