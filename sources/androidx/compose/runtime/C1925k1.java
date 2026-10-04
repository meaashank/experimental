package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1925k1 implements H1<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1925k1 f99948a = new C1925k1();

    @Override // androidx.compose.runtime.H1
    public boolean a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2;
    }

    @Override // androidx.compose.runtime.H1
    public /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return null;
    }

    @NotNull
    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
