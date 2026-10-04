package kotlinx.coroutines.internal;

import kotlin.C4885d0;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public final class C5082p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f220353a = false;

    static {
        try {
            Class.forName("android.os.Build");
        } catch (Throwable th) {
            C4885d0.a(th);
        }
    }

    public static final boolean a() {
        return true;
    }
}
