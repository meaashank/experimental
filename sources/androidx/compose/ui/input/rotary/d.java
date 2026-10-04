package androidx.compose.ui.input.rotary;

import androidx.activity.C1477d;
import androidx.collection.C1550p;
import androidx.compose.animation.B;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRotaryScrollEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.android.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
@r(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102363e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f102364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f102365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f102366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102367d;

    public d(float f10, float f11, long j10, int i10) {
        this.f102364a = f10;
        this.f102365b = f11;
        this.f102366c = j10;
        this.f102367d = i10;
    }

    public final float a() {
        return this.f102365b;
    }

    public final int b() {
        return this.f102367d;
    }

    public final long c() {
        return this.f102366c;
    }

    public final float d() {
        return this.f102364a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f102364a == this.f102364a && dVar.f102365b == this.f102365b && dVar.f102366c == this.f102366c && dVar.f102367d == this.f102367d;
    }

    public int hashCode() {
        return ((C1550p.a(this.f102366c) + B.a(this.f102365b, Float.floatToIntBits(this.f102364a) * 31, 31)) * 31) + this.f102367d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f102364a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f102365b);
        sb2.append(",uptimeMillis=");
        sb2.append(this.f102366c);
        sb2.append(",deviceId=");
        return C1477d.a(sb2, this.f102367d, ')');
    }
}
