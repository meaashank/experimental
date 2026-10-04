package i;

import D0.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.J;
import e.T;
import i.C4539b;
import j.C4772a;
import j.C4773b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class f extends C4539b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f202763r = "StateListDrawableCompat";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f202764s = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f202765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f202766q;

    public static class a extends C4539b.d {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int[][] f202767J;

        public a(a aVar, f fVar, Resources resources) {
            super(aVar, fVar, resources);
            if (aVar != null) {
                this.f202767J = aVar.f202767J;
            } else {
                this.f202767J = new int[this.f202726g.length][];
            }
        }

        public int D(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.f202767J[iA] = iArr;
            return iA;
        }

        public int E(int[] iArr) {
            int[][] iArr2 = this.f202767J;
            int i10 = this.f202727h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new f(this, null);
        }

        @Override // i.C4539b.d
        public void r(int i10, int i11) {
            super.r(i10, i11);
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f202767J, 0, iArr, 0, i10);
            this.f202767J = iArr;
        }

        @Override // i.C4539b.d
        public void v() {
            int[][] iArr = this.f202767J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f202767J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f202767J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new f(this, resources);
        }
    }

    public f() {
        this(null, null);
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.f202765p;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = n.s(resources, theme, attributeSet, C4773b.C0804b.f212461w);
                int resourceId = typedArrayS.getResourceId(C4773b.C0804b.f212462x, -1);
                Drawable drawableJ = resourceId > 0 ? J.h().j(context, resourceId) : null;
                typedArrayS.recycle();
                int[] iArrP = p(attributeSet);
                if (drawableJ == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C4538a.f202675D);
                    }
                    drawableJ = C4772a.c.a(resources, xmlPullParser, attributeSet, theme);
                }
                aVar.D(iArrP, drawableJ);
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.f202765p;
        aVar.f202723d |= C4772a.c.b(typedArray);
        aVar.f202728i = typedArray.getBoolean(C4773b.C0804b.f212457s, aVar.f202728i);
        aVar.f202731l = typedArray.getBoolean(C4773b.C0804b.f212458t, aVar.f202731l);
        aVar.f202711A = typedArray.getInt(C4773b.C0804b.f212459u, aVar.f202711A);
        aVar.f202712B = typedArray.getInt(C4773b.C0804b.f212460v, aVar.f202712B);
        aVar.f202743x = typedArray.getBoolean(C4773b.C0804b.f212455q, aVar.f202743x);
    }

    @Override // i.C4539b, android.graphics.drawable.Drawable
    @T(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // i.C4539b
    public void b() {
        super.b();
        this.f202766q = false;
    }

    @Override // i.C4539b
    public void i(@NonNull C4539b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f202765p = (a) dVar;
        }
    }

    @Override // i.C4539b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // i.C4539b, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f202766q) {
            super.mutate();
            this.f202765p.v();
            this.f202766q = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f202765p.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // i.C4539b
    public a o() {
        return new a(this.f202765p, this, null);
    }

    @Override // i.C4539b, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iE = this.f202765p.E(iArr);
        if (iE < 0) {
            iE = this.f202765p.E(StateSet.WILD_CARD);
        }
        return h(iE) || zOnStateChange;
    }

    public int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    public int q() {
        return this.f202765p.f202727h;
    }

    public Drawable r(int i10) {
        return this.f202765p.h(i10);
    }

    public int s(int[] iArr) {
        return this.f202765p.E(iArr);
    }

    public a t() {
        return this.f202765p;
    }

    public int[] u(int i10) {
        return this.f202765p.f202767J[i10];
    }

    public void v(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, C4773b.C0804b.f212454p);
        setVisible(typedArrayS.getBoolean(C4773b.C0804b.f212456r, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public f(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public f(@Nullable a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }
}
