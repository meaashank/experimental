package ha;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ha.C4511e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import pb.C5404d;

/* JADX INFO: loaded from: classes6.dex */
public final class E {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static E f202460k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f202462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f202463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f202464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f202465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile x f202466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f202467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f202468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f202469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4511e f202470j;

    public interface a {
        void a(x xVar);
    }

    public E(final Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f202463c = executorServiceNewSingleThreadExecutor;
        this.f202464d = new Handler(Looper.getMainLooper());
        this.f202465e = new CopyOnWriteArrayList<>();
        this.f202466f = x.f();
        this.f202467g = "";
        this.f202468h = "";
        this.f202461a = context;
        this.f202462b = context.getSharedPreferences("minus_one_ads_validated", 0);
        this.f202470j = new C4511e(new File(context.getNoBackupFilesDir(), "minus_one_assets"), 134217728L, new C4511e.a() { // from class: ha.y
            @Override // ha.C4511e.a
            public final InputStream open(String str) {
                return context.getAssets().open(str);
            }
        });
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: ha.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f202640a.l();
            }
        });
        C5404d.f().b(new Runnable() { // from class: ha.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f202454a.q();
            }
        });
    }

    public static synchronized E i(Context context) {
        try {
            if (f202460k == null) {
                f202460k = new E(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f202460k;
    }

    public final boolean f(String str, boolean z10) {
        if (str != null && !str.trim().isEmpty()) {
            if (str.equals(this.f202467g)) {
                return true;
            }
            try {
                x xVarJ = x.j(str);
                this.f202466f = xVarJ;
                this.f202467g = str;
                this.f202470j.f202529k = ((long) xVarJ.f202592f) * 1048576;
                if (z10) {
                    this.f202462b.edit().putString("last_good", str).apply();
                }
                if (this.f202469i) {
                    o();
                }
                return true;
            } catch (Exception e10) {
                Log.w("MinusOneConfig", "Rejected remote/default config", e10);
            }
        }
        return false;
    }

    public void g(final a aVar) {
        this.f202465e.add(aVar);
        if (this.f202469i) {
            this.f202464d.post(new Runnable() { // from class: ha.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202457a.k(aVar);
                }
            });
        }
    }

    public C4511e h() {
        return this.f202470j;
    }

    public boolean j() {
        return this.f202469i;
    }

    public final /* synthetic */ void k(a aVar) {
        if (this.f202465e.contains(aVar)) {
            aVar.a(this.f202466f);
        }
    }

    public final /* synthetic */ void l() {
        n();
        p();
        this.f202469i = true;
        o();
    }

    public final /* synthetic */ void m(x xVar) {
        Iterator<a> it = this.f202465e.iterator();
        while (it.hasNext()) {
            it.next().a(xVar);
        }
    }

    public final void n() {
        try {
            InputStream inputStreamOpen = this.f202461a.getAssets().open(x.f202586k);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = inputStreamOpen.read(bArr);
                    if (i10 == -1) {
                        String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                        if (f(str, false)) {
                            this.f202468h = str;
                        }
                        inputStreamOpen.close();
                        return;
                    }
                    if (byteArrayOutputStream.size() + i10 > 262144) {
                        throw new IOException("Config too large");
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (FileNotFoundException unused) {
            s();
        } catch (Exception e10) {
            Log.w("MinusOneConfig", "Rejected local config", e10);
            s();
        }
    }

    public final void o() {
        final x xVar = this.f202466f;
        this.f202464d.post(new Runnable() { // from class: ha.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f202455a.m(xVar);
            }
        });
    }

    public final void p() {
        if (C5404d.f().g()) {
            try {
                String string = C5404d.f().c().getString(x.f202585j, "");
                if (string != null && !string.trim().isEmpty()) {
                    if (f(string, true)) {
                        return;
                    }
                    f(this.f202462b.getString("last_good", ""), false);
                    return;
                }
                s();
            } catch (Exception e10) {
                Log.w("MinusOneConfig", "Remote unavailable; retain validated config", e10);
            }
        }
    }

    public Future<?> q() {
        return this.f202463c.submit(new Runnable() { // from class: ha.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f202459a.p();
            }
        });
    }

    public void r(a aVar) {
        this.f202465e.remove(aVar);
    }

    public final void s() {
        if (!this.f202468h.isEmpty()) {
            f(this.f202468h, false);
            return;
        }
        this.f202467g = "";
        this.f202466f = x.f();
        this.f202470j.f202529k = 134217728L;
        if (this.f202469i) {
            o();
        }
    }

    public x t() {
        return this.f202466f;
    }
}
