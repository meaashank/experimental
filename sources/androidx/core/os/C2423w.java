package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.os.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(24)
public final class C2423w implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f111310a;

    public C2423w(Object obj) {
        this.f111310a = C2416o.a(obj);
    }

    @Override // androidx.core.os.r
    public String a() {
        return this.f111310a.toLanguageTags();
    }

    @Override // androidx.core.os.r
    public Object b() {
        return this.f111310a;
    }

    @Override // androidx.core.os.r
    @Nullable
    public Locale c(@NonNull String[] strArr) {
        return this.f111310a.getFirstMatch(strArr);
    }

    @Override // androidx.core.os.r
    public int d(Locale locale) {
        return this.f111310a.indexOf(locale);
    }

    public boolean equals(Object obj) {
        return this.f111310a.equals(((r) obj).b());
    }

    @Override // androidx.core.os.r
    public Locale get(int i10) {
        return this.f111310a.get(i10);
    }

    public int hashCode() {
        return this.f111310a.hashCode();
    }

    @Override // androidx.core.os.r
    public boolean isEmpty() {
        return this.f111310a.isEmpty();
    }

    @Override // androidx.core.os.r
    public int size() {
        return this.f111310a.size();
    }

    public String toString() {
        return this.f111310a.toString();
    }
}
