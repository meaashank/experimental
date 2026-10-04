package kotlin.coroutines.jvm.internal;

import Vc.b;
import kotlin.InterfaceC4887e0;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.i;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@V({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @Nullable
    private final i _context;

    @Nullable
    private transient e<Object> intercepted;

    public ContinuationImpl(@Nullable e<Object> eVar, @Nullable i iVar) {
        super(eVar);
        this._context = iVar;
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public i getContext() {
        i iVar = this._context;
        G.m(iVar);
        return iVar;
    }

    @NotNull
    public final e<Object> intercepted() {
        e<Object> eVarO0 = this.intercepted;
        if (eVarO0 == null) {
            f fVar = (f) getContext().get(f.f217679y3);
            eVarO0 = fVar != null ? fVar.O0(this) : this;
            this.intercepted = eVarO0;
        }
        return eVarO0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        e<?> eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            i.b bVar = getContext().get(f.f217679y3);
            G.m(bVar);
            ((f) bVar).c(eVar);
        }
        this.intercepted = b.f76433a;
    }

    public ContinuationImpl(@Nullable e<Object> eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
