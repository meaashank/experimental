package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class Declaration {
    private static final String[] NO_ARGS = new String[0];
    String[] args;
    int arity;
    String expression;
    String name;

    public void parse(String str, Lexer lexer, DeclarationParser declarationParser) throws SyntaxException {
        int iIndexOf = str.indexOf(61);
        if (iIndexOf == -1) {
            this.expression = str;
            this.name = null;
            this.args = NO_ARGS;
            this.arity = -2;
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        this.expression = str.substring(iIndexOf + 1);
        lexer.scan(strSubstring, declarationParser);
        this.name = declarationParser.name;
        this.args = declarationParser.argNames();
        this.arity = declarationParser.arity;
    }
}
