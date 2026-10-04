package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C1528e;
import androidx.core.util.t;
import androidx.emoji2.text.a;
import e.D;
import e.InterfaceC4326A;
import e.InterfaceC4330d;
import e.InterfaceC4337k;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q1.n;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
public class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f113262A = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f113263B = 2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f113264C = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Object f113265D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Object f113266E = new Object();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    @InterfaceC4326A("INSTANCE_LOCK")
    public static volatile c f113267F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @InterfaceC4326A("CONFIG_LOCK")
    public static volatile boolean f113268G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f113269H = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f113270o = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f113271p = "android.support.text.emoji.emojiCompat_replaceAll";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f113272q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f113273r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f113274s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f113275t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f113276u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f113277v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f113278w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f113279x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f113280y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f113281z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @InterfaceC4326A("mInitLock")
    public final Set<g> f113283b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final C0298c f113286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final j f113287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m f113288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f113289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f113290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final int[] f113291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f113292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f113293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f113294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f113295n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ReadWriteLock f113282a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4326A("mInitLock")
    public volatile int f113284c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Handler f113285d = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @T(19)
    public static final class b extends C0298c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.d f113296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f113297c;

        public class a extends k {
            public a() {
            }

            @Override // androidx.emoji2.text.c.k
            public void a(@Nullable Throwable th) {
                b.this.f113299a.v(th);
            }

            @Override // androidx.emoji2.text.c.k
            public void b(@NonNull androidx.emoji2.text.f fVar) {
                b.this.j(fVar);
            }
        }

        public b(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.C0298c
        public String a() {
            String strN = this.f113297c.f113357a.N();
            return strN == null ? "" : strN;
        }

        @Override // androidx.emoji2.text.c.C0298c
        public int b(@NonNull CharSequence charSequence, int i10) {
            return this.f113296b.b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.c.C0298c
        public int c(CharSequence charSequence, int i10) {
            return this.f113296b.d(charSequence, i10);
        }

        @Override // androidx.emoji2.text.c.C0298c
        public int d(@NonNull CharSequence charSequence, int i10) {
            return this.f113296b.e(charSequence, i10);
        }

        @Override // androidx.emoji2.text.c.C0298c
        public boolean e(@NonNull CharSequence charSequence) {
            return this.f113296b.c(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.c.C0298c
        public boolean f(@NonNull CharSequence charSequence, int i10) {
            return this.f113296b.d(charSequence, i10) == 1;
        }

        @Override // androidx.emoji2.text.c.C0298c
        public void g() {
            try {
                this.f113299a.f113287f.a(new a());
            } catch (Throwable th) {
                this.f113299a.v(th);
            }
        }

        @Override // androidx.emoji2.text.c.C0298c
        public CharSequence h(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f113296b.l(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.c.C0298c
        public void i(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt(c.f113270o, this.f113297c.f113357a.S());
            editorInfo.extras.putBoolean(c.f113271p, this.f113299a.f113289h);
        }

        public void j(@NonNull androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.f113299a.v(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f113297c = fVar;
            androidx.emoji2.text.f fVar2 = this.f113297c;
            c cVar = this.f113299a;
            this.f113296b = new androidx.emoji2.text.d(fVar2, cVar.f113288g, cVar.f113295n, cVar.f113290i, cVar.f113291j, q1.g.a());
            this.f113299a.w();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static class C0298c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f113299a;

        public C0298c(c cVar) {
            this.f113299a = cVar;
        }

        public String a() {
            return "";
        }

        public int b(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
            return -1;
        }

        public int c(CharSequence charSequence, int i10) {
            return 0;
        }

        public int d(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
            return -1;
        }

        public boolean e(@NonNull CharSequence charSequence) {
            return false;
        }

        public boolean f(@NonNull CharSequence charSequence, int i10) {
            return false;
        }

        public void g() {
            this.f113299a.w();
        }

        public CharSequence h(@NonNull CharSequence charSequence, @D(from = 0) int i10, @D(from = 0) int i11, @D(from = 0) int i12, boolean z10) {
            return charSequence;
        }

        public void i(@NonNull EditorInfo editorInfo) {
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final j f113300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m f113301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f113302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f113303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public int[] f113304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Set<g> f113305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f113306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f113307h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f113308i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public f f113309j = new androidx.emoji2.text.b();

        public d(@NonNull j jVar) {
            t.m(jVar, "metadataLoader cannot be null.");
            this.f113300a = jVar;
        }

        @NonNull
        public final j a() {
            return this.f113300a;
        }

        @NonNull
        public d b(@NonNull g gVar) {
            t.m(gVar, "initCallback cannot be null");
            if (this.f113305f == null) {
                this.f113305f = new C1528e();
            }
            this.f113305f.add(gVar);
            return this;
        }

        @NonNull
        public d c(@InterfaceC4337k int i10) {
            this.f113307h = i10;
            return this;
        }

        @NonNull
        public d d(boolean z10) {
            this.f113306g = z10;
            return this;
        }

        @NonNull
        public d e(@NonNull f fVar) {
            t.m(fVar, "GlyphChecker cannot be null");
            this.f113309j = fVar;
            return this;
        }

        @NonNull
        public d f(int i10) {
            this.f113308i = i10;
            return this;
        }

        @NonNull
        public d g(boolean z10) {
            this.f113302c = z10;
            return this;
        }

        @NonNull
        public d h(@NonNull m mVar) {
            this.f113301b = mVar;
            return this;
        }

        @NonNull
        public d i(boolean z10) {
            return j(z10, null);
        }

        @NonNull
        public d j(boolean z10, @Nullable List<Integer> list) {
            this.f113303d = z10;
            if (!z10 || list == null) {
                this.f113304e = null;
                return this;
            }
            this.f113304e = new int[list.size()];
            Iterator<Integer> it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                this.f113304e[i10] = it.next().intValue();
                i10++;
            }
            Arrays.sort(this.f113304e);
            return this;
        }

        @NonNull
        public d k(@NonNull g gVar) {
            t.m(gVar, "initCallback cannot be null");
            Set<g> set = this.f113305f;
            if (set != null) {
                set.remove(gVar);
            }
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class e implements m {
        @Override // androidx.emoji2.text.c.m
        @NonNull
        @T(19)
        public q1.h a(@NonNull q1.m mVar) {
            return new n(mVar);
        }
    }

    public interface f {
        boolean a(@NonNull CharSequence charSequence, @D(from = 0) int i10, @D(from = 0) int i11, @D(from = 0) int i12);
    }

    public static abstract class g {
        public void a(@Nullable Throwable th) {
        }

        public void b() {
        }
    }

    public static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<g> f113310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f113311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f113312c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public h(@NonNull g gVar, int i10) {
            this(Arrays.asList(gVar), i10, null);
            t.m(gVar, "initCallback cannot be null");
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f113310a.size();
            int i10 = 0;
            if (this.f113312c != 1) {
                while (i10 < size) {
                    this.f113310a.get(i10).a(this.f113311b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f113310a.get(i10).b();
                    i10++;
                }
            }
        }

        public h(@NonNull Collection<g> collection, int i10) {
            this(collection, i10, null);
        }

        public h(@NonNull Collection<g> collection, int i10, @Nullable Throwable th) {
            t.m(collection, "initCallbacks cannot be null");
            this.f113310a = new ArrayList(collection);
            this.f113312c = i10;
            this.f113311b = th;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface i {
    }

    public interface j {
        void a(@NonNull k kVar);
    }

    public static abstract class k {
        public abstract void a(@Nullable Throwable th);

        public abstract void b(@NonNull androidx.emoji2.text.f fVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface l {
    }

    public interface m {
        @NonNull
        @T(19)
        q1.h a(@NonNull q1.m mVar);
    }

    public c(@NonNull d dVar) {
        this.f113289h = dVar.f113302c;
        this.f113290i = dVar.f113303d;
        this.f113291j = dVar.f113304e;
        this.f113292k = dVar.f113306g;
        this.f113293l = dVar.f113307h;
        this.f113287f = dVar.f113300a;
        this.f113294m = dVar.f113308i;
        this.f113295n = dVar.f113309j;
        C1528e c1528e = new C1528e();
        this.f113283b = c1528e;
        m mVar = dVar.f113301b;
        this.f113288g = mVar == null ? new e() : mVar;
        Set<g> set = dVar.f113305f;
        if (set != null && !set.isEmpty()) {
            c1528e.addAll(dVar.f113305f);
        }
        this.f113286e = new b(this);
        u();
    }

    @NonNull
    public static c C(@NonNull d dVar) {
        c cVar;
        synchronized (f113265D) {
            cVar = new c(dVar);
            f113267F = cVar;
        }
        return cVar;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static c D(@Nullable c cVar) {
        c cVar2;
        synchronized (f113265D) {
            f113267F = cVar;
            cVar2 = f113267F;
        }
        return cVar2;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public static void E(boolean z10) {
        synchronized (f113266E) {
            f113268G = z10;
        }
    }

    @NonNull
    public static c c() {
        c cVar;
        synchronized (f113265D) {
            cVar = f113267F;
            t.o(cVar != null, f113269H);
        }
        return cVar;
    }

    public static boolean j(@NonNull InputConnection inputConnection, @NonNull Editable editable, @D(from = 0) int i10, @D(from = 0) int i11, boolean z10) {
        return androidx.emoji2.text.d.f(inputConnection, editable, i10, i11, z10);
    }

    public static boolean k(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        return androidx.emoji2.text.d.g(editable, i10, keyEvent);
    }

    @Nullable
    public static c n(@NonNull Context context) {
        return o(context, null);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static c o(@NonNull Context context, @Nullable a.C0297a c0297a) {
        c cVar;
        if (f113268G) {
            return f113267F;
        }
        if (c0297a == null) {
            c0297a = new a.C0297a(null);
        }
        d dVarC = c0297a.c(context);
        synchronized (f113266E) {
            try {
                if (!f113268G) {
                    if (dVarC != null) {
                        p(dVarC);
                    }
                    f113268G = true;
                }
                cVar = f113267F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @NonNull
    public static c p(@NonNull d dVar) {
        c cVar;
        c cVar2 = f113267F;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (f113265D) {
            try {
                cVar = f113267F;
                if (cVar == null) {
                    cVar = new c(dVar);
                    f113267F = cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static boolean q() {
        return f113267F != null;
    }

    @Nullable
    @CheckResult
    public CharSequence A(@Nullable CharSequence charSequence, @D(from = 0) int i10, @D(from = 0) int i11, @D(from = 0) int i12, int i13) {
        boolean z10;
        t.o(s(), "Not initialized yet");
        t.j(i10, "start cannot be negative");
        t.j(i11, "end cannot be negative");
        t.j(i12, "maxEmojiCount cannot be negative");
        t.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        t.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        t.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f113289h : false;
        } else {
            z10 = true;
        }
        return this.f113286e.h(charSequence, i10, i11, i12, z10);
    }

    public void B(@NonNull g gVar) {
        t.m(gVar, "initCallback cannot be null");
        this.f113282a.writeLock().lock();
        try {
            if (this.f113284c == 1 || this.f113284c == 2) {
                this.f113285d.post(new h(gVar, this.f113284c));
            } else {
                this.f113283b.add(gVar);
            }
            this.f113282a.writeLock().unlock();
        } catch (Throwable th) {
            this.f113282a.writeLock().unlock();
            throw th;
        }
    }

    public void F(@NonNull g gVar) {
        t.m(gVar, "initCallback cannot be null");
        this.f113282a.writeLock().lock();
        try {
            this.f113283b.remove(gVar);
        } finally {
            this.f113282a.writeLock().unlock();
        }
    }

    public void G(@NonNull EditorInfo editorInfo) {
        if (!s() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f113286e.i(editorInfo);
    }

    @NonNull
    public String d() {
        t.o(s(), "Not initialized yet");
        return this.f113286e.a();
    }

    public int e(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
        return this.f113286e.b(charSequence, i10);
    }

    public int f(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
        t.o(s(), "Not initialized yet");
        t.m(charSequence, "sequence cannot be null");
        return this.f113286e.c(charSequence, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InterfaceC4337k
    public int g() {
        return this.f113293l;
    }

    public int h(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
        return this.f113286e.d(charSequence, i10);
    }

    public int i() {
        this.f113282a.readLock().lock();
        try {
            return this.f113284c;
        } finally {
            this.f113282a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean l(@NonNull CharSequence charSequence) {
        t.o(s(), "Not initialized yet");
        t.m(charSequence, "sequence cannot be null");
        return this.f113286e.e(charSequence);
    }

    @Deprecated
    public boolean m(@NonNull CharSequence charSequence, @D(from = 0) int i10) {
        t.o(s(), "Not initialized yet");
        t.m(charSequence, "sequence cannot be null");
        return this.f113286e.f(charSequence, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean r() {
        return this.f113292k;
    }

    public final boolean s() {
        return i() == 1;
    }

    public void t() {
        t.o(this.f113294m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (s()) {
            return;
        }
        this.f113282a.writeLock().lock();
        try {
            if (this.f113284c == 0) {
                return;
            }
            this.f113284c = 0;
            this.f113282a.writeLock().unlock();
            this.f113286e.g();
        } finally {
            this.f113282a.writeLock().unlock();
        }
    }

    public final void u() {
        this.f113282a.writeLock().lock();
        try {
            if (this.f113294m == 0) {
                this.f113284c = 0;
            }
            this.f113282a.writeLock().unlock();
            if (i() == 0) {
                this.f113286e.g();
            }
        } catch (Throwable th) {
            this.f113282a.writeLock().unlock();
            throw th;
        }
    }

    public void v(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f113282a.writeLock().lock();
        try {
            this.f113284c = 2;
            arrayList.addAll(this.f113283b);
            this.f113283b.clear();
            this.f113282a.writeLock().unlock();
            this.f113285d.post(new h(arrayList, this.f113284c, th));
        } catch (Throwable th2) {
            this.f113282a.writeLock().unlock();
            throw th2;
        }
    }

    public void w() {
        ArrayList arrayList = new ArrayList();
        this.f113282a.writeLock().lock();
        try {
            this.f113284c = 1;
            arrayList.addAll(this.f113283b);
            this.f113283b.clear();
            this.f113282a.writeLock().unlock();
            this.f113285d.post(new h(arrayList, this.f113284c, null));
        } catch (Throwable th) {
            this.f113282a.writeLock().unlock();
            throw th;
        }
    }

    @Nullable
    @CheckResult
    public CharSequence x(@Nullable CharSequence charSequence) {
        return y(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @Nullable
    @CheckResult
    public CharSequence y(@Nullable CharSequence charSequence, @D(from = 0) int i10, @D(from = 0) int i11) {
        return z(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    @Nullable
    @CheckResult
    public CharSequence z(@Nullable CharSequence charSequence, @D(from = 0) int i10, @D(from = 0) int i11, @D(from = 0) int i12) {
        return A(charSequence, i10, i11, i12, 0);
    }
}
