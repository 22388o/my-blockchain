package com.milkygreen.blockchain.vm;

/**
 * Token类型
 */
public enum TokenType {

    // 单字符 tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // 单或双字符 tokens.
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,PLUS_PLUS,MINUS_MINUS,

    // 变量名、字面量
    IDENTIFIER, STRING, NUMBER,

    // 关键字.
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE, BREAK,

    EOF

}
