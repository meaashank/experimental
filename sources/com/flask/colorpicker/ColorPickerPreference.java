package com.flask.colorpicker;

import J4.c;
import K4.b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.a;

/* JADX INFO: loaded from: classes3.dex */
public class ColorPickerPreference extends Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f148542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f148543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f148544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorPickerView.WHEEL_TYPE f148546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f148547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f148548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f148549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f148550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f148551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f148552k;

    public class a implements K4.a {
        public a() {
        }

        @Override // K4.a
        public void a(DialogInterface dialogInterface, int i10, Integer[] numArr) {
            ColorPickerPreference.this.c(i10);
        }
    }

    public ColorPickerPreference(Context context) {
        super(context);
        this.f148545d = 0;
    }

    public static int a(int i10, float f10) {
        return Color.argb(Color.alpha(i10), Math.max((int) (Color.red(i10) * f10), 0), Math.max((int) (Color.green(i10) * f10), 0), Math.max((int) (Color.blue(i10) * f10), 0));
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.f149870I3);
        try {
            this.f148542a = typedArrayObtainStyledAttributes.getBoolean(a.m.f149879J3, false);
            this.f148543b = typedArrayObtainStyledAttributes.getBoolean(a.m.f149924O3, false);
            this.f148544c = typedArrayObtainStyledAttributes.getBoolean(a.m.f149897L3, true);
            this.f148547f = typedArrayObtainStyledAttributes.getInt(a.m.f149906M3, 8);
            this.f148546e = ColorPickerView.WHEEL_TYPE.indexOf(typedArrayObtainStyledAttributes.getInt(a.m.f149987V3, 0));
            this.f148545d = typedArrayObtainStyledAttributes.getInt(a.m.f149915N3, -1);
            this.f148548g = typedArrayObtainStyledAttributes.getBoolean(a.m.f149960S3, true);
            String string = typedArrayObtainStyledAttributes.getString(a.m.f149978U3);
            this.f148549h = string;
            if (string == null) {
                this.f148549h = "Choose color";
            }
            String string2 = typedArrayObtainStyledAttributes.getString(a.m.f149942Q3);
            this.f148550i = string2;
            if (string2 == null) {
                this.f148550i = "cancel";
            }
            String string3 = typedArrayObtainStyledAttributes.getString(a.m.f149951R3);
            this.f148551j = string3;
            if (string3 == null) {
                this.f148551j = "ok";
            }
            typedArrayObtainStyledAttributes.recycle();
            setWidgetLayoutResource(a.j.f149369F);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c(int i10) {
        if (callChangeListener(Integer.valueOf(i10))) {
            this.f148545d = i10;
            persistInt(i10);
            notifyChanged();
        }
    }

    @Override // android.preference.Preference
    public void onBindView(@NonNull View view) {
        super.onBindView(view);
        int iA = isEnabled() ? this.f148545d : a(this.f148545d, 0.5f);
        ImageView imageView = (ImageView) view.findViewById(a.g.f149305k0);
        this.f148552k = imageView;
        Drawable drawable = imageView.getDrawable();
        c cVar = (drawable == null || !(drawable instanceof c)) ? null : (c) drawable;
        if (cVar == null) {
            cVar = new c(iA);
        }
        this.f148552k.setImageDrawable(cVar);
    }

    @Override // android.preference.Preference
    public void onClick() {
        b bVarC = b.C(getContext());
        bVarC.f58394a.setTitle(this.f148549h);
        bVarC.h(this.f148545d);
        bVarC.f58403j = this.f148544c;
        bVarC.B(this.f148546e);
        bVarC.d(this.f148547f);
        bVarC.f58404k = this.f148548g;
        bVarC.t(this.f148551j, new a());
        bVarC.o(this.f148550i, null);
        boolean z10 = this.f148542a;
        if (!z10 && !this.f148543b) {
            bVarC.k();
        } else if (!z10) {
            bVarC.j();
        } else if (!this.f148543b) {
            bVarC.b();
        }
        bVarC.c().show();
    }

    @Override // android.preference.Preference
    public void onSetInitialValue(boolean z10, Object obj) {
        c(z10 ? getPersistedInt(0) : ((Integer) obj).intValue());
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148545d = 0;
        b(context, attributeSet);
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f148545d = 0;
        b(context, attributeSet);
    }
}
