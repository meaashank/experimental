package S;

import D0.d;
import D0.n;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.activity.C1477d;
import androidx.compose.runtime.internal.r;
import dd.g;
import e.InterfaceC4337k;
import e.b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68053d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final XmlPullParser f68054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g
    @NotNull
    public final androidx.compose.ui.graphics.vector.g f68056c;

    public a(@NotNull XmlPullParser xmlPullParser, int i10) {
        this.f68054a = xmlPullParser;
        this.f68055b = i10;
        this.f68056c = new androidx.compose.ui.graphics.vector.g();
    }

    public static a d(a aVar, XmlPullParser xmlPullParser, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            xmlPullParser = aVar.f68054a;
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f68055b;
        }
        aVar.getClass();
        return new a(xmlPullParser, i10);
    }

    @NotNull
    public final XmlPullParser a() {
        return this.f68054a;
    }

    public final int b() {
        return this.f68055b;
    }

    @NotNull
    public final a c(@NotNull XmlPullParser xmlPullParser, int i10) {
        return new a(xmlPullParser, i10);
    }

    public final int e() {
        return this.f68055b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f68054a, aVar.f68054a) && this.f68055b == aVar.f68055b;
    }

    public final float f(@NotNull TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        r(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(@NotNull TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        r(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int h(@NotNull TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        r(typedArray.getChangingConfigurations());
        return i12;
    }

    public int hashCode() {
        return (this.f68054a.hashCode() * 31) + this.f68055b;
    }

    public final boolean i(@NotNull TypedArray typedArray, @NotNull String str, @b0 int i10, boolean z10) {
        boolean zE = n.e(typedArray, this.f68054a, str, i10, z10);
        r(typedArray.getChangingConfigurations());
        return zE;
    }

    @Nullable
    public final ColorStateList j(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String str, @b0 int i10) {
        ColorStateList colorStateListG = n.g(typedArray, this.f68054a, theme, str, i10);
        r(typedArray.getChangingConfigurations());
        return colorStateListG;
    }

    @NotNull
    public final d k(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String str, @b0 int i10, @InterfaceC4337k int i11) {
        d dVarI = n.i(typedArray, this.f68054a, theme, str, i10, i11);
        r(typedArray.getChangingConfigurations());
        return dVarI;
    }

    public final float l(@NotNull TypedArray typedArray, @NotNull String str, @b0 int i10, float f10) {
        float fJ = n.j(typedArray, this.f68054a, str, i10, f10);
        r(typedArray.getChangingConfigurations());
        return fJ;
    }

    public final int m(@NotNull TypedArray typedArray, @NotNull String str, @b0 int i10, int i11) {
        int iK = n.k(typedArray, this.f68054a, str, i10, i11);
        r(typedArray.getChangingConfigurations());
        return iK;
    }

    @Nullable
    public final String n(@NotNull TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        r(typedArray.getChangingConfigurations());
        return string;
    }

    @NotNull
    public final XmlPullParser o() {
        return this.f68054a;
    }

    @NotNull
    public final TypedArray p(@NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull int[] iArr) {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, iArr);
        r(typedArrayS.getChangingConfigurations());
        return typedArrayS;
    }

    public final void q(int i10) {
        this.f68055b = i10;
    }

    public final void r(int i10) {
        this.f68055b = i10 | this.f68055b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f68054a);
        sb2.append(", config=");
        return C1477d.a(sb2, this.f68055b, ')');
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i10, int i11, C4969v c4969v) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
