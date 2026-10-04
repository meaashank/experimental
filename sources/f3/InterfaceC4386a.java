package f3;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: f3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4386a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f200521a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f200522b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f200523c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f200524d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f200525e = 0;

    /* JADX INFO: renamed from: f3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0731a {
        @NonNull
        byte[] a(int i10);

        @NonNull
        Bitmap b(int i10, int i11, @NonNull Bitmap.Config config);

        void c(@NonNull Bitmap bitmap);

        @NonNull
        int[] d(int i10);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    /* JADX INFO: renamed from: f3.a$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a(@NonNull Bitmap.Config config);

    void advance();

    @Deprecated
    int b();

    void c();

    void clear();

    int d();

    void e(@NonNull c cVar, @NonNull byte[] bArr);

    void f(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i10);

    int g();

    @NonNull
    ByteBuffer getData();

    int getHeight();

    int getStatus();

    int getWidth();

    @Nullable
    Bitmap h();

    int i();

    int j(int i10);

    int k();

    void l(@NonNull c cVar, @NonNull ByteBuffer byteBuffer);

    int m();

    int n();

    int read(@Nullable InputStream inputStream, int i10);

    int read(@Nullable byte[] bArr);
}
