package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.InterfaceC4887e0;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.4")
public class AdaptedFunctionReference implements C, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f217867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f217868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f217869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f217870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f217871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f217872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f217873g;

    public AdaptedFunctionReference(int i10, Class cls, String str, String str2, int i11) {
        this(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.f217871e == adaptedFunctionReference.f217871e && this.f217872f == adaptedFunctionReference.f217872f && this.f217873g == adaptedFunctionReference.f217873g && G.g(this.f217867a, adaptedFunctionReference.f217867a) && G.g(this.f217868b, adaptedFunctionReference.f217868b) && this.f217869c.equals(adaptedFunctionReference.f217869c) && this.f217870d.equals(adaptedFunctionReference.f217870d);
    }

    public kotlin.reflect.h g() {
        Class cls = this.f217868b;
        if (cls == null) {
            return null;
        }
        return this.f217871e ? O.g(cls) : O.d(cls);
    }

    @Override // kotlin.jvm.internal.C
    public int getArity() {
        return this.f217872f;
    }

    public int hashCode() {
        Object obj = this.f217867a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f217868b;
        return ((((androidx.compose.foundation.text.modifiers.l.a(this.f217870d, androidx.compose.foundation.text.modifiers.l.a(this.f217869c, (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.f217871e ? 1231 : 1237)) * 31) + this.f217872f) * 31) + this.f217873g;
    }

    public String toString() {
        return O.w(this);
    }

    public AdaptedFunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f217867a = obj;
        this.f217868b = cls;
        this.f217869c = str;
        this.f217870d = str2;
        this.f217871e = (i11 & 1) == 1;
        this.f217872f = i10;
        this.f217873g = i11 >> 1;
    }
}
