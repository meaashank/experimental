package androidx.navigation;

import android.os.Bundle;
import androidx.activity.C1477d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.navigation.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2613a implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Bundle f115195b = new Bundle();

    public C2613a(int i10) {
        this.f115194a = i10;
    }

    public static C2613a c(C2613a c2613a, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c2613a.f115194a;
        }
        c2613a.getClass();
        return new C2613a(i10);
    }

    public final int a() {
        return this.f115194a;
    }

    @NotNull
    public final C2613a b(int i10) {
        return new C2613a(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2613a.class.equals(obj.getClass()) && this.f115194a == ((C2613a) obj).f115194a;
    }

    @Override // androidx.navigation.A
    @NotNull
    public Bundle h() {
        return this.f115195b;
    }

    public int hashCode() {
        return 31 + this.f115194a;
    }

    @Override // androidx.navigation.A
    public int i() {
        return this.f115194a;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f115194a, ')');
    }
}
