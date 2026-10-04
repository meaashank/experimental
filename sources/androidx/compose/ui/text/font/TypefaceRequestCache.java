package androidx.compose.ui.text.font;

import androidx.compose.runtime.X1;
import androidx.compose.ui.text.font.r0;
import f0.C4383b;
import java.util.List;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,256:1\n26#2:257\n26#2:258\n26#2:259\n26#2:260\n26#2:261\n26#2:262\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n172#1:257\n209#1:258\n226#1:259\n239#1:260\n246#1:261\n252#1:262\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class TypefaceRequestCache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104588c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.platform.y f104589a = new androidx.compose.ui.text.platform.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4383b<q0, r0> f104590b = new C4383b<>(16);

    @Nullable
    public final r0 b(@NotNull q0 q0Var) {
        r0 r0VarG;
        synchronized (this.f104589a) {
            r0VarG = this.f104590b.g(q0Var);
        }
        return r0VarG;
    }

    @NotNull
    public final androidx.compose.ui.text.platform.y c() {
        return this.f104589a;
    }

    public final int d() {
        int iP;
        synchronized (this.f104589a) {
            iP = this.f104590b.p();
        }
        return iP;
    }

    public final void e(@NotNull List<q0> list, @NotNull ed.l<? super q0, ? extends r0> lVar) {
        r0 r0VarG;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            q0 q0Var = list.get(i10);
            synchronized (this.f104589a) {
                r0VarG = this.f104590b.g(q0Var);
            }
            if (r0VarG == null) {
                try {
                    r0 r0VarInvoke = lVar.invoke(q0Var);
                    if (r0VarInvoke instanceof r0.a) {
                        continue;
                    } else {
                        synchronized (this.f104589a) {
                            this.f104590b.k(q0Var, r0VarInvoke);
                        }
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            }
        }
    }

    @NotNull
    public final X1<Object> f(@NotNull final q0 q0Var, @NotNull ed.l<? super ed.l<? super r0, L0>, ? extends r0> lVar) {
        synchronized (this.f104589a) {
            r0 r0VarG = this.f104590b.g(q0Var);
            if (r0VarG != null) {
                if (r0VarG.a()) {
                    return r0VarG;
                }
                this.f104590b.m(q0Var);
            }
            try {
                r0 r0VarInvoke = lVar.invoke(new ed.l<r0, L0>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void e(@NotNull r0 r0Var) {
                        TypefaceRequestCache typefaceRequestCache = this.f104591d;
                        androidx.compose.ui.text.platform.y yVar = typefaceRequestCache.f104589a;
                        q0 q0Var2 = q0Var;
                        synchronized (yVar) {
                            try {
                                if (r0Var.a()) {
                                    typefaceRequestCache.f104590b.k(q0Var2, r0Var);
                                } else {
                                    typefaceRequestCache.f104590b.m(q0Var2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // ed.l
                    public /* bridge */ /* synthetic */ L0 invoke(r0 r0Var) {
                        e(r0Var);
                        return L0.f217464a;
                    }
                });
                synchronized (this.f104589a) {
                    if (this.f104590b.g(q0Var) == null && r0VarInvoke.a()) {
                        this.f104590b.k(q0Var, r0VarInvoke);
                    }
                }
                return r0VarInvoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
