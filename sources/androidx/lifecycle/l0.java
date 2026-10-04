package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n36#2,2:229\n23#3:231\n1#4:232\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n*L\n222#1:229,2\n222#1:231\n*E\n"})
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final S1.e f114354a = new S1.e();

    @NotNull
    public static final kotlinx.coroutines.L a(@NotNull k0 k0Var) {
        S1.a aVarB;
        kotlin.jvm.internal.G.p(k0Var, "<this>");
        synchronized (f114354a) {
            aVarB = (S1.a) k0Var.f(S1.b.f68110a);
            if (aVarB == null) {
                aVarB = S1.b.b();
                k0Var.d(S1.b.f68110a, aVarB);
            }
        }
        return aVarB;
    }
}
