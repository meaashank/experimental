package com.github.ahmadaghazadeh.editor.processor;

import B0.C0920d;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import com.github.ahmadaghazadeh.editor.document.commons.LineObject;
import com.github.ahmadaghazadeh.editor.processor.style.SyntaxHighlightSpan;
import com.github.ahmadaghazadeh.editor.processor.utils.text.TextChange;
import com.github.ahmadaghazadeh.editor.processor.utils.text.UndoStack;
import com.github.ahmadaghazadeh.editor.widget.CodeEditor;
import e.InterfaceC4337k;
import e.g0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k5.b;
import n5.C5255a;
import o5.InterfaceC5327a;
import p5.C5393a;
import q5.ViewOnTouchListenerC5434b;
import s5.C5574a;
import s5.C5575b;
import s7.C5579a;
import t5.C5612a;
import t5.C5613b;
import t5.C5615d;
import t5.InterfaceC5614c;
import v5.C5686b;
import v5.C5687c;

/* JADX INFO: loaded from: classes3.dex */
public class TextProcessor extends AppCompatMultiAutoCompleteTextView implements View.OnKeyListener {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f150537j0 = "TextProcessor";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f150538k0 = "    ";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f150539A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f150540B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f150541C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f150542D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f150543E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC5614c f150544F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CodeEditor f150545G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ClipboardManager f150546H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Context f150547I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Scroller f150548J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public InterfaceC5327a[] f150549K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public VelocityTracker f150550L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C5686b f150551M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public TypedValue f150552N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public TextChange f150553O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f150554P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f150555Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public UndoStack f150556R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public UndoStack f150557S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C5574a f150558T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C5574a f150559U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C5574a f150560V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C5574a f150561W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C5575b f150562a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C5575b f150563b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C5575b f150564c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C5575b f150565d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f150566e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C5575b f150567e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f150568f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C5575b f150569f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f150570g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public C5575b f150571g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f150572h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public BackgroundColorSpan f150573h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f150574i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public BackgroundColorSpan f150575i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f150576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f150577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f150578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f150579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f150580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f150581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f150582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f150583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f150584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f150585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f150586t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f150587u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f150588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f150589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f150590x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f150591y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f150592z;

    public final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextProcessor.this.f150582p = 0;
            TextProcessor.o(editable, false, true, true);
            TextProcessor textProcessor = TextProcessor.this;
            textProcessor.i0(textProcessor.getLayout(), TextProcessor.this.getEditableText(), TextProcessor.this.getLineHeight(), TextProcessor.this.getLineCount(), TextProcessor.this.getScrollY(), TextProcessor.this.getHeight());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            TextProcessor textProcessor = TextProcessor.this;
            textProcessor.f150582p -= i11;
            textProcessor.f150584r = charSequence.subSequence(i10, i10 + i11).toString();
            TextProcessor.this.k0(i10, i11);
            TextProcessor.this.n0(charSequence, i10, i11);
            TextProcessor.this.g();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            TextProcessor textProcessor = TextProcessor.this;
            textProcessor.f150582p += i12;
            textProcessor.f150583q = charSequence.subSequence(i10, i10 + i12).toString();
            TextProcessor.this.w(i10, i12);
            TextProcessor.this.l0(charSequence, i10, i12);
            TextProcessor.this.o0(charSequence, i10, i12);
            TextProcessor textProcessor2 = TextProcessor.this;
            textProcessor2.f150584r = "";
            textProcessor2.f150583q = "";
            if (textProcessor2.f150574i) {
                textProcessor2.N();
            }
        }
    }

    public TextProcessor(Context context) {
        super(context, null);
        this.f150566e = true;
        this.f150568f = true;
        this.f150570g = true;
        this.f150572h = true;
        this.f150574i = true;
        this.f150576j = true;
        this.f150577k = true;
        this.f150578l = true;
        this.f150585s = 0.0f;
        this.f150586t = 0.0f;
        this.f150589w = 0;
        this.f150590x = 0;
        this.f150592z = 0;
        this.f150539A = 0;
        this.f150540B = false;
        this.f150554P = false;
        this.f150555Q = false;
        this.f150547I = context;
    }

    public static /* synthetic */ boolean K(View view, MotionEvent motionEvent) {
        return false;
    }

    public static /* synthetic */ void c(TextProcessor textProcessor, int i10, int i11, String str, int i12) {
        textProcessor.f150555Q = true;
        textProcessor.getText().replace(i10, i11 + i10, str);
        textProcessor.f150557S.g();
        TextChange textChangeG = textProcessor.f150557S.g();
        if (!str.equals("")) {
            textChangeG.f150599a = str;
            textProcessor.f150557S.h(textChangeG);
        }
        Selection.setSelection(textProcessor.getText(), i12);
        textProcessor.f150555Q = false;
    }

    public static /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        return false;
    }

    @g0
    public static void o(Editable editable, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
                editable.removeSpan(foregroundColorSpan);
            }
        }
        if (z11) {
            for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) editable.getSpans(0, editable.length(), BackgroundColorSpan.class)) {
                editable.removeSpan(backgroundColorSpan);
            }
        }
        if (z12) {
            for (SyntaxHighlightSpan syntaxHighlightSpan : (SyntaxHighlightSpan[]) editable.getSpans(0, editable.length(), SyntaxHighlightSpan.class)) {
                editable.removeSpan(syntaxHighlightSpan);
            }
        }
    }

    public String A(int i10) {
        return z(this.f150545G.o().k(i10));
    }

    public Editable B() {
        return getSelectionEnd() > getSelectionStart() ? (Editable) getText().subSequence(getSelectionStart(), getSelectionEnd()) : (Editable) getText().subSequence(getSelectionEnd(), getSelectionStart());
    }

    public void C(int i10) {
        int i11 = i10 - 1;
        if (i11 == -1) {
            CodeEditor codeEditor = this.f150545G;
            this.f150547I.getString(b.n.f215910W0);
            codeEditor.getClass();
        } else {
            if (i11 < this.f150545G.m()) {
                setSelection(this.f150545G.k(i11));
                return;
            }
            CodeEditor codeEditor2 = this.f150545G;
            this.f150547I.getString(b.n.f215914X0);
            codeEditor2.getClass();
        }
    }

    public void D(CodeEditor codeEditor) {
        this.f150545G = codeEditor;
        if (isInEditMode()) {
            return;
        }
        F();
        G();
        E();
        Q();
    }

    public void E() {
        this.f150587u = ViewConfiguration.get(this.f150547I).getScaledMaximumFlingVelocity() * 100;
        this.f150591y = C5612a.a(this, 4);
        setImeOptions(268435456);
        setOnKeyListener(this);
    }

    public void F() {
        this.f150544F = new C5613b(this.f150547I);
        this.f150546H = (ClipboardManager) this.f150547I.getSystemService(C5579a.f238596f);
        this.f150548J = new Scroller(this.f150547I);
        this.f150549K = new InterfaceC5327a[0];
        this.f150551M = new C5686b();
    }

    public void G() {
        Resources.Theme theme = this.f150547I.getTheme();
        this.f150558T = new C5574a(true, false);
        TypedValue typedValue = new TypedValue();
        Resources resources = getContext().getResources();
        int i10 = b.f.f215098Y;
        int color = resources.getColor(i10);
        int i11 = b.d.f214675Q1;
        if (!theme.resolveAttribute(i11, typedValue, true)) {
            theme.resolveAttribute(i11, typedValue, true);
            color = typedValue.data;
            if (color == 0) {
                color = getContext().getResources().getColor(i10);
            }
        }
        this.f150558T.setColor(color);
        this.f150558T.setTextAlign(Paint.Align.RIGHT);
        this.f150558T.setTextSize(getTextSize());
        C5574a c5574a = new C5574a(false, false);
        this.f150560V = c5574a;
        c5574a.setColor(this.f150558T.getColor());
        this.f150560V.setStyle(Paint.Style.STROKE);
        this.f150559U = new C5574a(false, false);
        TypedValue typedValue2 = new TypedValue();
        int i12 = b.d.f214666P1;
        if (!theme.resolveAttribute(i12, typedValue2, true)) {
            theme.resolveAttribute(i12, typedValue2, true);
            color = typedValue2.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215095X);
            }
        }
        this.f150559U.setColor(color);
        this.f150561W = new C5574a(false, false);
        int i13 = b.d.f214720V1;
        if (!theme.resolveAttribute(i13, typedValue2, true)) {
            theme.resolveAttribute(i13, typedValue2, true);
            color = typedValue2.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215109c0);
            }
        }
        this.f150561W.setColor(color);
        this.f150552N = new TypedValue();
        int i14 = b.d.f214626K6;
        if (!theme.resolveAttribute(i14, typedValue2, true)) {
            theme.resolveAttribute(i14, typedValue2, true);
            color = typedValue2.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215076Q1);
            }
        }
        this.f150562a0 = new C5575b(color, false, false);
        TypedValue typedValue3 = new TypedValue();
        int i15 = b.d.f214644M6;
        if (!theme.resolveAttribute(i15, typedValue3, true)) {
            theme.resolveAttribute(i15, typedValue3, true);
            color = typedValue3.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215082S1);
            }
        }
        this.f150563b0 = new C5575b(color, false, false);
        TypedValue typedValue4 = new TypedValue();
        int i16 = b.d.f214590G6;
        if (!theme.resolveAttribute(i16, typedValue4, true)) {
            theme.resolveAttribute(i16, typedValue4, true);
            color = typedValue4.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215064M1);
            }
        }
        this.f150564c0 = new C5575b(color, false, false);
        TypedValue typedValue5 = new TypedValue();
        int i17 = b.d.f214608I6;
        if (!theme.resolveAttribute(i17, typedValue5, true)) {
            theme.resolveAttribute(i17, typedValue5, true);
            color = typedValue5.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215070O1);
            }
        }
        this.f150565d0 = new C5575b(color, false, false);
        TypedValue typedValue6 = new TypedValue();
        int i18 = b.d.f214617J6;
        if (!theme.resolveAttribute(i18, typedValue6, true)) {
            theme.resolveAttribute(i18, typedValue6, true);
            color = typedValue6.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215073P1);
            }
        }
        this.f150567e0 = new C5575b(color, false, false);
        TypedValue typedValue7 = new TypedValue();
        int i19 = b.d.f214635L6;
        if (!theme.resolveAttribute(i19, typedValue7, true)) {
            theme.resolveAttribute(i19, typedValue7, true);
            color = typedValue7.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215079R1);
            }
        }
        this.f150569f0 = new C5575b(color, false, false);
        TypedValue typedValue8 = new TypedValue();
        int i20 = b.d.f214599H6;
        if (!theme.resolveAttribute(i20, typedValue8, true)) {
            theme.resolveAttribute(i20, typedValue8, true);
            color = typedValue8.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215067N1);
            }
        }
        this.f150571g0 = new C5575b(color, false, true);
        TypedValue typedValue9 = new TypedValue();
        int i21 = b.d.f214575F1;
        if (!theme.resolveAttribute(i21, typedValue9, true)) {
            theme.resolveAttribute(i21, typedValue9, true);
            color = typedValue9.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215080S);
            }
        }
        this.f150573h0 = new BackgroundColorSpan(color);
        this.f150575i0 = new BackgroundColorSpan(color);
        TypedValue typedValue10 = new TypedValue();
        int i22 = b.d.f214621K1;
        if (!theme.resolveAttribute(i22, typedValue10, true)) {
            theme.resolveAttribute(i22, typedValue10, true);
            color = typedValue10.data;
            if (color == 0) {
                color = getContext().getResources().getColor(b.f.f215083T);
            }
        }
        Y(color);
        TypedValue typedValue11 = new TypedValue();
        int color2 = getContext().getResources().getColor(b.f.f215112d0);
        int i23 = b.d.f214729W1;
        if (!theme.resolveAttribute(i23, typedValue11, true)) {
            theme.resolveAttribute(i23, typedValue11, true);
            color2 = typedValue11.data;
            if (color2 == 0) {
                color2 = getContext().getResources().getColor(i10);
            }
        }
        setHighlightColor(color2);
    }

    public void H(CharSequence charSequence) {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int iMax = Math.max(0, selectionStart);
        int iMax2 = Math.max(0, selectionEnd);
        int iMin = Math.min(iMax, iMax2);
        try {
            getText().delete(iMin, Math.max(iMin, iMax2));
            getText().insert(iMin, charSequence);
        } catch (Exception e10) {
            C5615d.b(f150537j0, e10);
        }
    }

    public void I() {
        this.f150590x = (int) Math.ceil(getPaint().getFontSpacing());
        this.f150590x = (int) getPaint().measureText("M");
    }

    public final void J() {
        invalidate(getPaddingLeft(), getPaddingTop() + getScrollY(), getWidth(), getHeight() + getPaddingTop() + getScrollY());
    }

    public void L() {
        if (this.f150545G.l() != null) {
            ArrayList<n5.b> arrayList = new ArrayList<>();
            for (String str : this.f150545G.l().a()) {
                arrayList.add(new n5.b(0, str));
            }
            f0(arrayList);
        }
    }

    public void M(int i10, int i11) {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        C5615d.a(f150537j0, "onDropdownChangeSize: " + rect);
        setDropDownWidth((int) (((float) i10) * 0.5f));
        setDropDownHeight((int) (((float) i11) * 0.5f));
        this.f150543E = i11;
        N();
    }

    public void N() {
        try {
            Layout layout = getLayout();
            if (layout != null) {
                int selectionStart = getSelectionStart();
                int lineForOffset = layout.getLineForOffset(selectionStart);
                int lineBaseline = layout.getLineBaseline(lineForOffset);
                int lineAscent = layout.getLineAscent(lineForOffset);
                Rect rect = new Rect();
                getPaint().getTextBounds("A", 0, 1, rect);
                rect.width();
                setDropDownHorizontalOffset(((int) layout.getPrimaryHorizontal(selectionStart)) + this.f150588v);
                y();
                getDropDownHeight();
                int i10 = this.f150590x;
                setDropDownVerticalOffset((((((int) (((lineBaseline + lineAscent) + this.f150590x) - getScrollY())) * 2) / i10) * (i10 / 2)) + (-this.f150543E) + (i10 / 2));
            }
        } catch (Exception e10) {
            C5615d.b(f150537j0, e10);
        }
    }

    public void O() {
        if (this.f150546H.getPrimaryClip() == null || this.f150546H.getPrimaryClip().toString().equals("")) {
            CodeEditor codeEditor = this.f150545G;
            Context context = getContext();
            int i10 = b.n.f216042x1;
            context.getString(i10);
            codeEditor.getClass();
            C5615d.a(f150537j0, getContext().getString(i10));
        }
        if (this.f150546H.hasPrimaryClip()) {
            if (getSelectionEnd() > getSelectionStart()) {
                getText().replace(getSelectionStart(), getSelectionEnd(), this.f150546H.getPrimaryClip().getItemAt(0).coerceToText(this.f150547I));
            } else {
                getText().replace(getSelectionEnd(), getSelectionStart(), this.f150546H.getPrimaryClip().getItemAt(0).coerceToText(this.f150547I));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean P(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L32
            r2 = 2
            if (r0 == r2) goto Le
            r4 = 3
            if (r0 == r4) goto L32
            goto L35
        Le:
            int r0 = r4.getPointerCount()
            if (r0 != r2) goto L35
            float r4 = r3.x(r4)
            boolean r0 = r3.f150540B
            if (r0 != 0) goto L24
            float r0 = r3.f150542D
            float r0 = r0 / r4
            r3.f150541C = r0
            r3.f150540B = r1
            goto L35
        L24:
            float r0 = r3.f150541C
            float r0 = r0 * r4
            r3.f150542D = r0
            r3.p0()
            float r4 = r3.f150542D
            r3.setTextSize(r4)
            goto L35
        L32:
            r4 = 0
            r3.f150540B = r4
        L35:
            boolean r4 = r3.f150540B
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.ahmadaghazadeh.editor.processor.TextProcessor.P(android.view.MotionEvent):boolean");
    }

    public void Q() {
        postInvalidate();
        refreshDrawableState();
        I();
    }

    public void R() {
        TextChange textChangeG = this.f150556R.g();
        if (textChangeG == null) {
            String str = f150537j0;
            Context context = this.f150547I;
            int i10 = b.n.f216047y1;
            C5615d.a(str, context.getString(i10));
            CodeEditor codeEditor = this.f150545G;
            this.f150547I.getString(i10);
            codeEditor.getClass();
            return;
        }
        if (textChangeG.f150601c < 0) {
            C5615d.c(f150537j0, "redo(): unknown error", null);
            this.f150557S.d();
            return;
        }
        this.f150554P = true;
        Editable text = getText();
        int i11 = textChangeG.f150601c;
        text.replace(i11, textChangeG.f150600b.length() + i11, textChangeG.f150599a);
        Selection.setSelection(getText(), textChangeG.f150599a.length() + textChangeG.f150601c);
        this.f150557S.h(textChangeG);
        this.f150554P = false;
    }

    public void S() {
        if (this.f150544F.e()) {
            setInputType(393217);
        } else {
            setInputType(917505);
        }
    }

    public void T() {
        if (this.f150544F.k().equals("droid_sans_mono")) {
            setTypeface(C5393a.a(this.f150547I, C5393a.f226344e));
        } else if (this.f150544F.k().equals("source_code_pro")) {
            setTypeface(C5393a.a(this.f150547I, C5393a.f226343d));
        } else if (this.f150544F.k().equals("roboto")) {
            setTypeface(C5393a.a(this.f150547I, C5393a.f226341b));
        } else {
            setTypeface(C5393a.a(this.f150547I, C5393a.f226342c));
        }
        this.f150558T.setTypeface(getTypeface());
        setPaintFlags(getPaintFlags() | 128);
    }

    public void U(String str, String str2) {
        o(getEditableText(), false, true, true);
        setText(getText().toString().replaceAll(str, str2));
    }

    public void V() {
        int iMin = Math.min(getSelectionStart(), getSelectionEnd());
        int iMax = Math.max(getSelectionStart(), getSelectionEnd());
        if (iMax > iMin) {
            iMax--;
        }
        while (iMax < getText().length() && getText().charAt(iMax) != '\n') {
            iMax++;
        }
        while (iMin > 0 && getText().charAt(iMin - 1) != '\n') {
            iMin--;
        }
        setSelection(iMin, iMax);
    }

    public void W(boolean z10) {
        this.f150570g = z10;
    }

    public void X(boolean z10) {
        this.f150574i = z10;
        if (!z10) {
            setTokenizer(null);
            return;
        }
        L();
        setTokenizer(new C5687c());
        setThreshold(2);
    }

    public void Y(@InterfaceC4337k int i10) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(this);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(this);
            Drawable drawable = C0920d.getDrawable(this.f150547I, i11);
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            }
            Drawable[] drawableArr = {drawable, drawable};
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (Exception e10) {
            C5615d.b(f150537j0, e10);
        }
    }

    public void Z(boolean z10) {
        this.f150572h = z10;
    }

    public void a0(boolean z10) {
        this.f150577k = z10;
    }

    public void b0(boolean z10) {
        this.f150578l = z10;
    }

    public void c0(boolean z10) {
        this.f150576j = z10;
        if (!z10) {
            setOnTouchListener(new ViewOnTouchListenerC5434b());
            return;
        }
        this.f150542D = getTextSize() / getResources().getDisplayMetrics().scaledDensity;
        setOnTouchListener(new View.OnTouchListener() { // from class: q5.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f226812a.P(motionEvent);
            }
        });
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        if (isInEditMode() || !this.f150548J.computeScrollOffset()) {
            return;
        }
        scrollTo(this.f150548J.getCurrX(), this.f150548J.getCurrY());
    }

    public void d0(boolean z10) {
        setFocusable(!z10);
        setFocusableInTouchMode(!z10);
    }

    public void e0(boolean z10) {
        boolean z11 = this.f150566e;
        this.f150566e = z10;
        if (z11 != z10) {
            m0();
        }
    }

    public void f() {
    }

    public void f0(ArrayList<n5.b> arrayList) {
        setAdapter(new C5255a(this.f150547I, b.m.f215766R, arrayList));
    }

    public void g() {
        Scroller scroller = this.f150548J;
        if (scroller == null || scroller.isFinished()) {
            return;
        }
        this.f150548J.abortAnimation();
    }

    public void g0(boolean z10) {
        this.f150568f = z10;
        if (z10) {
            i0(getLayout(), getEditableText(), getLineHeight(), getLineCount(), getScrollY(), getHeight());
        } else {
            o(getEditableText(), false, false, true);
        }
    }

    public void h0(int i10, int i11) {
        getText().setSpan(this.f150573h0, i10, i10 + 1, 33);
        getText().setSpan(this.f150575i0, i11, i11 + 1, 33);
    }

    @g0
    public void i0(Layout layout, Editable editable, int i10, int i11, int i12, int i13) {
        int i14;
        if (!this.f150568f || layout == null) {
            return;
        }
        int lineCount = (i12 / i10) - 10;
        int lineCount2 = ((i12 + i13) / i10) + 11;
        if (lineCount < 0) {
            lineCount = 0;
        }
        if (lineCount2 > layout.getLineCount()) {
            lineCount2 = layout.getLineCount();
        }
        if (lineCount > layout.getLineCount()) {
            lineCount = layout.getLineCount();
        }
        if (lineCount2 < 0 || lineCount < 0) {
            return;
        }
        this.f150592z = lineCount;
        this.f150539A = lineCount2;
        int lineStart = (lineCount >= 0 || lineCount >= i11) ? layout.getLineStart(lineCount) : 0;
        int lineStart2 = lineCount2 < i11 ? layout.getLineStart(lineCount2) : layout.getLineStart(i11);
        if (this.f150545G.l() != null) {
            Matcher matcher = this.f150545G.l().g().matcher(editable.subSequence(lineStart, lineStart2));
            while (matcher.find()) {
                editable.setSpan(new SyntaxHighlightSpan(this.f150562a0, lineStart, lineStart2), matcher.start() + lineStart, matcher.end() + lineStart, 33);
            }
            Matcher matcher2 = this.f150545G.l().i().matcher(editable.subSequence(lineStart, lineStart2));
            while (matcher2.find()) {
                editable.setSpan(new SyntaxHighlightSpan(this.f150563b0, lineStart, lineStart2), matcher2.start() + lineStart, matcher2.end() + lineStart, 33);
            }
            Matcher matcher3 = this.f150545G.l().c().matcher(editable.subSequence(lineStart, lineStart2));
            while (matcher3.find()) {
                editable.setSpan(new SyntaxHighlightSpan(this.f150564c0, lineStart, lineStart2), matcher3.start() + lineStart, matcher3.end() + lineStart, 33);
            }
            Matcher matcher4 = this.f150545G.l().e().matcher(editable.subSequence(lineStart, lineStart2));
            while (matcher4.find()) {
                editable.setSpan(new SyntaxHighlightSpan(this.f150565d0, lineStart, lineStart2), matcher4.start() + lineStart, matcher4.end() + lineStart, 33);
            }
            Matcher matcher5 = this.f150545G.l().f().matcher(editable.subSequence(lineStart, lineStart2));
            while (matcher5.find()) {
                editable.setSpan(new SyntaxHighlightSpan(this.f150567e0, lineStart, lineStart2), matcher5.start() + lineStart, matcher5.end() + lineStart, 33);
            }
            Matcher matcher6 = this.f150545G.l().h().matcher(editable.subSequence(lineStart, lineStart2));
            while (matcher6.find()) {
                for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) editable.getSpans(matcher6.start() + lineStart, matcher6.end() + lineStart, ForegroundColorSpan.class)) {
                    editable.removeSpan(foregroundColorSpan);
                }
                editable.setSpan(new SyntaxHighlightSpan(this.f150569f0, lineStart, lineStart2), matcher6.start() + lineStart, matcher6.end() + lineStart, 33);
            }
            Matcher matcher7 = this.f150545G.l().d().matcher(editable.subSequence(lineStart, lineStart2));
            while (matcher7.find()) {
                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(lineStart, matcher7.end() + lineStart, ForegroundColorSpan.class);
                int length = foregroundColorSpanArr.length;
                while (true) {
                    if (i14 < length) {
                        ForegroundColorSpan foregroundColorSpan2 = foregroundColorSpanArr[i14];
                        int spanStart = editable.getSpanStart(foregroundColorSpan2);
                        int spanEnd = editable.getSpanEnd(foregroundColorSpan2);
                        i14 = ((matcher7.start() + lineStart < spanStart || matcher7.start() + lineStart > spanEnd || matcher7.end() + lineStart <= spanEnd) && (matcher7.start() + lineStart < lineStart + spanEnd || matcher7.start() + lineStart > spanEnd)) ? i14 + 1 : 0;
                    } else {
                        for (ForegroundColorSpan foregroundColorSpan3 : (ForegroundColorSpan[]) editable.getSpans(matcher7.start() + lineStart, matcher7.end() + lineStart, ForegroundColorSpan.class)) {
                            editable.removeSpan(foregroundColorSpan3);
                        }
                        editable.setSpan(new SyntaxHighlightSpan(this.f150571g0, lineStart, lineStart2), matcher7.start() + lineStart, matcher7.end() + lineStart, 33);
                    }
                }
            }
        }
        new Handler().post(new Runnable() { // from class: q5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f226818a.J();
            }
        });
    }

    public void j0() {
        TextChange textChangeG = this.f150557S.g();
        if (textChangeG == null) {
            String str = f150537j0;
            Context context = this.f150547I;
            int i10 = b.n.f216052z1;
            C5615d.a(str, context.getString(i10));
            CodeEditor codeEditor = this.f150545G;
            this.f150547I.getString(i10);
            codeEditor.getClass();
            return;
        }
        int i11 = textChangeG.f150601c;
        if (i11 < 0) {
            C5615d.c(f150537j0, "undo(): unknown error", null);
            this.f150557S.d();
            return;
        }
        this.f150554P = true;
        if (i11 < 0) {
            textChangeG.f150601c = 0;
        }
        if (textChangeG.f150601c > getText().length()) {
            textChangeG.f150601c = getText().length();
        }
        int length = textChangeG.f150599a.length() + textChangeG.f150601c;
        if (length < 0) {
            length = 0;
        }
        if (length > getText().length()) {
            length = getText().length();
        }
        getText().replace(textChangeG.f150601c, length, textChangeG.f150600b);
        Selection.setSelection(getText(), textChangeG.f150600b.length() + textChangeG.f150601c);
        this.f150556R.h(textChangeG);
        this.f150554P = false;
    }

    public final void k0(int i10, int i11) {
        this.f150580n = i10;
        this.f150579m = i10 + i11;
    }

    public final void l0(CharSequence charSequence, int i10, int i11) {
        String string = charSequence.subSequence(i10, i11 + i10).toString();
        this.f150581o = string;
        this.f150545G.C(this.f150580n, this.f150579m, string);
    }

    public void m(InterfaceC5327a interfaceC5327a) {
        InterfaceC5327a[] interfaceC5327aArr = this.f150549K;
        int length = interfaceC5327aArr.length;
        InterfaceC5327a[] interfaceC5327aArr2 = new InterfaceC5327a[length + 1];
        System.arraycopy(interfaceC5327aArr, 0, interfaceC5327aArr2, 0, interfaceC5327aArr.length);
        interfaceC5327aArr2[length] = interfaceC5327a;
        this.f150549K = interfaceC5327aArr2;
    }

    public void m0() {
        if (!this.f150566e || this.f150545G == null || getLayout() == null) {
            if (this.f150591y != getPaddingLeft()) {
                int i10 = this.f150591y;
                setPadding(i10, i10, getPaddingRight(), getPaddingBottom());
                return;
            }
            return;
        }
        TextPaint paint = getLayout().getPaint();
        if (paint != null) {
            this.f150589w = Integer.toString(this.f150545G.m()).length();
            float f10 = 0.0f;
            int i11 = 0;
            for (int i12 = 0; i12 <= 9; i12++) {
                float fMeasureText = paint.measureText(Integer.toString(i12));
                if (fMeasureText > f10) {
                    i11 = i12;
                    f10 = fMeasureText;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            int i13 = this.f150589w;
            if (i13 < 3) {
                i13 = 3;
            }
            for (int i14 = 0; i14 < i13; i14++) {
                sb2.append(Integer.toString(i11));
            }
            this.f150588v = ((int) paint.measureText(sb2.toString())) + this.f150591y;
            int paddingLeft = getPaddingLeft();
            int i15 = this.f150588v;
            int i16 = this.f150591y;
            if (paddingLeft != i15 + i16) {
                setPadding(i15 + i16, i16, getPaddingRight(), getPaddingBottom());
            }
        }
    }

    public void n(int i10) {
        getText().removeSpan(this.f150573h0);
        getText().removeSpan(this.f150575i0);
        if (!this.f150570g || this.f150545G.l() == null || i10 <= 0 || i10 > getText().length()) {
            return;
        }
        int i11 = i10 - 1;
        char cCharAt = getText().charAt(i11);
        for (int i12 = 0; i12 < this.f150545G.l().b().length; i12++) {
            if (this.f150545G.l().b()[i12] == cCharAt) {
                char c10 = this.f150545G.l().b()[(i12 + 3) % 6];
                int i13 = 1;
                if (i12 <= 2) {
                    int i14 = i10;
                    while (true) {
                        if (i14 >= getText().length()) {
                            break;
                        }
                        if (getText().charAt(i14) == c10) {
                            i13--;
                        }
                        if (getText().charAt(i14) == cCharAt) {
                            i13++;
                        }
                        if (i13 == 0) {
                            h0(i11, i14);
                            break;
                        }
                        i14++;
                    }
                } else {
                    int i15 = i10 - 2;
                    while (true) {
                        if (i15 < 0) {
                            break;
                        }
                        if (getText().charAt(i15) == c10) {
                            i13--;
                        }
                        if (getText().charAt(i15) == cCharAt) {
                            i13++;
                        }
                        if (i13 == 0) {
                            h0(i15, i11);
                            break;
                        }
                        i15--;
                    }
                }
            }
        }
    }

    public final void n0(CharSequence charSequence, int i10, int i11) {
        if (this.f150554P) {
            return;
        }
        if (i11 >= 1048576) {
            this.f150557S.i();
            this.f150556R.i();
            this.f150553O = null;
        } else {
            TextChange textChange = new TextChange();
            this.f150553O = textChange;
            textChange.f150600b = charSequence.subSequence(i10, i11 + i10).toString();
            this.f150553O.f150601c = i10;
        }
    }

    public final void o0(CharSequence charSequence, int i10, int i11) {
        TextChange textChange;
        if (this.f150554P || (textChange = this.f150553O) == null) {
            return;
        }
        if (i11 < 1048576) {
            textChange.f150599a = charSequence.subSequence(i10, i11 + i10).toString();
            TextChange textChange2 = this.f150553O;
            if (i10 == textChange2.f150601c && (textChange2.f150600b.length() > 0 || this.f150553O.f150599a.length() > 0)) {
                TextChange textChange3 = this.f150553O;
                if (!textChange3.f150600b.equals(textChange3.f150599a)) {
                    this.f150557S.h(this.f150553O);
                    this.f150556R.i();
                }
            }
        } else {
            this.f150557S.i();
            this.f150556R.i();
        }
        this.f150553O = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        Canvas canvas2;
        CodeEditor codeEditor;
        int iN;
        if (isInEditMode()) {
            return;
        }
        Layout layout = getLayout();
        if (layout == null || (codeEditor = this.f150545G) == null || !this.f150572h || (iN = codeEditor.n(getSelectionStart())) != this.f150545G.n(getSelectionEnd())) {
            canvas2 = canvas;
        } else {
            int iK = this.f150545G.k(iN);
            int iJ = this.f150545G.j(iN);
            int lineForOffset = layout.getLineForOffset(iK);
            int lineForOffset2 = layout.getLineForOffset(iJ);
            int i10 = this.f150588v;
            if (!this.f150566e) {
                i10 = 0;
            }
            canvas.drawRect(i10, getPaddingTop() + layout.getLineTop(lineForOffset), getPaddingRight() + getPaddingLeft() + layout.getWidth(), getPaddingTop() + layout.getLineBottom(lineForOffset2), this.f150561W);
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (layout == null || !this.f150566e) {
            return;
        }
        canvas2.drawRect(getScrollX(), getScrollY(), getScrollX() + this.f150588v, getHeight() + getScrollY(), this.f150559U);
        int paddingTop = getPaddingTop();
        int iA = this.f150551M.a(this);
        int scrollX = getScrollX() + (this.f150588v - (this.f150591y / 2));
        if (this.f150545G != null) {
            int iB = this.f150551M.b(this);
            int i11 = -1;
            int i12 = iB >= 2 ? iB - 2 : 0;
            while (i12 <= iA) {
                int iN2 = this.f150545G.n(getLayout().getLineStart(i12));
                if (iN2 != i11) {
                    canvas2.drawText(Integer.toString(iN2 + 1), scrollX, layout.getLineBaseline(i12) + paddingTop, this.f150558T);
                }
                i12++;
                i11 = iN2;
            }
            canvas2.drawLine(getScrollX() + this.f150588v, getScrollY(), getScrollX() + this.f150588v, getHeight() + r14, this.f150560V);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!keyEvent.isCtrlPressed()) {
            if (i10 != 61) {
                try {
                    return super.onKeyDown(i10, keyEvent);
                } catch (Exception e10) {
                    C5615d.b(f150537j0, e10);
                    return false;
                }
            }
            int iMax = Math.max(getSelectionStart(), 0);
            int iMax2 = Math.max(getSelectionEnd(), 0);
            getText().replace(Math.min(iMax, iMax2), Math.max(iMax, iMax2), f150538k0, 0, 4);
            return true;
        }
        if (i10 == 29) {
            selectAll();
            return true;
        }
        if (i10 == 50) {
            O();
            return true;
        }
        if (i10 == 67) {
            r();
            return true;
        }
        if (i10 == 31) {
            p();
            return true;
        }
        if (i10 == 32) {
            s();
            return true;
        }
        switch (i10) {
            case 52:
                q();
                return true;
            case 53:
                R();
                return true;
            case 54:
                j0();
                return true;
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        try {
            return super.onSaveInstanceState();
        } catch (Exception e10) {
            C5615d.b(f150537j0, e10);
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        InterfaceC5327a[] interfaceC5327aArr = this.f150549K;
        if (interfaceC5327aArr != null) {
            for (InterfaceC5327a interfaceC5327a : interfaceC5327aArr) {
                interfaceC5327a.onScrollChanged(i10, i11, i12, i13);
            }
        }
        if (this.f150592z > this.f150551M.b(this) || this.f150539A < this.f150551M.a(this)) {
            o(getEditableText(), false, false, true);
            i0(getLayout(), getEditableText(), getLineHeight(), getLineCount(), getScrollY(), getHeight());
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        if (i10 == i11) {
            n(i10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        i0(getLayout(), getEditableText(), getLineHeight(), getLineCount(), getScrollY(), getHeight());
        for (InterfaceC5327a interfaceC5327a : this.f150549K) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            interfaceC5327a.onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        }
        if (this.f150574i) {
            M(i10, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.f150548J.isFinished()) {
                this.f150548J.abortAnimation();
            }
            VelocityTracker velocityTracker = this.f150550L;
            if (velocityTracker == null) {
                this.f150550L = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f150585s = motionEvent.getX();
            this.f150586t = motionEvent.getY();
            super.onTouchEvent(motionEvent);
        } else if (action == 1) {
            this.f150550L.computeCurrentVelocity(1000, this.f150587u);
            int yVelocity = (int) this.f150550L.getYVelocity();
            int xVelocity = this.f150544F.f() ? 0 : (int) this.f150550L.getXVelocity();
            this.f150585s = 0.0f;
            this.f150586t = 0.0f;
            if (Math.abs(yVelocity) < 0 && Math.abs(xVelocity) < 0) {
                VelocityTracker velocityTracker2 = this.f150550L;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f150550L = null;
                }
            } else {
                if (getLayout() == null) {
                    return super.onTouchEvent(motionEvent);
                }
                this.f150548J.fling(getScrollX(), getScrollY(), -xVelocity, -yVelocity, 0, getPaddingRight() + getPaddingLeft() + (getLayout().getWidth() - getWidth()), 0, getPaddingBottom() + getPaddingTop() + (getLayout().getHeight() - getHeight()));
            }
            super.onTouchEvent(motionEvent);
        } else if (action != 2) {
            super.onTouchEvent(motionEvent);
        } else {
            this.f150550L.addMovement(motionEvent);
            this.f150585s = motionEvent.getX();
            this.f150586t = motionEvent.getY();
            super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void p() {
        Editable editableB = B();
        if (editableB != null && !editableB.toString().equals("")) {
            this.f150546H.setPrimaryClip(ClipData.newPlainText("CopiedText", editableB));
            return;
        }
        CodeEditor codeEditor = this.f150545G;
        Context context = this.f150547I;
        int i10 = b.n.f216032v1;
        context.getString(i10);
        codeEditor.getClass();
        C5615d.a(f150537j0, this.f150547I.getString(i10));
    }

    public void p0() {
        float f10 = this.f150542D;
        if (f10 < 10.0f) {
            this.f150542D = 10.0f;
        } else if (f10 > 20.0f) {
            this.f150542D = 20.0f;
        }
    }

    public void q() {
        Editable editableB = B();
        if (editableB != null && !editableB.toString().equals("")) {
            this.f150546H.setPrimaryClip(ClipData.newPlainText("CuttedText", editableB));
            if (getSelectionEnd() > getSelectionStart()) {
                getText().replace(getSelectionStart(), getSelectionEnd(), "");
                return;
            } else {
                getText().replace(getSelectionEnd(), getSelectionStart(), "");
                return;
            }
        }
        CodeEditor codeEditor = this.f150545G;
        Context context = this.f150547I;
        int i10 = b.n.f216037w1;
        context.getString(i10);
        codeEditor.getClass();
        C5615d.a(f150537j0, this.f150547I.getString(i10));
    }

    public void r() {
        int iMin = Math.min(getSelectionStart(), getSelectionEnd());
        int iMax = Math.max(getSelectionStart(), getSelectionEnd());
        if (iMax > iMin) {
            iMax--;
        }
        while (iMax < getText().length() && getText().charAt(iMax) != '\n') {
            iMax++;
        }
        while (iMin > 0 && getText().charAt(iMin - 1) != '\n') {
            iMin--;
        }
        getEditableText().delete(iMin, iMax);
    }

    public void s() {
        int iMin = Math.min(getSelectionStart(), getSelectionEnd());
        int iMax = Math.max(getSelectionStart(), getSelectionEnd());
        if (iMax > iMin) {
            iMax--;
        }
        while (iMax < getText().length() && getText().charAt(iMax) != '\n') {
            iMax++;
        }
        while (iMin > 0 && getText().charAt(iMin - 1) != '\n') {
            iMin--;
        }
        getEditableText().insert(iMax, "\n" + getText().subSequence(iMin, iMax).toString());
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        C5574a c5574a = this.f150558T;
        if (c5574a != null) {
            c5574a.setTextSize(getTextSize());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (isPopupShowing() || !hasFocus()) {
            return;
        }
        super.showDropDown();
    }

    public void t() {
        this.f150582p = 0;
        this.f150557S = new UndoStack();
        this.f150556R = new UndoStack();
        addTextChangedListener(new a());
    }

    public final String[] u(int i10) {
        int i11;
        if (this.f150545G != null) {
            if (this.f150583q.equals("\n") && this.f150577k) {
                String strA = A(i10);
                StringBuilder sb2 = new StringBuilder(strA);
                int length = sb2.length() + i10 + 1;
                if (i10 > 0 && getText().charAt(i10 - 1) == '{') {
                    sb2.append(f150538k0);
                    length = sb2.length() + i10 + 1;
                }
                int i12 = i10 + 1;
                if (i12 < getText().length() && getText().charAt(i12) == '}') {
                    sb2.append("\n");
                    sb2.append(strA);
                }
                String[] strArr = new String[4];
                strArr[1] = sb2.toString();
                strArr[3] = Integer.toString(length);
                return strArr;
            }
            if (this.f150578l && this.f150583q.equals("{")) {
                String[] strArr2 = new String[4];
                strArr2[1] = "}";
                strArr2[3] = Integer.toString(i10 + 1);
                return strArr2;
            }
            if (this.f150578l && this.f150583q.equals("}")) {
                int i13 = i10 + 1;
                if (i13 < getText().length() && getText().charAt(i13) == '}') {
                    String[] strArr3 = new String[4];
                    strArr3[2] = "";
                    strArr3[3] = Integer.toString(i13);
                    return strArr3;
                }
            } else {
                if (this.f150578l && this.f150583q.equals("(")) {
                    String[] strArr4 = new String[4];
                    strArr4[1] = ")";
                    strArr4[3] = Integer.toString(i10 + 1);
                    return strArr4;
                }
                if (this.f150578l && this.f150583q.equals(")")) {
                    int i14 = i10 + 1;
                    if (i14 < getText().length() && getText().charAt(i14) == ')') {
                        String[] strArr5 = new String[4];
                        strArr5[2] = "";
                        strArr5[3] = Integer.toString(i14);
                        return strArr5;
                    }
                } else {
                    if (this.f150578l && this.f150583q.equals("[")) {
                        String[] strArr6 = new String[4];
                        strArr6[1] = "]";
                        strArr6[3] = Integer.toString(i10 + 1);
                        return strArr6;
                    }
                    if (this.f150578l && this.f150583q.equals("]") && (i11 = i10 + 1) < getText().length() && getText().charAt(i11) == ']') {
                        String[] strArr7 = new String[4];
                        strArr7[2] = "";
                        strArr7[3] = Integer.toString(i11);
                        return strArr7;
                    }
                }
            }
        }
        return new String[4];
    }

    @g0
    public void v(String str, boolean z10, boolean z11, boolean z12, Editable editable) {
        Pattern patternCompile;
        if (z11) {
            patternCompile = z10 ? Pattern.compile(str) : Pattern.compile(str, 66);
        } else if (!z12) {
            patternCompile = z10 ? Pattern.compile(Pattern.quote(str)) : Pattern.compile(Pattern.quote(str), 66);
        } else if (z10) {
            patternCompile = Pattern.compile("\\s" + str + "\\s");
        } else {
            patternCompile = Pattern.compile("\\s" + Pattern.quote(str) + "\\s", 66);
        }
        o(editable, false, true, false);
        Matcher matcher = patternCompile.matcher(editable);
        while (matcher.find()) {
            editable.setSpan(new BackgroundColorSpan(this.f150552N.data), matcher.start(), matcher.end(), 33);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(final int r9, final int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f150554P
            if (r0 != 0) goto L1e
            boolean r0 = r8.f150555Q
            if (r0 != 0) goto L1e
            java.lang.String[] r0 = r8.u(r9)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            if (r1 != 0) goto L20
            r3 = r0[r2]
            if (r3 == 0) goto L17
            goto L20
        L17:
            r1 = 2
            r1 = r0[r1]
            if (r1 == 0) goto L1e
        L1c:
            r6 = r1
            goto L43
        L1e:
            r3 = r8
            goto L5f
        L20:
            java.lang.String r3 = ""
            if (r1 == 0) goto L25
            goto L26
        L25:
            r1 = r3
        L26:
            r2 = r0[r2]
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            r2 = r3
        L2c:
            boolean r4 = r1.equals(r3)
            if (r4 == 0) goto L38
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L1e
        L38:
            java.lang.StringBuilder r1 = androidx.compose.runtime.changelist.a.a(r1)
            java.lang.String r3 = r8.f150583q
            java.lang.String r1 = android.support.v4.media.e.a(r1, r3, r2)
            goto L1c
        L43:
            r1 = 3
            r0 = r0[r1]
            if (r0 == 0) goto L4e
            int r0 = java.lang.Integer.parseInt(r0)
        L4c:
            r7 = r0
            goto L54
        L4e:
            int r0 = r6.length()
            int r0 = r0 + r9
            goto L4c
        L54:
            q5.c r2 = new q5.c
            r3 = r8
            r4 = r9
            r5 = r10
            r2.<init>()
            r8.post(r2)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.ahmadaghazadeh.editor.processor.TextProcessor.w(int, int):void");
    }

    public float x(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(1) - motionEvent.getX(0);
        float y10 = motionEvent.getY(1) - motionEvent.getY(0);
        return (float) Math.sqrt((y10 * y10) + (x10 * x10));
    }

    public int y() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    public String z(int i10) {
        LineObject lineObjectI = this.f150545G.o().i(i10);
        if (lineObjectI == null) {
            return "";
        }
        int iD = lineObjectI.d();
        int i11 = iD;
        while (i11 < getText().length()) {
            char cCharAt = getText().charAt(i11);
            if (!Character.isWhitespace(cCharAt) || cCharAt == '\n') {
                break;
            }
            i11++;
        }
        return getText().subSequence(iD, i11).toString();
    }

    public TextProcessor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150566e = true;
        this.f150568f = true;
        this.f150570g = true;
        this.f150572h = true;
        this.f150574i = true;
        this.f150576j = true;
        this.f150577k = true;
        this.f150578l = true;
        this.f150585s = 0.0f;
        this.f150586t = 0.0f;
        this.f150589w = 0;
        this.f150590x = 0;
        this.f150592z = 0;
        this.f150539A = 0;
        this.f150540B = false;
        this.f150554P = false;
        this.f150555Q = false;
        this.f150547I = context;
    }

    public TextProcessor(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f150566e = true;
        this.f150568f = true;
        this.f150570g = true;
        this.f150572h = true;
        this.f150574i = true;
        this.f150576j = true;
        this.f150577k = true;
        this.f150578l = true;
        this.f150585s = 0.0f;
        this.f150586t = 0.0f;
        this.f150589w = 0;
        this.f150590x = 0;
        this.f150592z = 0;
        this.f150539A = 0;
        this.f150540B = false;
        this.f150554P = false;
        this.f150555Q = false;
        this.f150547I = context;
    }
}
