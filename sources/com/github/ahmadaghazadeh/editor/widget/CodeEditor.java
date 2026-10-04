package com.github.ahmadaghazadeh.editor.widget;

import Z3.f;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.E;
import androidx.databinding.InterfaceC2511d;
import androidx.lifecycle.P;
import com.github.ahmadaghazadeh.editor.document.commons.LinesCollection;
import com.github.ahmadaghazadeh.editor.keyboard.ExtendedKeyboard;
import com.github.ahmadaghazadeh.editor.processor.TextNotFoundException;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import com.github.ahmadaghazadeh.editor.widget.CodeEditor;
import e.T;
import e.g0;
import k5.b;
import l5.C5146a;
import r5.AbstractC5532d;
import r5.e;
import t5.C5613b;
import t5.InterfaceC5614c;

/* JADX INFO: loaded from: classes3.dex */
public class CodeEditor extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f150605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f150606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f150607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f150608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f150609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextProcessor f150610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC5532d f150611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinesCollection f150612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Editable f150613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC5614c f150614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ExtendedKeyboard f150615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f150616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f150617m;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (CodeEditor.this.f150616l != null) {
                CodeEditor.this.f150616l.a(editable.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f150619a;

        public b(FrameLayout.LayoutParams layoutParams) {
            this.f150619a = layoutParams;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int height = CodeEditor.this.f150605a.getHeight();
            if (CodeEditor.this.f150608d != height) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, height - 100, 0, 0);
                CodeEditor.this.f150615k.setLayoutParams(layoutParams);
                this.f150619a.setMargins(0, 0, 0, 100);
                CodeEditor.this.f150610f.setLayoutParams(this.f150619a);
                CodeEditor.this.f150608d = height;
            }
        }
    }

    public interface c {
        void a(String str);
    }

    public CodeEditor(Context context) {
        super(context);
        this.f150606b = false;
        this.f150607c = false;
        this.f150608d = 0;
        t(context, null);
    }

    @InterfaceC2511d({f.f79422s, "lang", "isReadOnly", "isShowExtendedKeyboard"})
    public static void F(CodeEditor codeEditor, P<String> p10, P<String> p11, boolean z10, boolean z11) {
        if (codeEditor == null) {
            return;
        }
        if (p10 != null) {
            codeEditor.P(p10.f(), 1);
        }
        if (p11 != null) {
            codeEditor.H(e.a(p11.f()));
        }
        codeEditor.K(z10);
        codeEditor.M(Boolean.valueOf(z11));
    }

    public static /* synthetic */ void a(CodeEditor codeEditor, View view, C5146a c5146a) {
        codeEditor.getClass();
        if (!c5146a.b().endsWith("End")) {
            codeEditor.f150610f.getText().insert(codeEditor.f150610f.getSelectionStart(), c5146a.c());
            return;
        }
        String string = codeEditor.f150610f.getText().toString();
        int iIndexOf = string.indexOf("\n", codeEditor.f150610f.getSelectionStart());
        if (iIndexOf == -1) {
            iIndexOf = string.length();
        }
        codeEditor.f150610f.setSelection(iIndexOf);
    }

    public void A(String str, String str2, Runnable runnable) throws TextNotFoundException {
        if (this.f150610f == null || str.equals("") || str2.equals("")) {
            throw new TextNotFoundException();
        }
        this.f150610f.U(str, str2);
        runnable.run();
    }

    public void B(int i10, int i11, Editable editable) {
        C(i10, i11, editable.toString());
    }

    public void C(int i10, int i11, String str) {
        if (this.f150613i == null) {
            this.f150613i = Editable.Factory.getInstance().newEditable("");
        }
        if (i11 >= this.f150613i.length()) {
            i11 = this.f150613i.length();
        }
        int length = str.length() - (i11 - i10);
        int iN = n(i10);
        for (int i12 = i10; i12 < i11; i12++) {
            if (this.f150613i.charAt(i12) == '\n') {
                this.f150612h.n(1 + iN);
            }
        }
        this.f150612h.o(n(i10) + 1, length);
        for (int i13 = 0; i13 < str.length(); i13++) {
            if (str.charAt(i13) == '\n') {
                int i14 = i10 + i13;
                this.f150612h.b(n(i14) + 1, i14 + 1);
            }
        }
        if (i10 > i11) {
            i11 = i10;
        }
        if (i10 > this.f150613i.length()) {
            i10 = this.f150613i.length();
        }
        if (i11 > this.f150613i.length()) {
            i11 = this.f150613i.length();
        }
        if (i10 < 0) {
            i10 = 0;
        }
        this.f150613i.replace(i10, i11 >= 0 ? i11 : 0, str);
        this.f150617m = true;
    }

    public void D() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.selectAll();
    }

    public void E() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.V();
    }

    public final void G(boolean z10) {
        this.f150617m = z10;
    }

    public void H(@Nullable AbstractC5532d abstractC5532d) {
        this.f150611g = abstractC5532d;
    }

    public void I(LinesCollection linesCollection) {
        this.f150612h = linesCollection;
    }

    public void J(c cVar) {
        this.f150616l = cVar;
        this.f150610f.addTextChangedListener(new a());
    }

    public void K(boolean z10) {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor != null) {
            textProcessor.d0(z10);
        }
    }

    public void L(InterfaceC5614c interfaceC5614c) {
        this.f150614j = interfaceC5614c;
    }

    public void M(Boolean bool) {
        ExtendedKeyboard extendedKeyboard = this.f150615k;
        if (extendedKeyboard != null) {
            extendedKeyboard.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    public void N(boolean z10) {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor != null) {
            textProcessor.g0(z10);
        }
    }

    public void O(Editable editable, int i10) {
        if (i10 != 1) {
            B(0, editable != null ? editable.length() : 0, editable);
            this.f150617m = false;
        } else {
            TextProcessor textProcessor = this.f150610f;
            if (textProcessor != null) {
                textProcessor.setText(editable);
            }
        }
    }

    public void P(String str, int i10) {
        if (str != null) {
            O(Editable.Factory.getInstance().newEditable(str), i10);
        } else {
            O(Editable.Factory.getInstance().newEditable(""), i10);
        }
    }

    public void Q(String str, boolean z10) {
    }

    public void R() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.j0();
    }

    public void e() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.p();
    }

    public void f() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.q();
    }

    public void g() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.r();
    }

    public void h() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.s();
    }

    public void i(String str, boolean z10, boolean z11, boolean z12, Runnable runnable) throws TextNotFoundException {
        if (this.f150610f == null || str.equals("")) {
            throw new TextNotFoundException();
        }
        TextProcessor textProcessor = this.f150610f;
        textProcessor.v(str, z10, z11, z12, textProcessor.getEditableText());
        runnable.run();
    }

    public int j(int i10) {
        return i10 == m() + (-1) ? this.f150613i.length() : this.f150612h.h(i10 + 1) - 1;
    }

    public int k(int i10) {
        return this.f150612h.h(i10);
    }

    @Nullable
    @g0
    public AbstractC5532d l() {
        return this.f150611g;
    }

    public int m() {
        return this.f150612h.j();
    }

    public int n(int i10) {
        return this.f150612h.k(i10);
    }

    public LinesCollection o() {
        return this.f150612h;
    }

    public InterfaceC5614c p() {
        return this.f150614j;
    }

    public String q() {
        Editable editable = this.f150613i;
        return editable != null ? editable.toString() : "";
    }

    public TextProcessor r() {
        return this.f150610f;
    }

    public void s(int i10) throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.C(i10);
    }

    public final void t(Context context, AttributeSet attributeSet) {
        String string;
        String string2;
        try {
            this.f150609e = context;
            u();
            string = "";
            string2 = "html";
            this.f150606b = false;
            this.f150607c = false;
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.p.f217083j6, 0, 0);
                int i10 = b.p.f217098k6;
                string = typedArrayObtainStyledAttributes.hasValue(i10) ? typedArrayObtainStyledAttributes.getString(i10) : "";
                int i11 = b.p.f217143n6;
                string2 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getString(i11) : "html";
                this.f150606b = typedArrayObtainStyledAttributes.getBoolean(b.p.f217113l6, false);
                this.f150607c = typedArrayObtainStyledAttributes.getBoolean(b.p.f217128m6, true);
                typedArrayObtainStyledAttributes.recycle();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            FrameLayout frameLayout = new FrameLayout(context);
            this.f150605a = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            GutterView gutterView = new GutterView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams2.gravity = E.f111493b;
            gutterView.setLayoutParams(layoutParams2);
            this.f150605a.addView(gutterView);
            this.f150610f = new TextProcessor(context);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            this.f150610f.setLayoutParams(layoutParams3);
            this.f150610f.setScrollBarStyle(50331648);
            this.f150610f.setGravity(8388659);
            Resources.Theme theme = getContext().getTheme();
            int[] iArr = b.p.If;
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            try {
                this.f150610f.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(b.p.Lf, getResources().getColor(b.f.f215086U)));
                typedArrayObtainStyledAttributes2.recycle();
                typedArrayObtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(attributeSet, iArr, 0, 0);
                try {
                    this.f150610f.setTextColor(typedArrayObtainStyledAttributes2.getColor(b.p.Mf, getResources().getColor(b.f.f215089V)));
                    typedArrayObtainStyledAttributes2.recycle();
                    this.f150610f.setLayerType(1, new TextPaint());
                    this.f150605a.addView(this.f150610f);
                    this.f150610f.D(this);
                    this.f150610f.d0(this.f150606b);
                    FastScrollerView fastScrollerView = new FastScrollerView(context);
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(30, -1);
                    layoutParams4.gravity = 8388613;
                    fastScrollerView.setLayoutParams(layoutParams4);
                    this.f150605a.addView(fastScrollerView);
                    fastScrollerView.g(this.f150610f);
                    gutterView.d(this.f150610f, this.f150612h);
                    LinesCollection linesCollection = new LinesCollection();
                    linesCollection.b(0, 0);
                    H(e.a(string2));
                    P(string, 1);
                    I(linesCollection);
                    z();
                    this.f150610f.t();
                    this.f150615k = new ExtendedKeyboard(context);
                    this.f150605a.getViewTreeObserver().addOnGlobalLayoutListener(new b(layoutParams3));
                    this.f150615k.J(new ExtendedKeyboard.a() { // from class: w5.a
                        @Override // com.github.ahmadaghazadeh.editor.keyboard.ExtendedKeyboard.a
                        public final void a(View view, C5146a c5146a) {
                            CodeEditor.a(this.f240108a, view, c5146a);
                        }
                    });
                    M(Boolean.valueOf(this.f150607c));
                    this.f150605a.addView(this.f150615k);
                    addView(this.f150605a);
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public final void u() {
        this.f150614j = new C5613b(this.f150609e);
        this.f150612h = new LinesCollection();
    }

    public void v(String str, String str2) {
        P(str, 1);
        H(e.a(str2));
    }

    public void w(@NonNull CharSequence charSequence) {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor != null) {
            textProcessor.H(charSequence);
        }
    }

    public void x() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.O();
    }

    public void y() throws TextNotFoundException {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor == null) {
            throw new TextNotFoundException();
        }
        textProcessor.R();
    }

    public void z() {
        TextProcessor textProcessor = this.f150610f;
        if (textProcessor != null) {
            textProcessor.setTextSize(this.f150614j.i());
            this.f150610f.setHorizontallyScrolling(!this.f150614j.f());
            this.f150610f.e0(this.f150614j.z());
            this.f150610f.W(this.f150614j.j());
            this.f150610f.Z(this.f150614j.y());
            this.f150610f.X(this.f150614j.g());
            this.f150610f.c0(this.f150614j.o());
            this.f150610f.b0(this.f150614j.l());
            this.f150610f.a0(this.f150614j.r());
            this.f150610f.T();
            this.f150610f.S();
        }
    }

    public CodeEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150606b = false;
        this.f150607c = false;
        this.f150608d = 0;
        t(context, attributeSet);
    }

    public CodeEditor(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f150606b = false;
        this.f150607c = false;
        this.f150608d = 0;
        t(context, null);
    }

    @T(api = 21)
    public CodeEditor(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f150606b = false;
        this.f150607c = false;
        this.f150608d = 0;
        t(context, null);
    }
}
