package org.javia.arity;

import java.util.Vector;

/* JADX INFO: loaded from: classes6.dex */
class DeclarationParser extends TokenConsumer {
    static final int MAX_ARITY = 5;
    static final String[] NO_ARGS = new String[0];
    static final int UNKNOWN_ARITY = -2;
    Vector args = new Vector();
    int arity;
    private SyntaxException exception;
    String name;

    public DeclarationParser(SyntaxException syntaxException) {
        this.exception = syntaxException;
    }

    public String[] argNames() {
        int i10 = this.arity;
        if (i10 <= 0) {
            return NO_ARGS;
        }
        String[] strArr = new String[i10];
        this.args.copyInto(strArr);
        return strArr;
    }

    @Override // org.javia.arity.TokenConsumer
    public void push(Token token) throws SyntaxException {
        switch (token.f226143id) {
            case 10:
                if (this.name == null) {
                    this.name = token.name;
                    this.arity = -2;
                    return;
                } else {
                    if (this.arity < 0) {
                        throw this.exception.set("Invalid declaration", token.position);
                    }
                    this.args.addElement(token.name);
                    int i10 = this.arity + 1;
                    this.arity = i10;
                    if (i10 <= 5) {
                        return;
                    }
                    throw this.exception.set("Arity too large " + this.arity, token.position);
                }
            case 11:
                if (this.name != null) {
                    throw this.exception.set("repeated CALL in declaration", token.position);
                }
                this.name = token.name;
                this.arity = 0;
                return;
            case 12:
            case 14:
            case 15:
                return;
            case 13:
            default:
                throw this.exception.set("invalid token in declaration", token.position);
        }
    }

    @Override // org.javia.arity.TokenConsumer
    public void start() {
        this.name = null;
        this.arity = -2;
        this.args.setSize(0);
    }
}
