package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g<T> {
    final String mPropertyName;

    public static class a extends g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FloatProperty f113221a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.f113221a = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(T t10) {
            return ((Float) this.f113221a.get(t10)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(T t10, float f10) {
            this.f113221a.setValue(t10, f10);
        }
    }

    public g(String str) {
        this.mPropertyName = str;
    }

    @T(24)
    public static <T> g<T> createFloatPropertyCompat(FloatProperty floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t10);

    public abstract void setValue(T t10, float f10);
}
