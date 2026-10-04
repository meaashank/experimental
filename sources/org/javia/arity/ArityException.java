package org.javia.arity;

import androidx.collection.N0;

/* JADX INFO: loaded from: classes6.dex */
public class ArityException extends RuntimeException {
    public ArityException(String str) {
        super(str);
    }

    public ArityException(int i10) {
        this(N0.a("Didn't expect ", i10, " arguments"));
    }
}
