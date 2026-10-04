package kotlin.coroutines.jvm.internal;

import Vc.l;
import kotlin.InterfaceC4887e0;
import kotlin.coroutines.e;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements C<Object>, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217697a;

    public RestrictedSuspendLambda(int i10, @Nullable e<Object> eVar) {
        super(eVar);
        this.f217697a = i10;
    }

    @Override // kotlin.jvm.internal.C
    public int getArity() {
        return this.f217697a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strW = O.w(this);
        G.o(strW, "renderLambdaToString(...)");
        return strW;
    }

    public RestrictedSuspendLambda(int i10) {
        this(i10, null);
    }
}
