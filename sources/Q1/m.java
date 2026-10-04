package q1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.D;
import e.InterfaceC4330d;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
@InterfaceC4330d
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f226729d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f226730e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f226731f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<androidx.emoji2.text.flatbuffer.n> f226732g = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f226733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final androidx.emoji2.text.f f226734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f226735c = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public m(@NonNull androidx.emoji2.text.f fVar, @D(from = 0) int i10) {
        this.f226734b = fVar;
        this.f226733a = i10;
    }

    public void a(@NonNull Canvas canvas, float f10, float f11, @NonNull Paint paint) {
        Typeface typeface = this.f226734b.f113360d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.f226734b.f113358b, this.f226733a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface2);
    }

    public int b(int i10) {
        return h().F(i10);
    }

    public int c() {
        return h().I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short d() {
        return h().L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e() {
        return this.f226735c & 3;
    }

    public int f() {
        return h().S();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int g() {
        return h().T();
    }

    public final androidx.emoji2.text.flatbuffer.n h() {
        ThreadLocal<androidx.emoji2.text.flatbuffer.n> threadLocal = f226732g;
        androidx.emoji2.text.flatbuffer.n nVar = threadLocal.get();
        if (nVar == null) {
            nVar = new androidx.emoji2.text.flatbuffer.n();
            threadLocal.set(nVar);
        }
        this.f226734b.f113357a.J(nVar, this.f226733a);
        return nVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short i() {
        return h().U();
    }

    @NonNull
    public Typeface j() {
        return this.f226734b.f113360d;
    }

    public int k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    public boolean m() {
        return (this.f226735c & 4) > 0;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void n() {
        if (m()) {
            this.f226735c = 4;
        } else {
            this.f226735c = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void o(boolean z10) {
        int iE = e();
        if (z10) {
            this.f226735c = iE | 4;
        } else {
            this.f226735c = iE;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void p(boolean z10) {
        int i10 = this.f226735c & 4;
        this.f226735c = z10 ? i10 | 2 : i10 | 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(g()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(C4.q.f17581a);
        }
        return sb2.toString();
    }
}
