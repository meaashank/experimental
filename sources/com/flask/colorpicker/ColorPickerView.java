package com.flask.colorpicker;

import J4.d;
import J4.e;
import J4.f;
import K4.d;
import L4.c;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.flask.colorpicker.a;
import com.flask.colorpicker.slider.AlphaSlider;
import com.flask.colorpicker.slider.LightnessSlider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ColorPickerView extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final float f148554B = 1.5f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f148555A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f148556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Canvas f148557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f148558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Canvas f148559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f148560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f148561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f148562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f148563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f148564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer[] f148565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f148566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f148567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f148568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint f148569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Paint f148570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f148571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public J4.b f148572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<d> f148573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<e> f148574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LightnessSlider f148575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AlphaSlider f148576u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EditText f148577v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextWatcher f148578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f148579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f148580y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f148581z;

    public enum WHEEL_TYPE {
        FLOWER,
        CIRCLE;

        public static WHEEL_TYPE indexOf(int i10) {
            return i10 != 0 ? i10 != 1 ? FLOWER : CIRCLE : FLOWER;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            try {
                ColorPickerView.this.l(Color.parseColor(charSequence.toString()), false);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object tag;
            if (view == null || (tag = view.getTag()) == null || !(tag instanceof Integer)) {
                return;
            }
            ColorPickerView.this.z(((Integer) tag).intValue());
        }
    }

    public ColorPickerView(Context context) {
        super(context);
        this.f148561f = 8;
        this.f148562g = 1.0f;
        this.f148563h = 1.0f;
        this.f148564i = 0;
        this.f148565j = new Integer[]{null, null, null, null, null};
        this.f148566k = 0;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(0);
        this.f148569n = bVar.f58415a;
        d.b bVar2 = new d.b();
        bVar2.f58415a.setColor(0);
        this.f148570o = bVar2.f58415a;
        this.f148571p = new d.b().f58415a;
        this.f148573r = new ArrayList<>();
        this.f148574s = new ArrayList<>();
        this.f148578w = new a();
        i(context, null);
    }

    public void A(boolean z10) {
        this.f148560e = z10;
    }

    public final void B() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth <= 0) {
            return;
        }
        Bitmap bitmap = this.f148556a;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            this.f148556a = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.f148557b = new Canvas(this.f148556a);
            this.f148571p.setShader(K4.d.b(26));
        }
        Bitmap bitmap2 = this.f148558c;
        if (bitmap2 == null || bitmap2.getWidth() != measuredWidth) {
            this.f148558c = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.f148559d = new Canvas(this.f148558c);
        }
        d();
        invalidate();
    }

    public void a(J4.d dVar) {
        this.f148573r.add(dVar);
    }

    public void b(e eVar) {
        this.f148574s.add(eVar);
    }

    public void c(int i10, int i11) {
        ArrayList<J4.d> arrayList = this.f148573r;
        if (arrayList == null || i10 == i11) {
            return;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            J4.d dVar = arrayList.get(i12);
            i12++;
            try {
                dVar.a(i11);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void d() {
        Canvas canvas = this.f148557b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        this.f148559d.drawColor(0, mode);
        if (this.f148580y == null) {
            return;
        }
        float width = this.f148557b.getWidth() / 2.0f;
        float f10 = (width - 1.5374999f) - (width / this.f148561f);
        L4.b bVarA = this.f148580y.a();
        bVarA.f58635a = this.f148561f;
        bVarA.f58636b = f10;
        bVarA.f58637c = (f10 / (r4 - 1)) / 2.0f;
        bVarA.f58638d = 1.5374999f;
        bVarA.f58639e = this.f148563h;
        bVarA.f58640f = this.f148562g;
        bVarA.f58641g = this.f148557b;
        this.f148580y.b(bVarA);
        this.f148580y.d();
    }

    public final J4.b e(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        char c10 = 1;
        char c11 = 0;
        double d10 = 3.141592653589793d;
        double d11 = 180.0d;
        double dCos = Math.cos((((double) fArr[0]) * 3.141592653589793d) / 180.0d) * ((double) fArr[1]);
        double dSin = Math.sin((((double) fArr[0]) * 3.141592653589793d) / 180.0d) * ((double) fArr[1]);
        J4.b bVar = null;
        double d12 = Double.MAX_VALUE;
        for (J4.b bVar2 : this.f148580y.c()) {
            float[] fArrB = bVar2.b();
            char c12 = c10;
            char c13 = c11;
            double d13 = dCos;
            double d14 = d10;
            double dCos2 = Math.cos((((double) fArrB[c13]) * d14) / d11) * ((double) fArrB[c12]);
            double d15 = d11;
            double d16 = d13 - dCos2;
            double dSin2 = dSin - (Math.sin((((double) fArrB[c13]) * d14) / d15) * ((double) fArrB[c12]));
            double d17 = (dSin2 * dSin2) + (d16 * d16);
            if (d17 < d12) {
                d12 = d17;
                bVar = bVar2;
            }
            c10 = c12;
            c11 = c13;
            dCos = d13;
            d10 = d14;
            d11 = d15;
        }
        return bVar;
    }

    public final J4.b f(float f10, float f11) {
        J4.b bVar = null;
        double d10 = Double.MAX_VALUE;
        for (J4.b bVar2 : this.f148580y.c()) {
            double dG = bVar2.g(f10, f11);
            if (d10 > dG) {
                bVar = bVar2;
                d10 = dG;
            }
        }
        return bVar;
    }

    public Integer[] g() {
        return this.f148565j;
    }

    public int h() {
        J4.b bVar = this.f148572q;
        return f.a(this.f148563h, bVar != null ? f.c(bVar.a(), this.f148562g) : 0);
    }

    public final void i(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.f149870I3);
        this.f148561f = typedArrayObtainStyledAttributes.getInt(a.m.f149906M3, 10);
        this.f148567l = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(a.m.f149915N3, -1));
        this.f148568m = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(a.m.f149969T3, -1));
        c cVarA = K4.c.a(WHEEL_TYPE.indexOf(typedArrayObtainStyledAttributes.getInt(a.m.f149987V3, 0)));
        this.f148581z = typedArrayObtainStyledAttributes.getResourceId(a.m.f149888K3, 0);
        this.f148555A = typedArrayObtainStyledAttributes.getResourceId(a.m.f149933P3, 0);
        y(cVarA);
        s(this.f148561f);
        u(this.f148567l.intValue(), true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void j(AlphaSlider alphaSlider) {
        this.f148576u = alphaSlider;
        if (alphaSlider != null) {
            alphaSlider.k(this);
            this.f148576u.j(h());
        }
    }

    public void k(float f10) {
        Integer num;
        int iH = h();
        this.f148563h = f10;
        Integer numValueOf = Integer.valueOf(Color.HSVToColor(f.b(f10), this.f148572q.c(this.f148562g)));
        this.f148567l = numValueOf;
        EditText editText = this.f148577v;
        if (editText != null) {
            editText.setText(f.e(numValueOf.intValue(), this.f148576u != null));
        }
        LightnessSlider lightnessSlider = this.f148575t;
        if (lightnessSlider != null && (num = this.f148567l) != null) {
            lightnessSlider.j(num.intValue());
        }
        c(iH, this.f148567l.intValue());
        B();
        invalidate();
    }

    public void l(int i10, boolean z10) {
        u(i10, z10);
        B();
        invalidate();
    }

    public void m(EditText editText) {
        this.f148577v = editText;
        if (editText != null) {
            editText.setVisibility(0);
            this.f148577v.addTextChangedListener(this.f148578w);
            n(this.f148568m.intValue());
        }
    }

    public void n(int i10) {
        this.f148568m = Integer.valueOf(i10);
        EditText editText = this.f148577v;
        if (editText != null) {
            editText.setTextColor(i10);
        }
    }

    public void o(LinearLayout linearLayout, Integer num) {
        if (linearLayout == null) {
            return;
        }
        this.f148579x = linearLayout;
        if (num == null) {
            num = 0;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount == 0 || linearLayout.getVisibility() != 0) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout2 = (LinearLayout) childAt;
                if (i10 == num.intValue()) {
                    linearLayout2.setBackgroundColor(-1);
                }
                ImageView imageView = (ImageView) linearLayout2.findViewById(a.g.f149210B0);
                imageView.setClickable(true);
                imageView.setTag(Integer.valueOf(i10));
                imageView.setOnClickListener(new b());
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        J4.b bVar;
        super.onDraw(canvas);
        canvas.drawColor(this.f148564i);
        float width = ((canvas.getWidth() / 1.025f) / this.f148561f) / 2.0f;
        if (this.f148556a == null || (bVar = this.f148572q) == null) {
            return;
        }
        this.f148569n.setColor(Color.HSVToColor(bVar.c(this.f148562g)));
        this.f148569n.setAlpha((int) (this.f148563h * 255.0f));
        float f10 = 4.0f + width;
        this.f148559d.drawCircle(this.f148572q.d(), this.f148572q.e(), f10, this.f148571p);
        this.f148559d.drawCircle(this.f148572q.d(), this.f148572q.e(), f10, this.f148569n);
        d.b bVar2 = new d.b();
        bVar2.f58415a.setColor(-1);
        bVar2.f58415a.setStyle(Paint.Style.STROKE);
        bVar2.f58415a.setStrokeWidth(0.5f * width);
        bVar2.h(PorterDuff.Mode.CLEAR);
        this.f148570o = bVar2.f58415a;
        if (this.f148560e) {
            this.f148557b.drawCircle(this.f148572q.d(), this.f148572q.e(), (this.f148570o.getStrokeWidth() / 2.0f) + width, this.f148570o);
        }
        canvas.drawBitmap(this.f148556a, 0.0f, 0.0f, (Paint) null);
        this.f148559d.drawCircle(this.f148572q.d(), this.f148572q.e(), (this.f148570o.getStrokeWidth() / 2.0f) + width, this.f148570o);
        canvas.drawBitmap(this.f148558c, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f148581z != 0) {
            j((AlphaSlider) getRootView().findViewById(this.f148581z));
        }
        if (this.f148555A != 0) {
            x((LightnessSlider) getRootView().findViewById(this.f148555A));
        }
        B();
        this.f148572q = e(this.f148567l.intValue());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 0) {
            i10 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i10) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != 0) {
            i11 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i11) : 0;
        }
        if (i11 < i10) {
            i10 = i11;
        }
        setMeasuredDimension(i10, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        B();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int iH = h();
                ArrayList<e> arrayList = this.f148574s;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        e eVar = arrayList.get(i10);
                        i10++;
                        try {
                            eVar.getClass();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                r(iH);
                q(iH);
                p(iH);
                invalidate();
                return true;
            }
            if (action != 2) {
                return true;
            }
        }
        int iH2 = h();
        this.f148572q = f(motionEvent.getX(), motionEvent.getY());
        int iH3 = h();
        c(iH2, iH3);
        this.f148567l = Integer.valueOf(iH3);
        r(iH3);
        B();
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        B();
        this.f148572q = e(this.f148567l.intValue());
    }

    public final void p(int i10) {
        Integer[] numArr;
        int i11;
        LinearLayout linearLayout = this.f148579x;
        if (linearLayout == null || (numArr = this.f148565j) == null || (i11 = this.f148566k) > numArr.length || numArr[i11] == null || linearLayout.getChildCount() == 0 || this.f148579x.getVisibility() != 0) {
            return;
        }
        View childAt = this.f148579x.getChildAt(this.f148566k);
        if (childAt instanceof LinearLayout) {
            ((ImageView) ((LinearLayout) childAt).findViewById(a.g.f149210B0)).setImageDrawable(new J4.c(i10));
        }
    }

    public final void q(int i10) {
        EditText editText = this.f148577v;
        if (editText == null) {
            return;
        }
        editText.setText(f.e(i10, this.f148576u != null));
    }

    public final void r(int i10) {
        LightnessSlider lightnessSlider = this.f148575t;
        if (lightnessSlider != null) {
            lightnessSlider.j(i10);
        }
        AlphaSlider alphaSlider = this.f148576u;
        if (alphaSlider != null) {
            alphaSlider.j(i10);
        }
    }

    public void s(int i10) {
        this.f148561f = Math.max(2, i10);
        invalidate();
    }

    public final void t(int i10) {
        int childCount = this.f148579x.getChildCount();
        if (childCount == 0 || this.f148579x.getVisibility() != 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f148579x.getChildAt(i11);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                if (i11 == i10) {
                    linearLayout.setBackgroundColor(-1);
                } else {
                    linearLayout.setBackgroundColor(0);
                }
            }
        }
    }

    public void u(int i10, boolean z10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        this.f148563h = f.d(i10);
        this.f148562g = fArr[2];
        this.f148565j[this.f148566k] = Integer.valueOf(i10);
        this.f148567l = Integer.valueOf(i10);
        p(i10);
        r(i10);
        if (this.f148577v != null && z10) {
            q(i10);
        }
        this.f148572q = e(i10);
    }

    public void v(Integer[] numArr, int i10) {
        this.f148565j = numArr;
        this.f148566k = i10;
        Integer num = numArr[i10];
        if (num == null) {
            num = -1;
        }
        u(num.intValue(), true);
    }

    public void w(float f10) {
        Integer num;
        int iH = h();
        this.f148562g = f10;
        if (this.f148572q != null) {
            Integer numValueOf = Integer.valueOf(Color.HSVToColor(f.b(this.f148563h), this.f148572q.c(f10)));
            this.f148567l = numValueOf;
            EditText editText = this.f148577v;
            if (editText != null) {
                editText.setText(f.e(numValueOf.intValue(), this.f148576u != null));
            }
            AlphaSlider alphaSlider = this.f148576u;
            if (alphaSlider != null && (num = this.f148567l) != null) {
                alphaSlider.j(num.intValue());
            }
            c(iH, this.f148567l.intValue());
            B();
            invalidate();
        }
    }

    public void x(LightnessSlider lightnessSlider) {
        this.f148575t = lightnessSlider;
        if (lightnessSlider != null) {
            lightnessSlider.k(this);
            this.f148575t.j(h());
        }
    }

    public void y(c cVar) {
        this.f148580y = cVar;
        invalidate();
    }

    public void z(int i10) {
        Integer[] numArr = this.f148565j;
        if (numArr == null || numArr.length < i10) {
            return;
        }
        this.f148566k = i10;
        t(i10);
        Integer num = this.f148565j[i10];
        if (num == null) {
            return;
        }
        l(num.intValue(), true);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148561f = 8;
        this.f148562g = 1.0f;
        this.f148563h = 1.0f;
        this.f148564i = 0;
        this.f148565j = new Integer[]{null, null, null, null, null};
        this.f148566k = 0;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(0);
        this.f148569n = bVar.f58415a;
        d.b bVar2 = new d.b();
        bVar2.f58415a.setColor(0);
        this.f148570o = bVar2.f58415a;
        this.f148571p = new d.b().f58415a;
        this.f148573r = new ArrayList<>();
        this.f148574s = new ArrayList<>();
        this.f148578w = new a();
        i(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f148561f = 8;
        this.f148562g = 1.0f;
        this.f148563h = 1.0f;
        this.f148564i = 0;
        this.f148565j = new Integer[]{null, null, null, null, null};
        this.f148566k = 0;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(0);
        this.f148569n = bVar.f58415a;
        d.b bVar2 = new d.b();
        bVar2.f58415a.setColor(0);
        this.f148570o = bVar2.f58415a;
        this.f148571p = new d.b().f58415a;
        this.f148573r = new ArrayList<>();
        this.f148574s = new ArrayList<>();
        this.f148578w = new a();
        i(context, attributeSet);
    }

    @TargetApi(21)
    public ColorPickerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f148561f = 8;
        this.f148562g = 1.0f;
        this.f148563h = 1.0f;
        this.f148564i = 0;
        this.f148565j = new Integer[]{null, null, null, null, null};
        this.f148566k = 0;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(0);
        this.f148569n = bVar.f58415a;
        d.b bVar2 = new d.b();
        bVar2.f58415a.setColor(0);
        this.f148570o = bVar2.f58415a;
        this.f148571p = new d.b().f58415a;
        this.f148573r = new ArrayList<>();
        this.f148574s = new ArrayList<>();
        this.f148578w = new a();
        i(context, attributeSet);
    }
}
