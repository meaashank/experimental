package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.material.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/MapDraggableAnchors\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,897:1\n1#2:898\n*E\n"})
public final class C1849c0<T> implements J<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<T, Float> f98530a;

    public C1849c0(@NotNull Map<T, Float> map) {
        this.f98530a = map;
    }

    @Override // androidx.compose.material.J
    @Nullable
    public T a(float f10, boolean z10) {
        T next;
        Iterator<T> it = this.f98530a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f11 = z10 ? fFloatValue - f10 : f10 - fFloatValue;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f12 = z10 ? fFloatValue2 - f10 : f10 - fFloatValue2;
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material.J
    @Nullable
    public T b(float f10) {
        T next;
        Iterator<T> it = this.f98530a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f10 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material.J
    public boolean c(T t10) {
        return this.f98530a.containsKey(t10);
    }

    @Override // androidx.compose.material.J
    public float d() {
        Float fO4 = kotlin.collections.U.o4(this.f98530a.values());
        if (fO4 != null) {
            return fO4.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.J
    public float e(T t10) {
        Float f10 = this.f98530a.get(t10);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1849c0) {
            return kotlin.jvm.internal.G.g(this.f98530a, ((C1849c0) obj).f98530a);
        }
        return false;
    }

    @Override // androidx.compose.material.J
    public float f() {
        Float fW3 = kotlin.collections.U.W3(this.f98530a.values());
        if (fW3 != null) {
            return fW3.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.J
    public int getSize() {
        return this.f98530a.size();
    }

    public int hashCode() {
        return this.f98530a.hashCode() * 31;
    }

    @NotNull
    public String toString() {
        return "MapDraggableAnchors(" + this.f98530a + ')';
    }
}
