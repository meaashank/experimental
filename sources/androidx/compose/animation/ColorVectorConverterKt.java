package androidx.compose.animation;

import androidx.compose.animation.core.C1601o;
import androidx.compose.animation.core.H0;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.M0;
import androidx.compose.ui.graphics.colorspace.AbstractC2015c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ColorVectorConverterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ed.l<AbstractC2015c, H0<K0, C1601o>> f87235a = new ed.l<AbstractC2015c, H0<K0, C1601o>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // ed.l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final H0<K0, C1601o> invoke(@NotNull final AbstractC2015c abstractC2015c) {
            return VectorConvertersKt.a(new ed.l<K0, C1601o>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @NotNull
                public final C1601o e(long j10) {
                    androidx.compose.ui.graphics.colorspace.h.f100991a.getClass();
                    long jU = K0.u(j10, androidx.compose.ui.graphics.colorspace.h.f101013w);
                    return new C1601o(K0.A(jU), K0.I(jU), K0.G(jU), K0.C(jU));
                }

                @Override // ed.l
                public /* synthetic */ C1601o invoke(K0 k02) {
                    return e(k02.f100747a);
                }
            }, new ed.l<C1601o, K0>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                public final long e(@NotNull C1601o c1601o) {
                    float f10 = c1601o.f88167c;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    float f11 = c1601o.f88168d;
                    if (f11 < -0.5f) {
                        f11 = -0.5f;
                    }
                    if (f11 > 0.5f) {
                        f11 = 0.5f;
                    }
                    float f12 = c1601o.f88169e;
                    float f13 = f12 >= -0.5f ? f12 : -0.5f;
                    float f14 = f13 <= 0.5f ? f13 : 0.5f;
                    float f15 = c1601o.f88166b;
                    float f16 = f15 >= 0.0f ? f15 : 0.0f;
                    float f17 = f16 <= 1.0f ? f16 : 1.0f;
                    androidx.compose.ui.graphics.colorspace.h.f100991a.getClass();
                    return K0.u(M0.a(f10, f11, f14, f17, androidx.compose.ui.graphics.colorspace.h.f101013w), abstractC2015c);
                }

                @Override // ed.l
                public /* synthetic */ K0 invoke(C1601o c1601o) {
                    return new K0(e(c1601o));
                }
            });
        }
    };

    @NotNull
    public static final ed.l<AbstractC2015c, H0<K0, C1601o>> a(@NotNull K0.a aVar) {
        return f87235a;
    }
}
