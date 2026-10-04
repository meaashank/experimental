package com.prism.hider.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: renamed from: com.prism.hider.ui.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class DialogC4230q extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f168280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f168281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f168282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f168283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f168284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f168285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f168286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f168287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CheckBox f168288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f168289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DialogInterface.OnClickListener f168290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DialogInterface.OnClickListener f168291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DialogInterface.OnClickListener f168292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f168293n;

    /* JADX INFO: renamed from: com.prism.hider.ui.q$a */
    public interface a {
        void a(boolean z10);
    }

    public DialogC4230q(@NonNull Context context) {
        super(context);
        a();
    }

    public final void a() {
        requestWindowFeature(1);
        setContentView(getLayoutInflater().inflate(R.layout.hider_dialog_app_operation, (ViewGroup) null));
        this.f168280a = (TextView) findViewById(R.id.tv_import_app_title);
        this.f168281b = (TextView) findViewById(R.id.tv_import_app_desc);
        this.f168284e = (TextView) findViewById(R.id.bt_confirm);
        this.f168285f = (TextView) findViewById(R.id.bt_cancel);
        this.f168286g = (ImageView) findViewById(R.id.bt_import_app_close);
        this.f168282c = (ImageView) findViewById(R.id.iv_import_app_icon1);
        this.f168283d = (ImageView) findViewById(R.id.iv_import_app_icon2);
        this.f168287h = (TextView) findViewById(R.id.tv_not_next_time);
        this.f168288i = (CheckBox) findViewById(R.id.cb_not_next_time);
        this.f168289j = (LinearLayout) findViewById(R.id.ll_not_next_time);
        setCancelable(false);
        this.f168286g.setOnClickListener(new View.OnClickListener() { // from class: com.prism.hider.ui.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168273a.b(view);
            }
        });
        this.f168284e.setOnClickListener(new View.OnClickListener() { // from class: com.prism.hider.ui.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168275a.c(view);
            }
        });
        this.f168285f.setOnClickListener(new View.OnClickListener() { // from class: com.prism.hider.ui.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168277a.d(view);
            }
        });
    }

    public void b(View view) {
        DialogInterface.OnClickListener onClickListener = this.f168291l;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
    }

    public void c(View view) {
        DialogInterface.OnClickListener onClickListener = this.f168290k;
        if (onClickListener != null) {
            onClickListener.onClick(this, -1);
        }
        a aVar = this.f168293n;
        if (aVar != null) {
            aVar.a(this.f168288i.isChecked());
        }
    }

    public void d(View view) {
        DialogInterface.OnClickListener onClickListener = this.f168292m;
        if (onClickListener != null) {
            onClickListener.onClick(this, -3);
        }
    }

    public void e(String str) {
        this.f168284e.setText(str.trim());
    }

    public void f(String str) {
        this.f168281b.setVisibility(0);
        this.f168281b.setText(str.trim());
    }

    public void g(Drawable drawable) {
        this.f168282c.setImageDrawable(drawable);
        this.f168283d.setImageDrawable(drawable);
    }

    public void h(String str, boolean z10, a aVar) {
        this.f168293n = aVar;
        this.f168289j.setVisibility(0);
        this.f168288i.setChecked(z10);
        this.f168287h.setText(str);
    }

    public void i(DialogInterface.OnClickListener onClickListener) {
        this.f168291l = onClickListener;
    }

    public void j(DialogInterface.OnClickListener onClickListener) {
        this.f168290k = onClickListener;
    }

    public void k(DialogInterface.OnClickListener onClickListener) {
        this.f168285f.setVisibility(0);
        this.f168292m = onClickListener;
    }

    public void l(String str) {
        this.f168285f.setText(str.trim());
    }

    public void m(String str) {
        this.f168280a.setText(str.trim());
    }

    public DialogC4230q(@NonNull Context context, int i10) {
        super(context, i10);
        a();
    }

    public DialogC4230q(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        a();
    }
}
