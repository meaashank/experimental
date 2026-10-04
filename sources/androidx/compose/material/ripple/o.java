package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.M0;
import e.InterfaceC4345t;
import e.T;
import java.lang.reflect.Method;
import kotlin.B0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends RippleDrawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f98900e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static Method f98901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f98902g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public K0 f98904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f98905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f98906d;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @T(23)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f98907a = new b();

        @InterfaceC4345t
        public final void a(@NotNull RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    public o(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f98903a = z10;
    }

    public final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return K0.w(j10, f10 > 1.0f ? 1.0f : f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        long jA = a(j10, f10);
        K0 k02 = this.f98904b;
        if (k02 == null ? false : B0.p(k02.f100747a, jA)) {
            return;
        }
        this.f98904b = new K0(jA);
        setColor(ColorStateList.valueOf(M0.t(jA)));
    }

    public final void c(int i10) {
        Integer num = this.f98905c;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f98905c = Integer.valueOf(i10);
        b.f98907a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @NotNull
    public Rect getDirtyBounds() {
        if (!this.f98903a) {
            this.f98906d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f98906d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f98906d;
    }
}
