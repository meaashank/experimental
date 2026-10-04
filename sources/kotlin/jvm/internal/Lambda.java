package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Lambda<R> implements C<R>, Serializable {
    private final int arity;

    public Lambda(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.C
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strX = O.x(this);
        G.o(strX, "renderLambdaToString(...)");
        return strX;
    }
}
