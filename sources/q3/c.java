package Q3;

import android.graphics.Bitmap;
import androidx.compose.animation.C1635o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f65828e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f65830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Bitmap f65831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f65832d;

    public c(int i10, @NotNull String title, @Nullable Bitmap bitmap, boolean z10) {
        G.p(title, "title");
        this.f65829a = i10;
        this.f65830b = title;
        this.f65831c = bitmap;
        this.f65832d = z10;
    }

    public static /* synthetic */ c f(c cVar, int i10, String str, Bitmap bitmap, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f65829a;
        }
        if ((i11 & 2) != 0) {
            str = cVar.f65830b;
        }
        if ((i11 & 4) != 0) {
            bitmap = cVar.f65831c;
        }
        if ((i11 & 8) != 0) {
            z10 = cVar.f65832d;
        }
        return cVar.e(i10, str, bitmap, z10);
    }

    public final int a() {
        return this.f65829a;
    }

    @NotNull
    public final String b() {
        return this.f65830b;
    }

    @Nullable
    public final Bitmap c() {
        return this.f65831c;
    }

    public final boolean d() {
        return this.f65832d;
    }

    @NotNull
    public final c e(int i10, @NotNull String title, @Nullable Bitmap bitmap, boolean z10) {
        G.p(title, "title");
        return new c(i10, title, bitmap, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f65829a == cVar.f65829a && G.g(this.f65830b, cVar.f65830b) && G.g(this.f65831c, cVar.f65831c) && this.f65832d == cVar.f65832d;
    }

    @Nullable
    public final Bitmap g() {
        return this.f65831c;
    }

    public final int h() {
        return this.f65829a;
    }

    public int hashCode() {
        int iA = androidx.compose.foundation.text.modifiers.l.a(this.f65830b, this.f65829a * 31, 31);
        Bitmap bitmap = this.f65831c;
        return C1635o.a(this.f65832d) + ((iA + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    @NotNull
    public final String i() {
        return this.f65830b;
    }

    public final boolean j() {
        return this.f65832d;
    }

    @NotNull
    public String toString() {
        return "TabViewState(id=" + this.f65829a + ", title=" + this.f65830b + ", favicon=" + this.f65831c + ", isForegroundTab=" + this.f65832d + ")";
    }
}
