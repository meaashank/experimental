package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.i;
import e.T;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final AssetManager f116154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f116155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final i.d f116156c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final File f116158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f116159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f116160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final String f116161h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public e[] f116163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public byte[] f116164k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f116162i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f116157d = d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull i.d dVar, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f116154a = assetManager;
        this.f116155b = executor;
        this.f116156c = dVar;
        this.f116159f = str;
        this.f116160g = str2;
        this.f116161h = str3;
        this.f116158e = file;
    }

    @Nullable
    public static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return p.f116255e;
            case 26:
                return p.f116254d;
            case 27:
                return p.f116253c;
            case 28:
            case 29:
            case 30:
                return p.f116252b;
            case 31:
            case 32:
            case 33:
            case 34:
                return p.f116251a;
            default:
                return null;
        }
    }

    public static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Nullable
    public final d b(e[] eVarArr, byte[] bArr) {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f116154a, this.f116161h);
        } catch (FileNotFoundException e10) {
            this.f116156c.a(9, e10);
        } catch (IOException e11) {
            this.f116156c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f116163j = null;
            this.f116156c.a(8, e12);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f116163j = n.q(inputStreamG, n.o(inputStreamG, n.f116225g), bArr, eVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.f116162i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean e() {
        if (this.f116157d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f116158e.exists()) {
            try {
                this.f116158e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f116158e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f116162i = true;
        return true;
    }

    @Nullable
    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f116160g);
        } catch (FileNotFoundException e10) {
            this.f116156c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f116156c.a(7, e11);
            return null;
        }
    }

    @Nullable
    public final InputStream g(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f116156c.b(5, null);
            }
            return null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d h() {
        d dVarB;
        c();
        if (this.f116157d != null) {
            InputStream inputStreamF = f(this.f116154a);
            if (inputStreamF != null) {
                this.f116163j = i(inputStreamF);
            }
            e[] eVarArr = this.f116163j;
            if (eVarArr != null && j() && (dVarB = b(eVarArr, this.f116157d)) != null) {
                return dVarB;
            }
        }
        return this;
    }

    @Nullable
    public final e[] i(InputStream inputStream) {
        try {
            try {
                try {
                    e[] eVarArrW = n.w(inputStream, n.o(inputStream, n.f116224f), this.f116159f);
                    try {
                        inputStream.close();
                        return eVarArrW;
                    } catch (IOException e10) {
                        this.f116156c.a(7, e10);
                        return eVarArrW;
                    }
                } catch (IllegalStateException e11) {
                    this.f116156c.a(8, e11);
                    return null;
                }
            } catch (IOException e12) {
                this.f116156c.a(7, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f116156c.a(7, e13);
            }
        }
    }

    public final void k(final int i10, @Nullable final Object obj) {
        this.f116155b.execute(new Runnable() { // from class: androidx.profileinstaller.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f116151a.f116156c.a(i10, obj);
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d l() {
        ByteArrayOutputStream byteArrayOutputStream;
        e[] eVarArr = this.f116163j;
        byte[] bArr = this.f116157d;
        if (eVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(n.f116224f);
                    byteArrayOutputStream.write(bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f116156c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f116156c.a(8, e11);
            }
            if (!n.B(byteArrayOutputStream, bArr, eVarArr)) {
                this.f116156c.a(5, null);
                this.f116163j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f116164k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f116163j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean m() {
        byte[] bArr = this.f116164k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f116158e);
                    try {
                        f.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f116164k = null;
                this.f116163j = null;
            }
        } catch (FileNotFoundException e10) {
            k(6, e10);
            return false;
        } catch (IOException e11) {
            k(7, e11);
            return false;
        }
    }
}
