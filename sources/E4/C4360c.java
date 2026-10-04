package e4;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import android.util.LruCache;
import androidx.compose.runtime.changelist.j;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.p;
import e.g0;
import hc.AbstractC4521a;
import hc.InterfaceC4523c;
import hc.InterfaceC4525e;
import hc.q;
import hc.s;
import hc.u;
import java.io.File;
import java.io.FileOutputStream;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import p4.InterfaceC5390c;

/* JADX INFO: renamed from: e4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nFaviconModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaviconModel.kt\ncom/cookiegames/smartcookie/favicon/FaviconModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 CloseableExtensions.kt\ncom/cookiegames/smartcookie/extensions/CloseableExtensionsKt\n*L\n1#1,145:1\n1#2:146\n29#3:147\n29#3:148\n10#4,5:149\n*S KotlinDebug\n*F\n+ 1 FaviconModel.kt\ncom/cookiegames/smartcookie/favicon/FaviconModel\n*L\n84#1:147\n115#1:148\n118#1:149,5\n*E\n"})
@r(parameters = 0)
@Singleton
public final class C4360c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f200232f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f200233g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f200234h = "FaviconModel";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f200235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC5390c f200236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BitmapFactory.Options f200237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f200238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f200239e;

    /* JADX INFO: renamed from: e4.c$a */
    public static final class a {
        public a() {
        }

        @g0
        @NotNull
        public final File a(@NotNull Application app, @NotNull C4363f validUri) {
            G.p(app, "app");
            G.p(validUri, "validUri");
            return new File(app.getCacheDir(), j.a(String.valueOf(validUri.f200244b.hashCode()), u.e.f239314f));
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: e4.c$b */
    public static final class b extends LruCache<String, Bitmap> {
        public b(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap value) {
            G.p(key, "key");
            G.p(value, "value");
            return value.getByteCount();
        }
    }

    @Inject
    public C4360c(@NotNull Application application, @NotNull InterfaceC5390c logger) {
        G.p(application, "application");
        G.p(logger, "logger");
        this.f200235a = application;
        this.f200236b = logger;
        this.f200237c = new BitmapFactory.Options();
        this.f200238d = application.getResources().getDimensionPixelSize(p.g.f143782xa);
        this.f200239e = new b((int) C4.e.f(1L));
    }

    public static final void e(String str, C4360c c4360c, Bitmap bitmap, InterfaceC4523c emitter) {
        G.p(emitter, "emitter");
        C4363f c4363fA = C4362e.a(Uri.parse(str));
        if (c4363fA == null) {
            emitter.onComplete();
            return;
        }
        c4360c.f200236b.log(f200234h, "Caching icon for " + c4363fA.f200244b);
        FileOutputStream fileOutputStream = new FileOutputStream(f200232f.a(c4360c.f200235a, c4363fA));
        try {
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                emitter.onComplete();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            Log.e("Closeable", "Unable to parse results", th);
        }
    }

    public static final void h(String str, C4360c c4360c, String str2, s it) {
        Bitmap bitmapDecodeFile;
        G.p(it, "it");
        C4363f c4363fA = C4362e.a(Uri.parse(str));
        if (c4363fA == null) {
            it.onSuccess(d4.d.b(c4360c.f(str2)));
            return;
        }
        Bitmap bitmapI = c4360c.i(str);
        if (bitmapI != null) {
            it.onSuccess(d4.d.b(bitmapI));
            return;
        }
        File fileA = f200232f.a(c4360c.f200235a, c4363fA);
        if (!fileA.exists() || (bitmapDecodeFile = BitmapFactory.decodeFile(fileA.getPath(), c4360c.f200237c)) == null) {
            it.onSuccess(d4.d.b(c4360c.f(str2)));
        } else {
            c4360c.c(str, bitmapDecodeFile);
            it.onSuccess(d4.d.b(bitmapDecodeFile));
        }
    }

    public final void c(String str, Bitmap bitmap) {
        synchronized (this.f200239e) {
            this.f200239e.put(str, bitmap);
        }
    }

    @NotNull
    public final AbstractC4521a d(@NotNull final Bitmap favicon, @NotNull final String url) {
        G.p(favicon, "favicon");
        G.p(url, "url");
        AbstractC4521a abstractC4521aZ = AbstractC4521a.z(new InterfaceC4525e() { // from class: e4.b
            @Override // hc.InterfaceC4525e
            public final void a(InterfaceC4523c interfaceC4523c) {
                C4360c.e(url, this, favicon, interfaceC4523c);
            }
        });
        G.o(abstractC4521aZ, "create(...)");
        return abstractC4521aZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap f(@org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L12
            boolean r0 = kotlin.text.M.Q3(r3)
            if (r0 != 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L12
            r0 = 0
            char r3 = r3.charAt(r0)
            goto L14
        L12:
            r3 = 63
        L14:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            android.app.Application r1 = r2.f200235a
            int r0 = C4.c.a(r0, r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            int r1 = r2.f200238d
            android.graphics.Bitmap r3 = C4.c.c(r3, r1, r1, r0)
            java.lang.String r0 = "createRoundedLetterImage(...)"
            kotlin.jvm.internal.G.o(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C4360c.f(java.lang.String):android.graphics.Bitmap");
    }

    @NotNull
    public final q<Bitmap> g(@NotNull final String url, @NotNull final String title) {
        G.p(url, "url");
        G.p(title, "title");
        q<Bitmap> qVarD = q.D(new u() { // from class: e4.a
            @Override // hc.u
            public final void a(s sVar) {
                C4360c.h(url, this, title, sVar);
            }
        });
        G.o(qVarD, "create(...)");
        return qVarD;
    }

    public final Bitmap i(String str) {
        Bitmap bitmap;
        synchronized (this.f200239e) {
            bitmap = this.f200239e.get(str);
        }
        return bitmap;
    }
}
