package Q0;

import G0.U;
import G0.V;
import Q0.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1535h0;
import androidx.collection.U0;
import androidx.core.util.InterfaceC2427d;
import e.InterfaceC4326A;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1535h0<String, Typeface> f65732a = new C1535h0<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f65733b = m.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f65734c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC4326A("LOCK")
    public static final U0<String, ArrayList<InterfaceC2427d<e>>> f65735d = new U0<>();

    public class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f65737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f65738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f65739d;

        public a(String str, Context context, j jVar, int i10) {
            this.f65736a = str;
            this.f65737b = context;
            this.f65738c = jVar;
            this.f65739d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return k.c(this.f65736a, this.f65737b, U.a(new Object[]{this.f65738c}), this.f65739d);
        }
    }

    public class b implements InterfaceC2427d<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q0.a f65740a;

        public b(Q0.a aVar) {
            this.f65740a = aVar;
        }

        @Override // androidx.core.util.InterfaceC2427d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f65740a.b(eVar);
        }
    }

    public class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f65742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f65743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f65744d;

        public c(String str, Context context, List list, int i10) {
            this.f65741a = str;
            this.f65742b = context;
            this.f65743c = list;
            this.f65744d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return k.c(this.f65741a, this.f65742b, this.f65743c, this.f65744d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements InterfaceC2427d<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f65745a;

        public d(String str) {
            this.f65745a = str;
        }

        @Override // androidx.core.util.InterfaceC2427d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (k.f65734c) {
                try {
                    U0<String, ArrayList<InterfaceC2427d<e>>> u02 = k.f65735d;
                    ArrayList<InterfaceC2427d<e>> arrayList = u02.get(this.f65745a);
                    if (arrayList == null) {
                        return;
                    }
                    u02.remove(this.f65745a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(@NonNull List<j> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).f65731f);
            sb2.append(com.prism.gaia.download.a.f164606q);
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@NonNull l.b bVar) {
        int i10 = 1;
        if (bVar.e() != 0) {
            return bVar.e() != 1 ? -3 : -2;
        }
        l.c[] cVarArrC = bVar.c();
        if (cVarArrC != null && cVarArrC.length != 0) {
            i10 = 0;
            for (l.c cVar : cVarArrC) {
                int iB = cVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    @NonNull
    public static e c(@NonNull String str, @NonNull Context context, @NonNull List<j> list, int i10) {
        Trace.beginSection(z2.b.m("getFontSync"));
        try {
            C1535h0<String, Typeface> c1535h0 = f65732a;
            Typeface typeface = c1535h0.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            l.b bVarF = f.f(context, list, null);
            int iB = b(bVarF);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceD = (!bVarF.f() || Build.VERSION.SDK_INT < 29) ? V.d(context, null, bVarF.c(), i10) : V.e(context, null, bVarF.f65765b, i10);
            if (typefaceD == null) {
                return new e(-3);
            }
            c1535h0.put(str, typefaceD);
            return new e(typefaceD);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            Trace.endSection();
        }
    }

    public static Typeface d(@NonNull Context context, @NonNull List<j> list, int i10, @Nullable Executor executor, @NonNull Q0.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = f65732a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f65734c) {
            try {
                U0<String, ArrayList<InterfaceC2427d<e>>> u02 = f65735d;
                ArrayList<InterfaceC2427d<e>> arrayList = u02.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC2427d<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                u02.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f65733b;
                }
                m.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(@NonNull Context context, @NonNull j jVar, @NonNull Q0.a aVar, int i10, int i11) {
        String strA = a(U.a(new Object[]{jVar}), i10);
        Typeface typeface = f65732a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, U.a(new Object[]{jVar}), i10);
            aVar.b(eVarC);
            return eVarC.f65746a;
        }
        try {
            e eVar = (e) m.d(f65733b, new a(strA, context, jVar, i10), i11);
            aVar.b(eVar);
            return eVar.f65746a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    public static void f() {
        f65732a.evictAll();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f65746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65747b;

        public e(int i10) {
            this.f65746a = null;
            this.f65747b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f65747b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(@NonNull Typeface typeface) {
            this.f65746a = typeface;
            this.f65747b = 0;
        }
    }
}
