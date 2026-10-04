package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDraggableState implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<Float, L0> f89304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f89305b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f89306c = new MutatorMutex();

    public static final class a implements j {
        public a() {
        }

        @Override // androidx.compose.foundation.gestures.j
        public void a(float f10) {
            DefaultDraggableState.this.f89304a.invoke(Float.valueOf(f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState(@NotNull ed.l<? super Float, L0> lVar) {
        this.f89304a = lVar;
    }

    @Override // androidx.compose.foundation.gestures.p
    @Nullable
    public Object a(@NotNull MutatePriority mutatePriority, @NotNull ed.p<? super j, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objG = M.g(new DefaultDraggableState$drag$2(this, mutatePriority, pVar, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    @Override // androidx.compose.foundation.gestures.p
    public void b(float f10) {
        this.f89304a.invoke(Float.valueOf(f10));
    }

    @NotNull
    public final ed.l<Float, L0> e() {
        return this.f89304a;
    }
}
