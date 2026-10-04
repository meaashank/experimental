package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f89649d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f89650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f89651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f89652c;

        public /* synthetic */ a(float f10, long j10, float f11, C4969v c4969v) {
            this(f10, j10, f11);
        }

        public final long a() {
            return this.f89651b;
        }

        public final float b() {
            return this.f89652c;
        }

        public final float c() {
            return this.f89650a;
        }

        public a(float f10, long j10, float f11) {
            this.f89650a = f10;
            this.f89651b = j10;
            this.f89652c = f11;
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b extends E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f89653a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f89654b = 0;
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class c extends E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f89655a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f89656b = 0;
    }

    public E() {
    }

    public E(C4969v c4969v) {
    }
}
