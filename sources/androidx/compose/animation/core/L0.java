package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4864f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f87714a = Integer.MAX_VALUE;

    @kotlin.jvm.internal.V({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1078:1\n1549#2:1079\n1620#2,3:1080\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n*L\n936#1:1079\n936#1:1080,3\n*E\n"})
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<C1574a0> f87715a;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        public a(AbstractC1603p abstractC1603p, float f10, float f11) {
            md.l lVarY1 = md.u.Y1(0, abstractC1603p.b());
            ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(lVarY1, 10));
            AbstractC4864f0 it = lVarY1.iterator();
            while (((md.k) it).f221144c) {
                arrayList.add(new C1574a0(f10, f11, abstractC1603p.a(it.nextInt())));
            }
            this.f87715a = arrayList;
        }

        @Override // androidx.compose.animation.core.r
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1574a0 get(int i10) {
            return this.f87715a.get(i10);
        }
    }

    public static final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C1574a0 f87716a;

        public b(float f10, float f11) {
            this.f87716a = new C1574a0(f10, f11, 0.0f, 4, null);
        }

        @NotNull
        public C1574a0 a(int i10) {
            return this.f87716a;
        }

        @Override // androidx.compose.animation.core.r
        public W get(int i10) {
            return this.f87716a;
        }
    }

    public static final long b(@NotNull O0<?> o02, long j10) {
        return md.u.M(j10 - ((long) o02.f()), 0L, o02.g());
    }

    public static final <V extends AbstractC1603p> r c(V v10, float f10, float f11) {
        return v10 != null ? new a(v10, f10, f11) : new b(f10, f11);
    }

    public static final <V extends AbstractC1603p> long d(@NotNull K0<V> k02, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return k02.b(v10, v11, v12) / 1000000;
    }

    @NotNull
    public static final <V extends AbstractC1603p> V e(@NotNull K0<V> k02, long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) k02.e(j10 * 1000000, v10, v11, v12);
    }
}
