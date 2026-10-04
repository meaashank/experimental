package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class MyFun extends Function {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Function f226142f;
    Symbols symbols;

    public MyFun() {
        Symbols symbols = new Symbols();
        this.symbols = symbols;
        try {
            this.f226142f = symbols.compile("1-x");
        } catch (SyntaxException e10) {
            System.out.println("" + e10);
        }
    }

    @Override // org.javia.arity.Function
    public int arity() {
        return 1;
    }

    @Override // org.javia.arity.Function
    public double eval(double d10) {
        return this.f226142f.eval(d10);
    }
}
