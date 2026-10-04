package K4;

import J4.e;
import J4.f;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.a;
import com.flask.colorpicker.slider.AlphaSlider;
import com.flask.colorpicker.slider.LightnessSlider;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlertDialog.Builder f58394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f58395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorPickerView f58396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LightnessSlider f58397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlphaSlider f58398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f58399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f58400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f58401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f58402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f58403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f58404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f58405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f58407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f58408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer[] f58409p;

    public class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K4.a f58410a;

        public a(K4.a aVar) {
            this.f58410a = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            b.this.l(dialogInterface, this.f58410a);
        }
    }

    /* JADX INFO: renamed from: K4.b$b, reason: collision with other inner class name */
    public class DialogInterfaceOnClickListenerC0066b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K4.a f58412a;

        public DialogInterfaceOnClickListenerC0066b(K4.a aVar) {
            this.f58412a = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            b.this.l(dialogInterface, this.f58412a);
        }
    }

    public b(Context context) {
        this(context, 0);
    }

    public static b C(Context context) {
        return new b(context, 0);
    }

    public static b D(Context context, int i10) {
        return new b(context, i10);
    }

    public static int e(Context context, int i10) {
        return (int) (context.getResources().getDimension(i10) + 0.5f);
    }

    public b A(boolean z10) {
        this.f58401h = z10;
        return this;
    }

    public b B(ColorPickerView.WHEEL_TYPE wheel_type) {
        this.f58396c.y(c.a(wheel_type));
        return this;
    }

    public b b() {
        this.f58401h = false;
        this.f58402i = true;
        return this;
    }

    public AlertDialog c() {
        Context context = this.f58394a.getContext();
        ColorPickerView colorPickerView = this.f58396c;
        Integer[] numArr = this.f58409p;
        colorPickerView.v(numArr, g(numArr).intValue());
        this.f58396c.A(this.f58403j);
        if (this.f58401h) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, e(context, a.e.f149012N0));
            LightnessSlider lightnessSlider = new LightnessSlider(context);
            this.f58397d = lightnessSlider;
            lightnessSlider.setLayoutParams(layoutParams);
            this.f58395b.addView(this.f58397d);
            this.f58396c.x(this.f58397d);
            this.f58397d.j(f(this.f58409p));
            this.f58397d.h(this.f58403j);
        }
        if (this.f58402i) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, e(context, a.e.f149012N0));
            AlphaSlider alphaSlider = new AlphaSlider(context);
            this.f58398e = alphaSlider;
            alphaSlider.setLayoutParams(layoutParams2);
            this.f58395b.addView(this.f58398e);
            this.f58396c.j(this.f58398e);
            this.f58398e.j(f(this.f58409p));
            this.f58398e.h(this.f58403j);
        }
        if (this.f58404k) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            EditText editText = (EditText) View.inflate(context, a.j.f149366C, null);
            this.f58399f = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            this.f58399f.setSingleLine();
            this.f58399f.setVisibility(8);
            this.f58399f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f58402i ? 9 : 7)});
            this.f58395b.addView(this.f58399f, layoutParams3);
            this.f58399f.setText(f.e(f(this.f58409p), this.f58402i));
            this.f58396c.m(this.f58399f);
        }
        if (this.f58405l) {
            LinearLayout linearLayout = (LinearLayout) View.inflate(context, a.j.f149367D, null);
            this.f58400g = linearLayout;
            linearLayout.setVisibility(8);
            this.f58395b.addView(this.f58400g);
            if (this.f58409p.length == 0) {
                ((ImageView) View.inflate(context, a.j.f149368E, null)).setImageDrawable(new ColorDrawable(-1));
            } else {
                int i10 = 0;
                while (true) {
                    Integer[] numArr2 = this.f58409p;
                    if (i10 >= numArr2.length || i10 >= this.f58406m || numArr2[i10] == null) {
                        break;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) View.inflate(context, a.j.f149368E, null);
                    ((ImageView) linearLayout2.findViewById(a.g.f149210B0)).setImageDrawable(new ColorDrawable(this.f58409p[i10].intValue()));
                    this.f58400g.addView(linearLayout2);
                    i10++;
                }
            }
            this.f58400g.setVisibility(0);
            this.f58396c.o(this.f58400g, g(this.f58409p));
        }
        return this.f58394a.create();
    }

    public b d(int i10) {
        this.f58396c.s(i10);
        return this;
    }

    public final int f(Integer[] numArr) {
        return numArr[g(numArr).intValue()].intValue();
    }

    public final Integer g(Integer[] numArr) {
        int i10 = 0;
        int iValueOf = 0;
        while (i10 < numArr.length && numArr[i10] != null) {
            i10++;
            iValueOf = Integer.valueOf(i10 / 2);
        }
        return iValueOf;
    }

    public b h(int i10) {
        this.f58409p[0] = Integer.valueOf(i10);
        return this;
    }

    public b i(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            Integer[] numArr = this.f58409p;
            if (i10 >= numArr.length) {
                break;
            }
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return this;
    }

    public b j() {
        this.f58401h = true;
        this.f58402i = false;
        return this;
    }

    public b k() {
        this.f58401h = false;
        this.f58402i = false;
        return this;
    }

    public final void l(DialogInterface dialogInterface, K4.a aVar) {
        aVar.a(dialogInterface, this.f58396c.h(), this.f58396c.g());
    }

    public b m(int i10) {
        this.f58396c.n(i10);
        return this;
    }

    public b n(int i10, DialogInterface.OnClickListener onClickListener) {
        this.f58394a.setNegativeButton(i10, onClickListener);
        return this;
    }

    public b o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f58394a.setNegativeButton(charSequence, onClickListener);
        return this;
    }

    public b p(J4.d dVar) {
        this.f58396c.a(dVar);
        return this;
    }

    public b q(e eVar) {
        this.f58396c.b(eVar);
        return this;
    }

    public b r(int i10) throws IndexOutOfBoundsException {
        if (i10 < 1 || i10 > 5) {
            throw new IndexOutOfBoundsException("Picker Can Only Support 1-5 Colors");
        }
        this.f58406m = i10;
        if (i10 > 1) {
            this.f58405l = true;
        }
        return this;
    }

    public b s(int i10, K4.a aVar) {
        this.f58394a.setPositiveButton(i10, new DialogInterfaceOnClickListenerC0066b(aVar));
        return this;
    }

    public b t(CharSequence charSequence, K4.a aVar) {
        this.f58394a.setPositiveButton(charSequence, new a(aVar));
        return this;
    }

    public b u(int i10) {
        this.f58394a.setTitle(i10);
        return this;
    }

    public b v(String str) {
        this.f58394a.setTitle(str);
        return this;
    }

    public b w(boolean z10) {
        this.f58402i = z10;
        return this;
    }

    public b x(boolean z10) {
        this.f58403j = z10;
        return this;
    }

    public b y(boolean z10) {
        this.f58404k = z10;
        return this;
    }

    public b z(boolean z10) {
        this.f58405l = z10;
        if (!z10) {
            this.f58406m = 1;
        }
        return this;
    }

    public b(Context context, int i10) {
        this.f58401h = true;
        this.f58402i = true;
        this.f58403j = true;
        this.f58404k = false;
        this.f58405l = false;
        this.f58406m = 1;
        this.f58407n = 0;
        this.f58408o = 0;
        this.f58409p = new Integer[]{null, null, null, null, null};
        this.f58407n = e(context, a.e.f149014O0);
        this.f58408o = e(context, a.e.f149000H0);
        this.f58394a = new AlertDialog.Builder(context, i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f58395b = linearLayout;
        linearLayout.setOrientation(1);
        this.f58395b.setGravity(1);
        LinearLayout linearLayout2 = this.f58395b;
        int i11 = this.f58407n;
        linearLayout2.setPadding(i11, this.f58408o, i11, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        ColorPickerView colorPickerView = new ColorPickerView(context);
        this.f58396c = colorPickerView;
        this.f58395b.addView(colorPickerView, layoutParams);
        this.f58394a.setView(this.f58395b);
    }
}
