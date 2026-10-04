package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class OptCodeGen extends SimpleCodeGen {
    EvalContext context;
    int intrinsicArity;
    private boolean isPercent;
    int sp;
    Complex[] stack;
    byte[] traceCode;
    double[] traceConstsIm;
    double[] traceConstsRe;
    Function[] traceFuncs;
    CompiledFunction tracer;

    public OptCodeGen(SyntaxException syntaxException) {
        super(syntaxException);
        EvalContext evalContext = new EvalContext();
        this.context = evalContext;
        this.stack = evalContext.stackComplex;
        this.traceConstsRe = new double[1];
        this.traceConstsIm = new double[1];
        this.traceFuncs = new Function[1];
        this.traceCode = new byte[1];
        this.tracer = new CompiledFunction(0, this.traceCode, this.traceConstsRe, this.traceConstsIm, this.traceFuncs);
    }

    public CompiledFunction getFun(int i10) {
        return new CompiledFunction(i10, this.code.toArray(), this.consts.getRe(), this.consts.getIm(), this.funcs.toArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    @Override // org.javia.arity.SimpleCodeGen, org.javia.arity.TokenConsumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void push(org.javia.arity.Token r12) throws org.javia.arity.SyntaxException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.javia.arity.OptCodeGen.push(org.javia.arity.Token):void");
    }

    @Override // org.javia.arity.SimpleCodeGen, org.javia.arity.TokenConsumer
    public void start() {
        super.start();
        this.sp = -1;
        this.intrinsicArity = 0;
        this.isPercent = false;
    }
}
