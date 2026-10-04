package I4;

import androidx.annotation.Nullable;
import androidx.preference.j;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f51106a;

    public a(h hVar) {
        this.f51106a = hVar;
    }

    @Override // androidx.preference.j
    public boolean a(String str, boolean z10) {
        return ((Boolean) this.f51106a.n(str).f()).booleanValue();
    }

    @Override // androidx.preference.j
    public float b(String str, float f10) {
        return ((Float) this.f51106a.n(str).f()).floatValue();
    }

    @Override // androidx.preference.j
    public int c(String str, int i10) {
        return ((Integer) this.f51106a.n(str).f()).intValue();
    }

    @Override // androidx.preference.j
    public long d(String str, long j10) {
        return ((Long) this.f51106a.n(str).f()).longValue();
    }

    @Override // androidx.preference.j
    @Nullable
    public String e(String str, @Nullable String str2) {
        return (String) this.f51106a.n(str).f();
    }

    @Override // androidx.preference.j
    @Nullable
    public Set<String> f(String str, @Nullable Set<String> set) {
        return (Set) this.f51106a.n(str).f();
    }

    @Override // androidx.preference.j
    public void g(String str, boolean z10) {
        this.f51106a.u(str, Boolean.valueOf(z10));
    }

    @Override // androidx.preference.j
    public void h(String str, float f10) {
        this.f51106a.u(str, Float.valueOf(f10));
    }

    @Override // androidx.preference.j
    public void i(String str, int i10) {
        this.f51106a.u(str, Integer.valueOf(i10));
    }

    @Override // androidx.preference.j
    public void j(String str, long j10) {
        this.f51106a.u(str, Long.valueOf(j10));
    }

    @Override // androidx.preference.j
    public void k(String str, @Nullable String str2) {
        this.f51106a.u(str, str2);
    }

    @Override // androidx.preference.j
    public void l(String str, @Nullable Set<String> set) {
        this.f51106a.u(str, set);
    }
}
