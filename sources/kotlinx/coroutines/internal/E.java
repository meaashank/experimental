package kotlinx.coroutines.internal;

import androidx.compose.runtime.R0;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC5058e0;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.J0;
import kotlinx.coroutines.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class E extends J0 implements kotlinx.coroutines.U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Throwable f220275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f220276d;

    public E(@Nullable Throwable th, @Nullable String str) {
        this.f220275c = th;
        this.f220276d = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(kotlin.coroutines.i iVar, Runnable runnable) {
        m3();
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean J2(@NotNull kotlin.coroutines.i iVar) {
        m3();
        throw null;
    }

    @Override // kotlinx.coroutines.J0, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher R2(int i10) {
        m3();
        throw null;
    }

    @Override // kotlinx.coroutines.U
    public void T0(long j10, InterfaceC5100n interfaceC5100n) {
        m3();
        throw null;
    }

    @Override // kotlinx.coroutines.J0
    @NotNull
    public J0 Z2() {
        return this;
    }

    @Override // kotlinx.coroutines.U
    @NotNull
    public InterfaceC5058e0 h1(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.i iVar) {
        m3();
        throw null;
    }

    @NotNull
    public Void k3(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        m3();
        throw null;
    }

    public final Void m3() {
        String strConcat;
        if (this.f220275c == null) {
            D.e();
            throw null;
        }
        String str = this.f220276d;
        if (str == null || (strConcat = ". ".concat(str)) == null) {
            strConcat = "";
        }
        throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(strConcat), this.f220275c);
    }

    @Override // kotlinx.coroutines.U
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p2(long j10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return U.a.a(this, j10, eVar);
    }

    @NotNull
    public Void q3(long j10, @NotNull InterfaceC5100n<? super L0> interfaceC5100n) {
        m3();
        throw null;
    }

    @Override // kotlinx.coroutines.J0, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dispatchers.Main[missing");
        if (this.f220275c != null) {
            str = ", cause=" + this.f220275c;
        } else {
            str = "";
        }
        return R0.a(sb2, str, ']');
    }

    public /* synthetic */ E(Throwable th, String str, int i10, C4969v c4969v) {
        this(th, (i10 & 2) != 0 ? null : str);
    }
}
