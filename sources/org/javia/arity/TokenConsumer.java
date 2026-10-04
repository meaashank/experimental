package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
abstract class TokenConsumer {
    public abstract void push(Token token) throws SyntaxException;

    public void start() {
    }
}
