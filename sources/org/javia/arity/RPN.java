package org.javia.arity;

import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
class RPN extends TokenConsumer {
    TokenConsumer consumer;
    SyntaxException exception;
    Stack stack = new Stack();
    int prevTokenId = 0;

    public RPN(SyntaxException syntaxException) {
        this.exception = syntaxException;
    }

    public static final boolean isOperand(int i10) {
        return i10 == 8 || i10 == 14 || i10 == 9 || i10 == 10 || i10 == 17;
    }

    private void popHigher(int i10) throws SyntaxException {
        Token pVar = top();
        while (pVar != null && pVar.priority >= i10) {
            this.consumer.push(pVar);
            this.stack.pop();
            pVar = top();
        }
    }

    private Token top() {
        if (this.stack.empty()) {
            return null;
        }
        return (Token) this.stack.peek();
    }

    @Override // org.javia.arity.TokenConsumer
    public void push(Token token) throws SyntaxException {
        int i10 = token.priority;
        int i11 = token.f226143id;
        switch (i11) {
            case 9:
            case 10:
                if (isOperand(this.prevTokenId)) {
                    push(Lexer.TOK_MUL);
                }
                this.consumer.push(token);
                break;
            case 11:
            case 13:
            default:
                if (token.assoc == 1) {
                    if (isOperand(this.prevTokenId)) {
                        push(Lexer.TOK_MUL);
                    }
                    this.stack.push(token);
                } else if (isOperand(this.prevTokenId)) {
                    popHigher(i10 + (token.assoc != 3 ? 0 : 1));
                    this.stack.push(token);
                } else if (i11 != 2) {
                    if (i11 != 1) {
                        throw this.exception.set("operator without operand", token.position);
                    }
                    return;
                } else {
                    token = Lexer.TOK_UMIN;
                    this.stack.push(token);
                }
                break;
            case 12:
                if (!isOperand(this.prevTokenId)) {
                    throw this.exception.set("misplaced COMMA", token.position);
                }
                popHigher(i10);
                Token pVar = top();
                if (pVar == null || pVar.f226143id != 11) {
                    throw this.exception.set("COMMA not inside CALL", token.position);
                }
                pVar.arity++;
                break;
                break;
            case 14:
                int i12 = this.prevTokenId;
                if (i12 == 11) {
                    top().arity--;
                } else if (!isOperand(i12)) {
                    throw this.exception.set("unexpected ) or END", token.position);
                }
                popHigher(i10);
                Token pVar2 = top();
                if (pVar2 != null) {
                    if (pVar2.f226143id == 11) {
                        this.consumer.push(pVar2);
                    } else if (pVar2 != Lexer.TOK_LPAREN) {
                        throw this.exception.set("expected LPAREN or CALL", token.position);
                    }
                    this.stack.pop();
                }
                break;
            case 15:
                Token token2 = Lexer.TOK_RPAREN;
                token2.position = token.position;
                do {
                    push(token2);
                } while (top() != null);
                break;
        }
        this.prevTokenId = token.f226143id;
    }

    public void setConsumer(TokenConsumer tokenConsumer) {
        this.consumer = tokenConsumer;
    }

    @Override // org.javia.arity.TokenConsumer
    public void start() {
        this.stack.removeAllElements();
        this.prevTokenId = 0;
        this.consumer.start();
    }
}
