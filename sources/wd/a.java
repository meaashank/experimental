package wd;

import ed.InterfaceC4376a;
import ed.l;
import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.internal.C5080n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,64:1\n45#1,6:65\n45#1,6:71\n45#1,6:77\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n13#1:65,6\n25#1:71,6\n34#1:77,6\n*E\n"})
public final class a {
    public static final void a(e<?> eVar, Throwable th) throws Throwable {
        eVar.resumeWith(C4885d0.a(th));
        throw th;
    }

    public static final void b(e<?> eVar, InterfaceC4376a<L0> interfaceC4376a) {
        try {
            interfaceC4376a.invoke();
        } catch (Throwable th) {
            eVar.resumeWith(C4885d0.a(th));
            throw th;
        }
    }

    @InterfaceC5120x0
    public static final <T> void c(@NotNull l<? super e<? super T>, ? extends Object> lVar, @NotNull e<? super T> eVar) {
        try {
            C5080n.e(IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, eVar)), L0.f217464a, null, 2, null);
        } catch (Throwable th) {
            eVar.resumeWith(C4885d0.a(th));
            throw th;
        }
    }

    public static final <R, T> void d(@NotNull p<? super R, ? super e<? super T>, ? extends Object> pVar, R r10, @NotNull e<? super T> eVar, @Nullable l<? super Throwable, L0> lVar) {
        try {
            C5080n.d(IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r10, eVar)), L0.f217464a, lVar);
        } catch (Throwable th) {
            eVar.resumeWith(C4885d0.a(th));
            throw th;
        }
    }

    public static final void e(@NotNull e<? super L0> eVar, @NotNull e<?> eVar2) {
        try {
            C5080n.e(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), L0.f217464a, null, 2, null);
        } catch (Throwable th) {
            eVar2.resumeWith(C4885d0.a(th));
            throw th;
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, e eVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, eVar, lVar);
    }
}
