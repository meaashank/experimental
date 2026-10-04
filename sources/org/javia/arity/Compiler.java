package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class Compiler {
    private final OptCodeGen codeGen;
    private final Declaration decl;
    private final DeclarationParser declParser;
    private final SyntaxException exception;
    private final Lexer lexer;
    private final RPN rpn;
    private final SimpleCodeGen simpleCodeGen;

    public Compiler() {
        SyntaxException syntaxException = new SyntaxException();
        this.exception = syntaxException;
        this.lexer = new Lexer(syntaxException);
        this.rpn = new RPN(syntaxException);
        this.declParser = new DeclarationParser(syntaxException);
        this.codeGen = new OptCodeGen(syntaxException);
        this.simpleCodeGen = new SimpleCodeGen(syntaxException);
        this.decl = new Declaration();
    }

    public Function compile(Symbols symbols, String str) throws SyntaxException {
        Function constant;
        this.decl.parse(str, this.lexer, this.declParser);
        Declaration declaration = this.decl;
        if (declaration.arity == -2) {
            try {
                constant = new Constant(compileSimple(symbols, declaration.expression).evalComplex());
            } catch (SyntaxException e10) {
                if (e10 != SimpleCodeGen.HAS_ARGUMENTS) {
                    throw e10;
                }
                constant = null;
            }
        } else {
            constant = null;
        }
        if (constant == null) {
            symbols.pushFrame();
            symbols.addArguments(this.decl.args);
            try {
                this.rpn.setConsumer(this.codeGen.setSymbols(symbols));
                this.lexer.scan(this.decl.expression, this.rpn);
                symbols.popFrame();
                int i10 = this.decl.arity;
                if (i10 == -2) {
                    i10 = this.codeGen.intrinsicArity;
                }
                constant = this.codeGen.getFun(i10);
            } catch (Throwable th) {
                symbols.popFrame();
                throw th;
            }
        }
        constant.comment = str;
        return constant;
    }

    public Function compileSimple(Symbols symbols, String str) throws SyntaxException {
        this.rpn.setConsumer(this.simpleCodeGen.setSymbols(symbols));
        this.lexer.scan(str, this.rpn);
        return this.simpleCodeGen.getFun();
    }

    public FunctionAndName compileWithName(Symbols symbols, String str) throws SyntaxException {
        return new FunctionAndName(compile(symbols, str), this.decl.name);
    }
}
