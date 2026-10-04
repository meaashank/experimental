package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
public class Symbol {
    static final int CONST_ARITY = -3;
    private int arity;
    Function fun;
    boolean isConst;
    private String name;
    byte op;
    double valueIm;
    double valueRe;

    private Symbol(String str, int i10, byte b10, boolean z10, int i11) {
        this.isConst = false;
        setKey(str, i10);
        this.op = b10;
        this.isConst = z10;
    }

    public static Symbol makeArg(String str, int i10) {
        return new Symbol(str, -3, (byte) (i10 + 38), false, 0);
    }

    public static Symbol makeVmOp(String str, int i10) {
        return new Symbol(str, VM.arity[i10], (byte) i10, true, 0);
    }

    public static Symbol newEmpty(Symbol symbol) {
        return new Symbol(symbol.name, symbol.arity, (byte) 0, false, 0);
    }

    public boolean equals(Object obj) {
        Symbol symbol = (Symbol) obj;
        return this.name.equals(symbol.name) && this.arity == symbol.arity;
    }

    public int getArity() {
        int i10 = this.arity;
        if (i10 == -3) {
            return 0;
        }
        return i10;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + this.arity;
    }

    public boolean isEmpty() {
        return this.op == 0 && this.fun == null && this.valueRe == 0.0d && this.valueIm == 0.0d;
    }

    public Symbol setKey(String str, int i10) {
        this.name = str;
        this.arity = i10;
        return this;
    }

    public String toString() {
        return "Symbol '" + this.name + "' arity " + this.arity + " val " + this.valueRe + " op " + ((int) this.op);
    }

    public Symbol(String str, Function function) {
        this.isConst = false;
        setKey(str, function.arity());
        this.fun = function;
    }

    public Symbol(String str, double d10, boolean z10) {
        this(str, d10, 0.0d, z10);
    }

    public Symbol(String str, double d10, double d11, boolean z10) {
        this.isConst = false;
        setKey(str, -3);
        this.valueRe = d10;
        this.valueIm = d11;
        this.isConst = z10;
    }
}
