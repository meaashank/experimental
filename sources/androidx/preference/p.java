package androidx.preference;

import fd.InterfaceC4421d;
import java.util.Iterator;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    public static final class a implements InterfaceC5000m<Preference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PreferenceGroup f115691a;

        public a(PreferenceGroup preferenceGroup) {
            this.f115691a = preferenceGroup;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        @NotNull
        public Iterator<Preference> iterator() {
            return p.j(this.f115691a);
        }
    }

    public static final class b implements Iterator<Preference>, InterfaceC4421d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PreferenceGroup f115693b;

        public b(PreferenceGroup preferenceGroup) {
            this.f115693b = preferenceGroup;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Preference next() {
            PreferenceGroup preferenceGroup = this.f115693b;
            int i10 = this.f115692a;
            this.f115692a = i10 + 1;
            Preference preferenceS1 = preferenceGroup.s1(i10);
            G.o(preferenceS1, "getPreference(index++)");
            return preferenceS1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f115692a < this.f115693b.t1();
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.f115693b;
            int i10 = this.f115692a - 1;
            this.f115692a = i10;
            preferenceGroup.z1(preferenceGroup.s1(i10));
        }
    }

    public static final boolean a(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        G.p(preferenceGroup, "<this>");
        G.p(preference, "preference");
        int iT1 = preferenceGroup.t1();
        int i10 = 0;
        while (i10 < iT1) {
            int i11 = i10 + 1;
            if (G.g(preferenceGroup.s1(i10), preference)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public static final void b(@NotNull PreferenceGroup preferenceGroup, @NotNull ed.l<? super Preference, L0> action) {
        G.p(preferenceGroup, "<this>");
        G.p(action, "action");
        int iT1 = preferenceGroup.t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            action.invoke(d(preferenceGroup, i10));
        }
    }

    public static final void c(@NotNull PreferenceGroup preferenceGroup, @NotNull ed.p<? super Integer, ? super Preference, L0> action) {
        G.p(preferenceGroup, "<this>");
        G.p(action, "action");
        int iT1 = preferenceGroup.t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            action.invoke(Integer.valueOf(i10), d(preferenceGroup, i10));
        }
    }

    @NotNull
    public static final Preference d(@NotNull PreferenceGroup preferenceGroup, int i10) {
        G.p(preferenceGroup, "<this>");
        Preference preferenceS1 = preferenceGroup.s1(i10);
        G.o(preferenceS1, "getPreference(index)");
        return preferenceS1;
    }

    @Nullable
    public static final <T extends Preference> T e(@NotNull PreferenceGroup preferenceGroup, @NotNull CharSequence key) {
        G.p(preferenceGroup, "<this>");
        G.p(key, "key");
        return (T) preferenceGroup.p1(key);
    }

    @NotNull
    public static final InterfaceC5000m<Preference> f(@NotNull PreferenceGroup preferenceGroup) {
        G.p(preferenceGroup, "<this>");
        return new a(preferenceGroup);
    }

    public static final int g(@NotNull PreferenceGroup preferenceGroup) {
        G.p(preferenceGroup, "<this>");
        return preferenceGroup.t1();
    }

    public static final boolean h(@NotNull PreferenceGroup preferenceGroup) {
        G.p(preferenceGroup, "<this>");
        return preferenceGroup.t1() == 0;
    }

    public static final boolean i(@NotNull PreferenceGroup preferenceGroup) {
        G.p(preferenceGroup, "<this>");
        return preferenceGroup.t1() != 0;
    }

    @NotNull
    public static final Iterator<Preference> j(@NotNull PreferenceGroup preferenceGroup) {
        G.p(preferenceGroup, "<this>");
        return new b(preferenceGroup);
    }

    public static final void k(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        G.p(preferenceGroup, "<this>");
        G.p(preference, "preference");
        preferenceGroup.z1(preference);
    }

    public static final void l(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        G.p(preferenceGroup, "<this>");
        G.p(preference, "preference");
        preferenceGroup.o1(preference);
    }
}
