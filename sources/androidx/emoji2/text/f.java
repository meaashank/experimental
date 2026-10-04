package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import androidx.emoji2.text.flatbuffer.o;
import e.InterfaceC4330d;
import e.T;
import e.f0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import q1.k;
import q1.m;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
@InterfaceC4330d
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f113355e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f113356f = "EmojiCompat.MetadataRepo.create";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final o f113357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final char[] f113358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f113359c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Typeface f113360d;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f113361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m f113362b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray<a> sparseArray = this.f113361a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public final m b() {
            return this.f113362b;
        }

        public void c(@NonNull m mVar, int i10, int i11) {
            a aVarA = a(mVar.b(i10));
            if (aVarA == null) {
                aVarA = new a(1);
                this.f113361a.put(mVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(mVar, i10 + 1, i11);
            } else {
                aVarA.f113362b = mVar;
            }
        }

        public a(int i10) {
            this.f113361a = new SparseArray<>(i10);
        }
    }

    public f(@NonNull Typeface typeface, @NonNull o oVar) {
        this.f113360d = typeface;
        this.f113357a = oVar;
        this.f113358b = new char[oVar.K() * 2];
        a(oVar);
    }

    @NonNull
    public static f b(@NonNull AssetManager assetManager, @NonNull String str) throws IOException {
        try {
            androidx.core.os.T.b(f113356f);
            f fVar = new f(Typeface.createFromAsset(assetManager, str), k.b(assetManager, str));
            Trace.endSection();
            return fVar;
        } catch (Throwable th) {
            androidx.core.os.T.d();
            throw th;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static f c(@NonNull Typeface typeface) {
        try {
            androidx.core.os.T.b(f113356f);
            f fVar = new f(typeface, new o());
            Trace.endSection();
            return fVar;
        } catch (Throwable th) {
            androidx.core.os.T.d();
            throw th;
        }
    }

    @NonNull
    public static f d(@NonNull Typeface typeface, @NonNull InputStream inputStream) throws IOException {
        try {
            androidx.core.os.T.b(f113356f);
            f fVar = new f(typeface, k.c(inputStream));
            Trace.endSection();
            return fVar;
        } catch (Throwable th) {
            androidx.core.os.T.d();
            throw th;
        }
    }

    @NonNull
    public static f e(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        try {
            androidx.core.os.T.b(f113356f);
            f fVar = new f(typeface, k.d(byteBuffer));
            Trace.endSection();
            return fVar;
        } catch (Throwable th) {
            androidx.core.os.T.d();
            throw th;
        }
    }

    public final void a(o oVar) {
        int iK = oVar.K();
        for (int i10 = 0; i10 < iK; i10++) {
            m mVar = new m(this, i10);
            Character.toChars(mVar.g(), this.f113358b, i10 * 2);
            k(mVar);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] f() {
        return this.f113358b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o g() {
        return this.f113357a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int h() {
        return this.f113357a.S();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public a i() {
        return this.f113359c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface j() {
        return this.f113360d;
    }

    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void k(@NonNull m mVar) {
        t.m(mVar, "emoji metadata cannot be null");
        t.b(mVar.c() > 0, "invalid metadata codepoint length");
        this.f113359c.c(mVar, 0, mVar.c() - 1);
    }
}
