package x6;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c6.C2947b;

/* JADX INFO: renamed from: x6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class DialogC5792c extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f240508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f240509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f240510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f240511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f240512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f240513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f240514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f240515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CheckBox f240516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DialogInterface.OnClickListener f240517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DialogInterface.OnClickListener f240518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f240519l;

    /* JADX INFO: renamed from: x6.c$a */
    public interface a {
        void a(boolean z10);
    }

    public DialogC5792c(@NonNull Context context) {
        super(context);
        c();
    }

    public final void c() {
        requestWindowFeature(1);
        View viewInflate = getLayoutInflater().inflate(C2947b.k.f129422S, (ViewGroup) null);
        setContentView(viewInflate);
        setCancelable(false);
        this.f240508a = (ImageView) viewInflate.findViewById(C2947b.h.f128905C0);
        this.f240509b = (TextView) viewInflate.findViewById(C2947b.h.f128911C6);
        this.f240510c = (TextView) viewInflate.findViewById(C2947b.h.f128903B6);
        this.f240511d = (TextView) viewInflate.findViewById(C2947b.h.f128927E6);
        this.f240512e = (TextView) viewInflate.findViewById(C2947b.h.f128919D6);
        this.f240513f = (TextView) viewInflate.findViewById(C2947b.h.f128897B0);
        this.f240514g = (LinearLayout) viewInflate.findViewById(C2947b.h.f128931F2);
        this.f240515h = (TextView) viewInflate.findViewById(C2947b.h.f128935F6);
        this.f240516i = (CheckBox) viewInflate.findViewById(C2947b.h.f128929F0);
        this.f240508a.setOnClickListener(new View.OnClickListener() { // from class: x6.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f240506a.d(view);
            }
        });
        this.f240513f.setOnClickListener(new View.OnClickListener() { // from class: x6.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f240507a.e(view);
            }
        });
    }

    public final void d(View view) {
        DialogInterface.OnClickListener onClickListener = this.f240518k;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
    }

    public final void e(View view) {
        DialogInterface.OnClickListener onClickListener = this.f240517j;
        if (onClickListener != null) {
            onClickListener.onClick(this, -1);
        }
        a aVar = this.f240519l;
        if (aVar != null) {
            aVar.a(this.f240516i.isChecked());
        }
    }

    public void f(int i10) {
        this.f240510c.setText(i10);
    }

    public void g(String str) {
        this.f240510c.setText(str);
    }

    public void h(int i10) {
        if (i10 == 0) {
            this.f240509b.setVisibility(8);
        } else {
            this.f240509b.setVisibility(0);
            this.f240509b.setText(i10);
        }
    }

    public void i(String str) {
        if (str == null) {
            this.f240509b.setVisibility(8);
        } else {
            this.f240509b.setVisibility(0);
            this.f240509b.setText(str);
        }
    }

    public void j(int i10, int i11) {
        if (i10 == 0) {
            this.f240511d.setVisibility(8);
        } else {
            this.f240511d.setVisibility(0);
            this.f240511d.setText(i10);
        }
        if (i11 == 0) {
            this.f240512e.setVisibility(8);
        } else {
            this.f240512e.setVisibility(0);
            this.f240512e.setText(i11);
        }
    }

    public void k(String str, String str2) {
        if (str == null) {
            this.f240511d.setVisibility(8);
        } else {
            this.f240511d.setVisibility(0);
            this.f240511d.setText(str);
        }
        if (str2 == null) {
            this.f240512e.setVisibility(8);
        } else {
            this.f240512e.setVisibility(0);
            this.f240512e.setText(str2);
        }
    }

    public void l(int i10) {
        this.f240511d.setTextColor(i10);
        this.f240512e.setTextColor(i10);
    }

    public void m(String str, boolean z10, a aVar) {
        this.f240519l = aVar;
        this.f240514g.setVisibility(0);
        this.f240516i.setChecked(z10);
        this.f240515h.setText(str);
    }

    public void n(DialogInterface.OnClickListener onClickListener) {
        this.f240518k = onClickListener;
    }

    public void o(DialogInterface.OnClickListener onClickListener) {
        this.f240517j = onClickListener;
    }

    public DialogC5792c(@NonNull Context context, int i10) {
        super(context, i10);
        c();
    }

    public DialogC5792c(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        c();
    }
}
