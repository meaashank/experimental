package org.javia.arity;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;
import kotlin.time.j;

/* JADX INFO: loaded from: classes6.dex */
public class Symbols {
    private static final Symbol[] builtin;
    private static final String[] defines;
    private static Symbol shell = new Symbol(null, 0.0d, false);
    private final Compiler compiler = new Compiler();
    private Hashtable symbols = new Hashtable();
    private HashSet<Symbol> delta = null;
    private Stack<HashSet<Symbol>> frames = new Stack<>();

    static {
        Vector vector = new Vector();
        for (byte b10 : VM.builtins) {
            vector.addElement(Symbol.makeVmOp(VM.opcodeName[b10], b10));
        }
        String[] strArr = {"x", "y", "z"};
        for (byte b11 = 0; b11 < 3; b11 = (byte) (b11 + 1)) {
            vector.addElement(Symbol.makeArg(strArr[b11], b11));
        }
        vector.addElement(new Symbol("pi", 3.141592653589793d, true));
        vector.addElement(new Symbol("π", 3.141592653589793d, true));
        vector.addElement(new Symbol("e", 2.718281828459045d, true));
        vector.addElement(new Symbol(j.f218437k, Double.POSITIVE_INFINITY, true));
        vector.addElement(new Symbol("infinity", Double.POSITIVE_INFINITY, true));
        vector.addElement(new Symbol("Inf", Double.POSITIVE_INFINITY, true));
        vector.addElement(new Symbol("inf", Double.POSITIVE_INFINITY, true));
        vector.addElement(new Symbol("∞", Double.POSITIVE_INFINITY, true));
        vector.addElement(new Symbol("NaN", Double.NaN, true));
        vector.addElement(new Symbol("nan", Double.NaN, true));
        vector.addElement(new Symbol("i", 0.0d, 1.0d, true));
        vector.addElement(new Symbol(W0.j.f76474a, 0.0d, 1.0d, false));
        Symbol[] symbolArr = new Symbol[vector.size()];
        builtin = symbolArr;
        vector.copyInto(symbolArr);
        defines = new String[]{"log(x)=ln(x)*0.43429448190325182765", "log10(x)=log(x)", "lg(x)=log(x)", "log2(x)=ln(x)*1.4426950408889634074", "lb(x)=log2(x)", "log(base,x)=ln(x)/ln(base)", "gamma(x)=(x-1)!", "deg=0.017453292519943295", "indeg=57.29577951308232", "sind(x)=sin(x deg)", "cosd(x)=cos(x deg)", "tand(x)=tan(x deg)", "asind(x)=asin(x) indeg", "acosd(x)=acos(x) indeg", "atand(x)=atan(x) indeg", "tg(x)=tan(x)", "tgd(x)=tand(x)"};
    }

    public Symbols() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Symbol[] symbolArr = builtin;
            if (i11 < symbolArr.length) {
                add(symbolArr[i11]);
                i11++;
            } else {
                while (true) {
                    try {
                        i10++;
                    } catch (SyntaxException e10) {
                        throw new Error("" + e10);
                    }
                }
            }
        }
        String[] strArr = defines;
        if (i10 >= strArr.length) {
            return;
        }
        define(compileWithName(strArr[i10]));
        i10++;
    }

    public static boolean isDefinition(String str) {
        return str.indexOf(61) != -1;
    }

    public void add(Symbol symbol) {
        Symbol symbolNewEmpty = (Symbol) this.symbols.put(symbol, symbol);
        if (symbolNewEmpty != null && symbolNewEmpty.isConst) {
            this.symbols.put(symbolNewEmpty, symbolNewEmpty);
            return;
        }
        if (this.delta == null) {
            this.delta = new HashSet<>();
        }
        if (this.delta.contains(symbol)) {
            return;
        }
        HashSet<Symbol> hashSet = this.delta;
        if (symbolNewEmpty == null) {
            symbolNewEmpty = Symbol.newEmpty(symbol);
        }
        hashSet.add(symbolNewEmpty);
    }

    public void addArguments(String[] strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            add(Symbol.makeArg(strArr[i10], i10));
        }
    }

    public synchronized Function compile(String str) throws SyntaxException {
        return this.compiler.compile(this, str);
    }

    public synchronized FunctionAndName compileWithName(String str) throws SyntaxException {
        return this.compiler.compileWithName(this, str);
    }

    public synchronized void define(String str, Function function) {
        try {
            if (function instanceof Constant) {
                define(str, function.eval());
            } else {
                add(new Symbol(str, function));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized double eval(String str) throws SyntaxException {
        return this.compiler.compileSimple(this, str).eval();
    }

    public synchronized Complex evalComplex(String str) throws SyntaxException {
        return this.compiler.compileSimple(this, str).evalComplex();
    }

    public Symbol[] getAllSymbols() {
        Symbol[] symbolArr = new Symbol[this.symbols.size()];
        this.symbols.keySet().toArray(symbolArr);
        return symbolArr;
    }

    public String[] getDictionary() {
        Symbol[] allSymbols = getAllSymbols();
        int length = allSymbols.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = allSymbols[i10].getName();
        }
        return strArr;
    }

    public Symbol[] getTopFrame() {
        HashSet<Symbol> hashSet = this.delta;
        return hashSet == null ? new Symbol[0] : (Symbol[]) hashSet.toArray(new Symbol[0]);
    }

    public synchronized Symbol lookup(String str, int i10) {
        return (Symbol) this.symbols.get(shell.setKey(str, i10));
    }

    public Symbol lookupConst(String str) {
        return lookup(str, -3);
    }

    public synchronized void popFrame() {
        try {
            HashSet<Symbol> hashSet = this.delta;
            if (hashSet != null) {
                for (Symbol symbol : hashSet) {
                    if (symbol.isEmpty()) {
                        this.symbols.remove(symbol);
                    } else {
                        this.symbols.put(symbol, symbol);
                    }
                }
            }
            this.delta = this.frames.pop();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void pushFrame() {
        this.frames.push(this.delta);
        this.delta = null;
    }

    public synchronized void define(FunctionAndName functionAndName) {
        String str = functionAndName.name;
        if (str != null) {
            define(str, functionAndName.function);
        }
    }

    public synchronized void define(String str, double d10) {
        add(new Symbol(str, d10, 0.0d, false));
    }

    public synchronized void define(String str, Complex complex) {
        add(new Symbol(str, complex.re, complex.im, false));
    }
}
