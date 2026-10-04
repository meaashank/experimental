package in.myinnos.alphabetsindexfastscrollrecycler;

import N4.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import e.InterfaceC4337k;
import e.InterfaceC4339m;
import ec.C4375a;

/* JADX INFO: loaded from: classes7.dex */
public class IndexFastScrollRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4375a f202920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureDetector f202921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f202922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f202923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f202924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f202925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f202926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f202927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f202928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InterfaceC4337k
    public int f202929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InterfaceC4337k
    public int f202930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InterfaceC4337k
    public int f202931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f202932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InterfaceC4337k
    public int f202933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InterfaceC4337k
    public int f202934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f202935p;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return super.onFling(motionEvent, motionEvent2, f10, f11);
        }
    }

    public IndexFastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f202920a = null;
        this.f202921b = null;
        this.f202922c = true;
        this.f202923d = 12;
        this.f202924e = 20.0f;
        this.f202925f = 5.0f;
        this.f202926g = 5;
        this.f202927h = 5;
        this.f202928i = 0.6f;
        this.f202929j = -16777216;
        this.f202930k = -1;
        this.f202931l = -16777216;
        this.f202932m = 50;
        this.f202933n = -16777216;
        this.f202934o = -1;
        this.f202935p = 0.4f;
        I(context, attributeSet);
    }

    private void I(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.r.jj, 0, 0)) != null) {
            try {
                this.f202923d = typedArrayObtainStyledAttributes.getInt(l.r.sj, this.f202923d);
                this.f202924e = typedArrayObtainStyledAttributes.getFloat(l.r.uj, this.f202924e);
                this.f202925f = typedArrayObtainStyledAttributes.getFloat(l.r.tj, this.f202925f);
                this.f202926g = typedArrayObtainStyledAttributes.getInt(l.r.wj, this.f202926g);
                this.f202927h = typedArrayObtainStyledAttributes.getInt(l.r.mj, this.f202927h);
                this.f202928i = typedArrayObtainStyledAttributes.getFloat(l.r.rj, this.f202928i);
                int i10 = l.r.kj;
                if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                    this.f202929j = Color.parseColor(typedArrayObtainStyledAttributes.getString(i10));
                }
                int i11 = l.r.pj;
                if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                    this.f202930k = Color.parseColor(typedArrayObtainStyledAttributes.getString(i11));
                }
                int i12 = l.r.nj;
                if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                    this.f202931l = Color.parseColor(typedArrayObtainStyledAttributes.getString(i12));
                }
                int i13 = l.r.lj;
                if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                    this.f202929j = typedArrayObtainStyledAttributes.getColor(i13, this.f202929j);
                }
                int i14 = l.r.qj;
                if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                    this.f202930k = typedArrayObtainStyledAttributes.getColor(i14, this.f202930k);
                }
                if (typedArrayObtainStyledAttributes.hasValue(l.r.oj)) {
                    this.f202931l = typedArrayObtainStyledAttributes.getColor(i12, this.f202931l);
                }
                this.f202932m = typedArrayObtainStyledAttributes.getInt(l.r.yj, this.f202932m);
                this.f202935p = typedArrayObtainStyledAttributes.getFloat(l.r.zj, this.f202935p);
                int i15 = l.r.vj;
                if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                    this.f202933n = Color.parseColor(typedArrayObtainStyledAttributes.getString(i15));
                }
                int i16 = l.r.xj;
                if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                    this.f202934o = Color.parseColor(typedArrayObtainStyledAttributes.getString(i16));
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f202920a = new C4375a(context, this);
    }

    public void J(@InterfaceC4339m int i10) {
        this.f202920a.m(getContext().getResources().getColor(i10));
    }

    public void K(String str) {
        this.f202920a.m(Color.parseColor(str));
    }

    public void L(int i10) {
        this.f202920a.n(i10);
    }

    public void M(boolean z10) {
        this.f202920a.p(z10);
    }

    public void N(@InterfaceC4339m int i10) {
        this.f202920a.q(getContext().getResources().getColor(i10));
    }

    public void O(String str) {
        this.f202920a.q(Color.parseColor(str));
    }

    public void P(float f10) {
        this.f202920a.r(f10);
    }

    public void Q(boolean z10) {
        this.f202920a.s(z10);
        this.f202922c = z10;
    }

    public void R(int i10) {
        this.f202920a.t(i10);
    }

    public void S(@InterfaceC4339m int i10) {
        this.f202920a.o(getContext().getResources().getColor(i10));
    }

    public void T(String str) {
        this.f202920a.o(Color.parseColor(str));
    }

    public void U(float f10) {
        this.f202920a.u(f10);
    }

    public void V(float f10) {
        this.f202920a.v(f10);
    }

    public void W(@InterfaceC4339m int i10) {
        this.f202920a.w(getContext().getResources().getColor(i10));
    }

    public void X(String str) {
        this.f202920a.w(Color.parseColor(str));
    }

    public void Y(int i10) {
        this.f202920a.x(i10);
    }

    public void Z(@InterfaceC4339m int i10) {
        this.f202920a.y(getContext().getResources().getColor(i10));
    }

    public void a0(String str) {
        this.f202920a.y(Color.parseColor(str));
    }

    public void b0(int i10) {
        this.f202920a.z(i10);
    }

    public void c0(float f10) {
        this.f202920a.A(f10);
    }

    public void d0(boolean z10) {
        this.f202920a.B(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        C4375a c4375a = this.f202920a;
        if (c4375a != null) {
            c4375a.f(canvas);
        }
    }

    public void e0(Typeface typeface) {
        this.f202920a.C(typeface);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C4375a c4375a;
        if (this.f202922c && (c4375a = this.f202920a) != null && c4375a.d(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        C4375a c4375a = this.f202920a;
        if (c4375a != null) {
            c4375a.i(i10, i11, i12, i13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f202922c) {
            C4375a c4375a = this.f202920a;
            if (c4375a != null && c4375a.j(motionEvent)) {
                return true;
            }
            if (this.f202921b == null) {
                this.f202921b = new GestureDetector(getContext(), new a());
            }
            this.f202921b.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        C4375a c4375a = this.f202920a;
        if (c4375a != null) {
            c4375a.l(adapter);
        }
    }

    public IndexFastScrollRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f202920a = null;
        this.f202921b = null;
        this.f202922c = true;
        this.f202923d = 12;
        this.f202924e = 20.0f;
        this.f202925f = 5.0f;
        this.f202926g = 5;
        this.f202927h = 5;
        this.f202928i = 0.6f;
        this.f202929j = -16777216;
        this.f202930k = -1;
        this.f202931l = -16777216;
        this.f202932m = 50;
        this.f202933n = -16777216;
        this.f202934o = -1;
        this.f202935p = 0.4f;
        I(context, attributeSet);
    }

    public IndexFastScrollRecyclerView(Context context) {
        super(context, null);
        this.f202920a = null;
        this.f202921b = null;
        this.f202922c = true;
        this.f202923d = 12;
        this.f202924e = 20.0f;
        this.f202925f = 5.0f;
        this.f202926g = 5;
        this.f202927h = 5;
        this.f202928i = 0.6f;
        this.f202929j = -16777216;
        this.f202930k = -1;
        this.f202931l = -16777216;
        this.f202932m = 50;
        this.f202933n = -16777216;
        this.f202934o = -1;
        this.f202935p = 0.4f;
    }
}
