package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
public class SyntaxException extends Exception {
    public String expression;
    public String message;
    public int position;

    public SyntaxException set(String str, int i10) {
        this.message = str;
        this.position = i10;
        fillInStackTrace();
        return this;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SyntaxException: " + this.message + " in '" + this.expression + "' at position " + this.position;
    }
}
