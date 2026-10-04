package com.prism.hider.ui;

import B0.C0923g;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.prism.commons.utils.C3857v;
import com.prism.commons.utils.C3861z;
import com.prism.hider.ui.F1;
import hc.InterfaceC4519B;
import hc.InterfaceC4520C;
import io.reactivex.internal.functions.Functions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kc.C4839a;
import nc.InterfaceC5271g;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import t1.C5596a;
import v3.AbstractC5679e;
import w3.InterfaceC5744e;

/* JADX INFO: loaded from: classes6.dex */
public class F1 extends I4.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f167932l = "WallpaperViewModel";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f167933m = "file:///android_asset/wallpaper/01.jpg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f167934n = "https://hider-ads-1251001113.cos.sa-saopaulo.myqcloud.com/hider_wallpapers/";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f167935o = "https://hider-ads-1251001113.cos.sa-saopaulo.myqcloud.com/hider_wallpapers/index";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f167936p = "wallpaper_cache";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f167937q = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f167938r = "WallpaperViewModel.KEY_CURRENT_URI";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f167939s = "WallpaperViewModel.KEY_HISTORY_ITEMS_JSON";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f167940t = "WallpaperViewModel.KEY_WALLPAPERS_URIS_ASSET";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f167941u = "WallpaperViewModel.KEY_WALLPAPERS_URIS_REMOTE";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C3861z<String[], Void> f167942v = new C3861z<>(new w1());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C3861z<String, String[]> f167943w = new C3861z<>(new x1());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C3861z<String, String[]> f167944x = new C3861z<>(new y1());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f167945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M f167946k;

    public class a extends AbstractC5679e<File> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f167947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f167948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f167949f;

        public a(String str, d dVar, b bVar) {
            this.f167947d = str;
            this.f167948e = dVar;
            this.f167949f = bVar;
        }

        public static /* synthetic */ void c(d dVar, String str, String str2) {
            Log.d(F1.f167932l, "onNext");
            dVar.a(str, str2);
        }

        @Override // v3.p
        public void d(@Nullable @org.jetbrains.annotations.Nullable Drawable drawable) {
            this.f167949f.a(new IllegalStateException("glide load cleared"));
        }

        public final /* synthetic */ void e(String str, File file, InterfaceC4519B interfaceC4519B) throws Exception {
            File file2 = new File(F1.this.P(), com.prism.commons.utils.J.a(str));
            if (file2.exists()) {
                Log.d(F1.f167932l, "exist file:" + file2);
                interfaceC4519B.onNext(file2.toURI().toString());
                return;
            }
            byte[] bArr = new byte[1024];
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    Log.d(F1.f167932l, "copied " + i10 + " file:" + file2);
                    interfaceC4519B.onNext(file2.toURI().toString());
                    return;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        }

        @Override // v3.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(@NonNull final File file, @Nullable @org.jetbrains.annotations.Nullable InterfaceC5744e<? super File> interfaceC5744e) {
            final String str = this.f167947d;
            hc.z zVarV3 = hc.z.m1(new InterfaceC4520C() { // from class: com.prism.hider.ui.C1
                @Override // hc.InterfaceC4520C
                public final void a(InterfaceC4519B interfaceC4519B) throws Exception {
                    this.f167915a.e(str, file, interfaceC4519B);
                }
            }).D5(Kc.b.c()).V3(C4839a.b());
            final d dVar = this.f167948e;
            final String str2 = this.f167947d;
            InterfaceC5271g interfaceC5271g = new InterfaceC5271g() { // from class: com.prism.hider.ui.D1
                @Override // nc.InterfaceC5271g
                public final void accept(Object obj) {
                    F1.a.c(dVar, str2, (String) obj);
                }
            };
            final b bVar = this.f167949f;
            zVarV3.B5(interfaceC5271g, new InterfaceC5271g() { // from class: com.prism.hider.ui.E1
                @Override // nc.InterfaceC5271g
                public final void accept(Object obj) {
                    bVar.a((Throwable) obj);
                }
            }, Functions.f202949c, Functions.f202950d);
        }
    }

    public interface b {
        void a(Throwable th);
    }

    public interface c {
        void a(@NonNull String str);
    }

    public interface d {
        void a(String str, String str2);
    }

    public F1(@NonNull Application application, androidx.lifecycle.a0 a0Var) {
        super(application, a0Var);
        this.f167945j = new Handler(Looper.getMainLooper());
        this.f167946k = new M(this);
    }

    public static /* synthetic */ void B(boolean[] zArr) {
        int i10 = 0;
        int i11 = 0;
        for (boolean z10 : zArr) {
            if (z10) {
                i10++;
            } else {
                i11++;
            }
        }
        Log.d(f167932l, "delete cache success: " + i10 + " failed: " + i11);
    }

    public static void I(InterfaceC4519B interfaceC4519B) {
        try {
            Response responseExecute = ((okhttp3.internal.connection.e) new OkHttpClient().a(new Request.Builder().get().url(f167935o).build())).execute();
            try {
                if (!responseExecute.G1() || responseExecute.f225298g == null) {
                    interfaceC4519B.onError(new Exception("request failed or body is null code" + responseExecute.f225295d));
                } else {
                    InputStreamReader inputStreamReader = new InputStreamReader(responseExecute.f225298g.d());
                    String[] strArr = (String[]) new Gson().fromJson((Reader) inputStreamReader, String[].class);
                    inputStreamReader.close();
                    ArrayList arrayList = new ArrayList();
                    for (String str : strArr) {
                        if (str != null) {
                            arrayList.add(f167934n + str);
                        }
                    }
                    interfaceC4519B.onNext(arrayList);
                    interfaceC4519B.onComplete();
                }
                responseExecute.close();
            } finally {
            }
        } catch (Exception e10) {
            interfaceC4519B.onError(e10);
        }
    }

    public static /* synthetic */ String J(final String[] strArr) {
        return (String) C3857v.b(new C3857v.b() { // from class: com.prism.hider.ui.r1
            @Override // com.prism.commons.utils.C3857v.b
            public final Object a() {
                return new Gson().toJson(strArr);
            }
        }, new s1());
    }

    public static /* synthetic */ String[] K(Void r02) {
        return new String[]{f167933m};
    }

    public static /* synthetic */ String L(String[] strArr) {
        return (String) C3857v.b(new m1(), new n1());
    }

    public static /* synthetic */ List w() {
        return new LinkedList();
    }

    public final void N(@NonNull String str) {
        List<String> listF = S().f();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= listF.size()) {
                i11 = -1;
                break;
            } else if (str.equals(listF.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        C5596a.a("history index:", i11, f167932l);
        if (i11 > 0) {
            listF.remove(i11);
        }
        if (i11 != 0) {
            Log.d(f167932l, "add index to 0");
            listF.add(0, str);
            if (listF.size() > 10) {
                LinkedList linkedList = new LinkedList();
                ArrayList arrayList = new ArrayList();
                while (i10 < 10) {
                    linkedList.add(listF.get(i10));
                    i10++;
                }
                while (i10 < listF.size()) {
                    arrayList.add(listF.get(i10));
                    i10++;
                }
                Z(arrayList);
                listF = linkedList;
            }
            this.f167946k.h(f167939s, listF, String.class);
        }
    }

    public final void O(@NonNull String str, @NonNull final d dVar, @NonNull b bVar) {
        final String lowerCase = str.toLowerCase();
        if (!Y(lowerCase)) {
            a0(new Runnable() { // from class: com.prism.hider.ui.l1
                @Override // java.lang.Runnable
                public final void run() {
                    F1.d dVar2 = dVar;
                    String str2 = lowerCase;
                    dVar2.a(str2, str2);
                }
            });
        } else {
            Application applicationH = h();
            com.bumptech.glide.c.p(applicationH).h(applicationH).v().t(com.bumptech.glide.load.engine.h.f139671c).q(lowerCase).s1(new a(lowerCase, dVar, bVar));
        }
    }

    public final File P() {
        File fileQ = Q();
        if (fileQ.exists()) {
            if (!fileQ.isDirectory()) {
                throw new IllegalStateException(C0923g.a("not a dir ", fileQ));
            }
        } else if (!fileQ.mkdir()) {
            throw new IllegalStateException(C0923g.a("create dir failed ", fileQ));
        }
        return fileQ;
    }

    public final File Q() {
        return new File(h().getFilesDir(), f167936p);
    }

    public androidx.lifecycle.K<String> R() {
        return n(f167938r);
    }

    @NonNull
    public androidx.lifecycle.K<List<String>> S() {
        return this.f167946k.e(f167939s, String.class, new o1());
    }

    @NonNull
    public androidx.lifecycle.K<List<String>> T() {
        return this.f167946k.d(f167940t, String.class);
    }

    @NonNull
    public androidx.lifecycle.K<List<String>> U() {
        return this.f167946k.d(f167941u, String.class);
    }

    public final /* synthetic */ void V(List list, InterfaceC4519B interfaceC4519B) throws Exception {
        boolean[] zArr = new boolean[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            if (str != null && Y(str)) {
                File file = new File(URI.create(str));
                if (file.exists()) {
                    zArr[i10] = file.delete();
                }
                Log.d(f167932l, "delete result " + zArr[i10]);
            }
        }
        interfaceC4519B.onNext(zArr);
    }

    public final /* synthetic */ void W(String str, String str2) {
        Log.d(f167932l, "origin " + str + " controlled:" + str2);
        u(f167938r, str2);
        N(str2);
    }

    public final /* synthetic */ void X(List list) throws Exception {
        Log.d(f167932l, "update remote: " + list.size());
        this.f167946k.h(f167941u, list, String.class);
    }

    public final boolean Y(@NonNull String str) {
        StringBuilder sbA = androidx.activity.result.i.a("needCache: ", str, " startwith file:///android_asset ");
        sbA.append(str.startsWith("file:///android_asset"));
        Log.d(f167932l, sbA.toString());
        if (str.startsWith("file:///android_asset")) {
            return false;
        }
        String lowerCase = Q().toURI().toString().toLowerCase();
        Log.d(f167932l, "cacheDirUri:" + lowerCase);
        return !str.startsWith(lowerCase);
    }

    public final void Z(@NonNull final List<String> list) {
        hc.z.m1(new InterfaceC4520C() { // from class: com.prism.hider.ui.z1
            @Override // hc.InterfaceC4520C
            public final void a(InterfaceC4519B interfaceC4519B) throws Exception {
                this.f168329a.V(list, interfaceC4519B);
            }
        }).D5(Kc.b.c()).V3(C4839a.b()).B5(new A1(), new B1(), Functions.f202949c, Functions.f202950d);
    }

    public final void a0(@NonNull Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f167945j.post(runnable);
        }
    }

    public void b0(@NonNull String str, @NonNull c cVar, @NonNull final b bVar) {
        d dVar = new d() { // from class: com.prism.hider.ui.p1
            @Override // com.prism.hider.ui.F1.d
            public final void a(String str2, String str3) {
                this.f168279a.W(str2, str3);
            }
        };
        Objects.requireNonNull(bVar);
        O(str, dVar, new b() { // from class: com.prism.hider.ui.q1
            @Override // com.prism.hider.ui.F1.b
            public final void a(Throwable th) {
                bVar.a(th);
            }
        });
    }

    public void c0() {
        hc.z.m1(new t1()).D5(Kc.b.c()).V3(C4839a.b()).B5(new InterfaceC5271g() { // from class: com.prism.hider.ui.u1
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) throws Exception {
                this.f168303a.X((List) obj);
            }
        }, new v1(), Functions.f202949c, Functions.f202950d);
    }

    @Override // I4.h
    @NonNull
    public String m() {
        return "datastore_wallpaper";
    }

    @Override // I4.h
    @NonNull
    public List<Pair<String, Object>> r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(f167938r, f167933m));
        arrayList.add(new Pair(f167939s, f167943w.a(f167942v.a(null))));
        arrayList.add(new Pair(f167940t, f167944x.a(null)));
        arrayList.add(new Pair(f167941u, HttpUrl.f225216p));
        return arrayList;
    }
}
