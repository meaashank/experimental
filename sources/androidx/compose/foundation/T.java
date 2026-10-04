package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import k0.C4810a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nEdgeEffectCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,157:1\n1#2:158\n149#3:159\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n88#1:159\n*E\n"})
public final class T extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f88913b;

    public T(@NotNull Context context) {
        super(context);
        this.f88912a = ((k0.h) C4810a.a(context)).a() * 1;
    }

    public final void a(float f10) {
        float f11 = this.f88913b + f10;
        this.f88913b = f11;
        if (Math.abs(f11) > this.f88912a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.f88913b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.f88913b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f88913b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.f88913b = 0.0f;
        super.onPull(f10);
    }
}
