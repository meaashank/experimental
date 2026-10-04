package org.javia.arity;

import B0.C0922f;
import android.support.v4.media.a;
import androidx.activity.result.i;
import androidx.compose.runtime.R0;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
class SimpleCodeGen extends TokenConsumer {
    static final SyntaxException HAS_ARGUMENTS = new SyntaxException();
    SyntaxException exception;
    Symbols symbols;
    ByteStack code = new ByteStack();
    DoubleStack consts = new DoubleStack();
    FunctionStack funcs = new FunctionStack();

    public SimpleCodeGen(SyntaxException syntaxException) {
        this.exception = syntaxException;
    }

    public CompiledFunction getFun() {
        return new CompiledFunction(0, this.code.toArray(), this.consts.getRe(), this.consts.getIm(), this.funcs.toArray());
    }

    public Symbol getSymbol(Token token) throws SyntaxException {
        byte b10;
        String strA = token.name;
        boolean zIsDerivative = token.isDerivative();
        if (zIsDerivative) {
            if (token.arity != 1) {
                throw this.exception.set("Derivative expects arity 1 but found " + token.arity, token.position);
            }
            strA = C0922f.a(strA, 1, 0);
        }
        Symbol symbolLookup = this.symbols.lookup(strA, token.arity);
        if (symbolLookup == null) {
            SyntaxException syntaxException = this.exception;
            StringBuilder sbA = i.a("undefined '", strA, "' with arity ");
            sbA.append(token.arity);
            throw syntaxException.set(sbA.toString(), token.position);
        }
        if (zIsDerivative && (b10 = symbolLookup.op) > 0 && symbolLookup.fun == null) {
            symbolLookup.fun = CompiledFunction.makeOpFunction(b10);
        }
        if (zIsDerivative && symbolLookup.fun == null) {
            throw this.exception.set(y.a("Invalid derivative ", strA), token.position);
        }
        return symbolLookup;
    }

    @Override // org.javia.arity.TokenConsumer
    public void push(Token token) throws SyntaxException {
        byte b10 = 1;
        switch (token.f226143id) {
            case 9:
                this.consts.push(token.value, 0.0d);
                break;
            case 10:
            case 11:
                Symbol symbol = getSymbol(token);
                if (!token.isDerivative()) {
                    byte b11 = symbol.op;
                    if (b11 <= 0) {
                        Function function = symbol.fun;
                        if (function == null) {
                            this.consts.push(symbol.valueRe, symbol.valueIm);
                        } else {
                            this.funcs.push(function);
                        }
                    } else {
                        if (b11 >= 38 && b11 <= 42) {
                            throw HAS_ARGUMENTS.set("eval() on implicit function", this.exception.position);
                        }
                        b10 = b11;
                    }
                } else {
                    this.funcs.push(symbol.fun.getDerivative());
                }
                b10 = 2;
                break;
            default:
                b10 = token.vmop;
                if (b10 <= 0) {
                    StringBuilder sbA = a.a("wrong vmop: ", b10, ", id ");
                    sbA.append(token.f226143id);
                    sbA.append(" in \"");
                    throw new Error(R0.a(sbA, this.exception.expression, '\"'));
                }
                break;
        }
        this.code.push(b10);
    }

    public SimpleCodeGen setSymbols(Symbols symbols) {
        this.symbols = symbols;
        return this;
    }

    @Override // org.javia.arity.TokenConsumer
    public void start() {
        this.code.clear();
        this.consts.clear();
        this.funcs.clear();
    }
}
