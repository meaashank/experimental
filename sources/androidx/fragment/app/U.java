package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.E0;
import androidx.core.view.C2507z0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import e.InterfaceC4327a;
import e.InterfaceC4328b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f113732A = 7;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f113733B = 8;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f113734C = 9;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f113735D = 10;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f113736E = 4096;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f113737F = 8192;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f113738G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f113739H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f113740I = 4097;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f113741J = 8194;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f113742K = 4099;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f113743L = 4100;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f113744M = 8197;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f113745t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f113746u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f113747v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f113748w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f113749x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f113750y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f113751z = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2583v f113752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f113753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<a> f113754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f113759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f113760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f113761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f113762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f113763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f113764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f113765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f113766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f113767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<String> f113768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f113769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Runnable> f113770s;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f113772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f113773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f113774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f113775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f113776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f113777g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Lifecycle.State f113778h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Lifecycle.State f113779i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f113771a = i10;
            this.f113772b = fragment;
            this.f113773c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f113778h = state;
            this.f113779i = state;
        }

        public a(int i10, Fragment fragment, boolean z10) {
            this.f113771a = i10;
            this.f113772b = fragment;
            this.f113773c = z10;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f113778h = state;
            this.f113779i = state;
        }

        public a(int i10, @NonNull Fragment fragment, Lifecycle.State state) {
            this.f113771a = i10;
            this.f113772b = fragment;
            this.f113773c = false;
            this.f113778h = fragment.mMaxState;
            this.f113779i = state;
        }

        public a(a aVar) {
            this.f113771a = aVar.f113771a;
            this.f113772b = aVar.f113772b;
            this.f113773c = aVar.f113773c;
            this.f113774d = aVar.f113774d;
            this.f113775e = aVar.f113775e;
            this.f113776f = aVar.f113776f;
            this.f113777g = aVar.f113777g;
            this.f113778h = aVar.f113778h;
            this.f113779i = aVar.f113779i;
        }
    }

    @Deprecated
    public U() {
        this.f113754c = new ArrayList<>();
        this.f113761j = true;
        this.f113769r = false;
        this.f113752a = null;
        this.f113753b = null;
    }

    @NonNull
    public final U A(@e.C int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return B(i10, cls, bundle, null);
    }

    @NonNull
    public final U B(@e.C int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return z(i10, q(cls, bundle), str);
    }

    @NonNull
    public U C(@NonNull Runnable runnable) {
        s();
        if (this.f113770s == null) {
            this.f113770s = new ArrayList<>();
        }
        this.f113770s.add(runnable);
        return this;
    }

    @NonNull
    @Deprecated
    public U D(boolean z10) {
        return M(z10);
    }

    @NonNull
    @Deprecated
    public U E(@e.Z int i10) {
        this.f113765n = i10;
        this.f113766o = null;
        return this;
    }

    @NonNull
    @Deprecated
    public U F(@Nullable CharSequence charSequence) {
        this.f113765n = 0;
        this.f113766o = charSequence;
        return this;
    }

    @NonNull
    @Deprecated
    public U G(@e.Z int i10) {
        this.f113763l = i10;
        this.f113764m = null;
        return this;
    }

    @NonNull
    @Deprecated
    public U H(@Nullable CharSequence charSequence) {
        this.f113763l = 0;
        this.f113764m = charSequence;
        return this;
    }

    @NonNull
    public U I(@InterfaceC4327a @InterfaceC4328b int i10, @InterfaceC4327a @InterfaceC4328b int i11) {
        return J(i10, i11, 0, 0);
    }

    @NonNull
    public U J(@InterfaceC4327a @InterfaceC4328b int i10, @InterfaceC4327a @InterfaceC4328b int i11, @InterfaceC4327a @InterfaceC4328b int i12, @InterfaceC4327a @InterfaceC4328b int i13) {
        this.f113755d = i10;
        this.f113756e = i11;
        this.f113757f = i12;
        this.f113758g = i13;
        return this;
    }

    @NonNull
    public U K(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        i(new a(10, fragment, state));
        return this;
    }

    @NonNull
    public U L(@Nullable Fragment fragment) {
        i(new a(8, fragment));
        return this;
    }

    @NonNull
    public U M(boolean z10) {
        this.f113769r = z10;
        return this;
    }

    @NonNull
    public U N(int i10) {
        this.f113759h = i10;
        return this;
    }

    @NonNull
    @Deprecated
    public U O(@e.a0 int i10) {
        return this;
    }

    @NonNull
    public U P(@NonNull Fragment fragment) {
        i(new a(5, fragment));
        return this;
    }

    @NonNull
    public U b(@e.C int i10, @NonNull Fragment fragment) {
        t(i10, fragment, null, 1);
        return this;
    }

    @NonNull
    public U c(@e.C int i10, @NonNull Fragment fragment, @Nullable String str) {
        t(i10, fragment, str, 1);
        return this;
    }

    @NonNull
    public final U d(@e.C int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return b(i10, q(cls, bundle));
    }

    @NonNull
    public final U e(@e.C int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return c(i10, q(cls, bundle), str);
    }

    public U f(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, @Nullable String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    @NonNull
    public U g(@NonNull Fragment fragment, @Nullable String str) {
        t(0, fragment, str, 1);
        return this;
    }

    @NonNull
    public final U h(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return g(q(cls, bundle), str);
    }

    public void i(a aVar) {
        this.f113754c.add(aVar);
        aVar.f113774d = this.f113755d;
        aVar.f113775e = this.f113756e;
        aVar.f113776f = this.f113757f;
        aVar.f113777g = this.f113758g;
    }

    @NonNull
    public U j(@NonNull View view, @NonNull String str) {
        if (!W.f()) {
            return this;
        }
        String strA0 = C2507z0.A0(view);
        if (strA0 == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if (this.f113767p == null) {
            this.f113767p = new ArrayList<>();
            this.f113768q = new ArrayList<>();
        } else {
            if (this.f113768q.contains(str)) {
                throw new IllegalArgumentException(android.support.v4.media.i.a("A shared element with the target name '", str, "' has already been added to the transaction."));
            }
            if (this.f113767p.contains(strA0)) {
                throw new IllegalArgumentException(android.support.v4.media.i.a("A shared element with the source name '", strA0, "' has already been added to the transaction."));
            }
        }
        this.f113767p.add(strA0);
        this.f113768q.add(str);
        return this;
    }

    @NonNull
    public U k(@Nullable String str) {
        if (!this.f113761j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f113760i = true;
        this.f113762k = str;
        return this;
    }

    @NonNull
    public U l(@NonNull Fragment fragment) {
        i(new a(7, fragment));
        return this;
    }

    public abstract int m();

    public abstract int n();

    @e.I
    public abstract void o();

    @e.I
    public abstract void p();

    @NonNull
    public final Fragment q(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        C2583v c2583v = this.f113752a;
        if (c2583v == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f113753b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentA = c2583v.a(classLoader, cls.getName());
        if (bundle != null) {
            fragmentA.setArguments(bundle);
        }
        return fragmentA;
    }

    @NonNull
    public U r(@NonNull Fragment fragment) {
        i(new a(6, fragment));
        return this;
    }

    @NonNull
    public U s() {
        if (this.f113760i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f113761j = false;
        return this;
    }

    public void t(int i10, Fragment fragment, @Nullable String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(E0.a(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        i(new a(i11, fragment));
    }

    @NonNull
    public U u(@NonNull Fragment fragment) {
        i(new a(4, fragment));
        return this;
    }

    public boolean v() {
        return this.f113761j;
    }

    public boolean w() {
        return this.f113754c.isEmpty();
    }

    @NonNull
    public U x(@NonNull Fragment fragment) {
        i(new a(3, fragment));
        return this;
    }

    @NonNull
    public U y(@e.C int i10, @NonNull Fragment fragment) {
        return z(i10, fragment, null);
    }

    @NonNull
    public U z(@e.C int i10, @NonNull Fragment fragment, @Nullable String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        t(i10, fragment, str, 2);
        return this;
    }

    public U(@NonNull C2583v c2583v, @Nullable ClassLoader classLoader) {
        this.f113754c = new ArrayList<>();
        this.f113761j = true;
        this.f113769r = false;
        this.f113752a = c2583v;
        this.f113753b = classLoader;
    }

    public U(@NonNull C2583v c2583v, @Nullable ClassLoader classLoader, @NonNull U u10) {
        this(c2583v, classLoader);
        ArrayList<a> arrayList = u10.f113754c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = arrayList.get(i10);
            i10++;
            this.f113754c.add(new a(aVar));
        }
        this.f113755d = u10.f113755d;
        this.f113756e = u10.f113756e;
        this.f113757f = u10.f113757f;
        this.f113758g = u10.f113758g;
        this.f113759h = u10.f113759h;
        this.f113760i = u10.f113760i;
        this.f113761j = u10.f113761j;
        this.f113762k = u10.f113762k;
        this.f113765n = u10.f113765n;
        this.f113766o = u10.f113766o;
        this.f113763l = u10.f113763l;
        this.f113764m = u10.f113764m;
        if (u10.f113767p != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f113767p = arrayList2;
            arrayList2.addAll(u10.f113767p);
        }
        if (u10.f113768q != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.f113768q = arrayList3;
            arrayList3.addAll(u10.f113768q);
        }
        this.f113769r = u10.f113769r;
    }
}
